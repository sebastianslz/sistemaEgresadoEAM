package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="T_CIUDAD")
@NamedQueries({ @NamedQuery(name= Ciudad.CONSULTA_CIUDAD_POR_DEPARTAMENTO,query = "SELECT ciu FROM Ciudad ciu "
        + "where ciu.departamento=?1")
})
public class Ciudad implements Serializable {
	public static final String CONSULTA_CIUDAD_POR_DEPARTAMENTO="Ciudad.listarciudadpordepartamento";
	
	
	@Id
	@Column(name="ID_CIUDAD")
	private int codigoCiudad;
	
		
	@Column(name="CIUDAD")
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name="ID_DEPARTAMENTO", nullable=false)
	private Departamento departamento;
	
	public Ciudad(){
		
	}

	public int getCodigoCiudad() {
		return codigoCiudad;
	}

	public void setCodigoCiudad(int codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return ciudad;
	}
	
	
	
	
	
	
	
}
