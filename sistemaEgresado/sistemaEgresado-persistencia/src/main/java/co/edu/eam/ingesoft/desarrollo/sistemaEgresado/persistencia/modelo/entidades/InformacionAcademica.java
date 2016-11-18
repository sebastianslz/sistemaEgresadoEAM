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

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.enumeraciones.NivelAcademico;



@Entity
@Table(name="T_INFO_ACADEMICA")
public class InformacionAcademica implements Serializable{

	@Id
	@Column(name = "ID_EGRESADO")
	private Integer codigoEgresado;
	
	@OneToOne()
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	@MapsId
	private Egresado egresado;

    

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getNumeroDiploma() {
        return numeroDiploma;
    }

    public void setNumeroDiploma(String numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_GRADO", nullable=false)
	private Date fechaGrado;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="NIVEL_ACADEMICO", nullable=false)
	private NivelAcademico nivelAcademico;
	
	
	@Column(name="NUMERO_DIPLOMA", nullable=false)
	private String numeroDiploma;
	
	public  InformacionAcademica(){
		
	}

    public InformacionAcademica(int codigoEgresado, Date fechaGrado, NivelAcademico nivelAcademico, String numeroDiploma) {
        this.codigoEgresado = codigoEgresado;
        this.fechaGrado = fechaGrado;
        this.nivelAcademico = nivelAcademico;
        this.numeroDiploma = numeroDiploma;
    }
        
        
    
    
    public Integer getCodigoEgresado() {
        return codigoEgresado;
    }

    public void setCodigoEgresado(Integer codigoEgresado) {
        this.codigoEgresado = codigoEgresado;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Date getFechaGrado() {
        return fechaGrado;
    }

    public void setFechaGrado(Date fechaGrado) {
        this.fechaGrado = fechaGrado;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }
}
