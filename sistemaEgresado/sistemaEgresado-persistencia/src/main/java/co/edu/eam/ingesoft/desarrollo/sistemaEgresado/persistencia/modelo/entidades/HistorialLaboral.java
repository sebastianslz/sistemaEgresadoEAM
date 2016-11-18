package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_HIST_LABORAL")
@IdClass(HistorialLaboralPK.class) 
public class HistorialLaboral implements Serializable{
	
	/* Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EGRESADO")
	private InformacionLaboral informacionLaboral;
	
	/* Empresa en la que ha trabajado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EMPRESA")
	private Empresa empresa;

	public HistorialLaboral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistorialLaboral(InformacionLaboral informacionLaboral, Empresa empresa) {
		super();
		this.informacionLaboral = informacionLaboral;
		this.empresa = empresa;
	}

	public InformacionLaboral getInformacionLaboral() {
		return informacionLaboral;
	}

	public void setInformacionLaboral(InformacionLaboral informacionLaboral) {
		this.informacionLaboral = informacionLaboral;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
