package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="T_OFERTALABORAL")
public class OfertaLaboral implements Serializable {
	@Id
	@Column(name="ID_OFERTA")
	private int id;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_EMPRESA")
	private Empresa empresa;
	
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_CIUDAD")
	private Ciudad ciudad;
	
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="ID_AREA")
	private AreaInteres AreaInteres;
	
	
	@Column(name="RESUMEN", nullable=false)
	private String resumen;
	
	
	@Column(name="CARGO", nullable=false)
	private String cargo;
	
	
	@Column(name="SALARIO", nullable=true)
	private double salario;
	
	
	@Column(name="DESCRIPCION", nullable=false)
	private String descripcion;
	
	
	@Column(name="REQUERIMIENTOS", nullable=false)
	private String requerimientos;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_APERTURA", nullable=false)
	private Date fechaApertura;

	
	@Column(name="ESTADO", nullable=false)
	private boolean estado;
	
	public OfertaLaboral() {
		
	}
}
