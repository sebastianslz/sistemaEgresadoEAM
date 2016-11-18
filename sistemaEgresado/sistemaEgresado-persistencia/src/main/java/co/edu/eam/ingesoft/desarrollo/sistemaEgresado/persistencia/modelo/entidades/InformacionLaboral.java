package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.enumeraciones.SituacionActual;



@Entity
@Table(name="T_INFO_LABORAL")
public class InformacionLaboral implements Serializable {

	@Id
	@Column(name = "ID_EGRESADO")
	private int codigoEgresado;
		
	
	
	@OneToOne()
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	private Egresado egresado;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="SITUACION_ACTUAL")
	private SituacionActual situacionActual;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INGRESO", nullable=false)
	private Date fechaIngreso;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_SALIDA", nullable=false)
	private Date fechaSalida;
	
	
	@Column(name="CARGO", nullable=false)
	private String cargo;
	
	public  InformacionLaboral(){
		
	}
}
