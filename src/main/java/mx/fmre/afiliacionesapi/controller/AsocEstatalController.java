package mx.fmre.afiliacionesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.fmre.afiliacionesapi.entity.AsocEstatal;
import mx.fmre.afiliacionesapi.service.AsocEstatalService;

@RestController
@RequestMapping("/asocestatal")
public class AsocEstatalController {

	@Autowired
	AsocEstatalService asocEstatalService;

	@GetMapping
	public List<AsocEstatal> findAll() {
		return asocEstatalService.findAll();
	}
}
