package mx.fmre.afiliacionesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import mx.fmre.afiliacionesapi.entity.AsocEstatal;
import mx.fmre.afiliacionesapi.service.AsocEstatalService;

@Controller
public class AsocEstatalController {

	@Autowired
	AsocEstatalService asocEstatalService;

	public List<AsocEstatal> findAll() {
		return asocEstatalService.findAll();
	}
}
