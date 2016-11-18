package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_AREAS_EGRESADO")
public class AreaInteres implements Serializable {
	
	@Id
	@Column(name="ID_AREA")
	private  int codigoAreainteres;
	
		

	@Column(name="nombre")
	private String nombre;
	public AreaInteres(){
		
	}
	
	public AreaInteres(int codigoAreainteres, String nombre) {
		super();
		this.codigoAreainteres = codigoAreainteres;
		this.nombre = nombre;
	}
	
	public int getCodigoAreainteres() {
		return codigoAreainteres;
	}

	public void setCodigoAreainteres(int codigoAreainteres) {
		this.codigoAreainteres = codigoAreainteres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
