package mx.fmre.afiliacionesapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.fmre.afiliacionesapi.entity.AsocEstatal;
import mx.fmre.afiliacionesapi.repository.AsocEstatalRepository;
import mx.fmre.afiliacionesapi.service.AsocEstatalService;

@Service
public class AsocEstatalServiceImpl implements AsocEstatalService {

	@Autowired
	private AsocEstatalRepository asocEstatalRepository;

	@Override
	public List<AsocEstatal> findAll() {
		return asocEstatalRepository.findAll();
	}
}
