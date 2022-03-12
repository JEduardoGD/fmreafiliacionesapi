package mx.fmre.afiliacionesapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AsocEstatal {
	@Id
	private String estado;
	private String asociacionEstatal;
	private String nomEstado;
}
