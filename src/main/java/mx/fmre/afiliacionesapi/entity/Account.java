package mx.fmre.afiliacionesapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "accounts")
@Data
public class Account {
	@Id
	private String idu;
	private String indicativo;
	private String categoria;
	private String id;
	private String nombre;
	private String apellido;
	private String estado;
	private String foto;
	private String notas;
	private String inicio;
	private String termino;
	private String codeqr;
	private String locacion;
	private int deleted;
}
