package mx.fmre.afiliacionesapi.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import mx.fmre.afiliacionesapi.entity.AsocEstatal;

public interface AsocEstatalRepository extends Repository<AsocEstatal, String> {
	public List<AsocEstatal> getAll();
}
