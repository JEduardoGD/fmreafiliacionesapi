package mx.fmre.afiliacionesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.fmre.afiliacionesapi.entity.AsocEstatal;

public interface AsocEstatalRepository extends JpaRepository<AsocEstatal, String> {
	public List<AsocEstatal> findAll();
}
