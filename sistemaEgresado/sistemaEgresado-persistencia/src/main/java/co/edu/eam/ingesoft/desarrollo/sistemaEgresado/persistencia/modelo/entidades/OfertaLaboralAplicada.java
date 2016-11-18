package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_OFERTAAPLICADA_EGRE")
@IdClass(OfertaAplicadaPK.class)
public class OfertaLaboralAplicada implements Serializable {
	/* Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EGRESADO")
	private Egresado egresado;
	
	/* Area de interes */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_OFERTA")
	private OfertaLaboral ofertaLaboral;

	public OfertaLaboralAplicada(){
		
	}
	
	public OfertaLaboralAplicada(Egresado egresado, OfertaLaboral ofertaLaboral) {
		super();
		this.egresado = egresado;
		this.ofertaLaboral = ofertaLaboral;
	}

	public Egresado getEgresado() {
		return egresado;
	}

	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	public OfertaLaboral getOfertaLaboral() {
		return ofertaLaboral;
	}

	public void setOfertaLaboral(OfertaLaboral ofertaLaboral) {
		this.ofertaLaboral = ofertaLaboral;
	}
}
