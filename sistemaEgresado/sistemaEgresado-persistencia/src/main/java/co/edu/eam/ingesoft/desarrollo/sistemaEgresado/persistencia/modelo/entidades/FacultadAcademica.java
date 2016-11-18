package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_FACULTAD")
public class FacultadAcademica implements Serializable {
	
	@Id
	@Column(name = "ID_FACULTAD")
	private int codigoFacultad;
	
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	public FacultadAcademica(){
		
	}
	public FacultadAcademica(int codigoFacultad, String facultad) {
		
		this.codigoFacultad = codigoFacultad;
		this.facultad = facultad;
	}
	
	public int getCodigoFacultad() {
		return codigoFacultad;
	}
	public void setCodigoFacultad(int codigoFacultad) {
		this.codigoFacultad = codigoFacultad;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
        
        @Override
    public String toString() {
        return facultad;
    }

    @Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof FacultadAcademica) {
			FacultadAcademica prog = (FacultadAcademica) arg0;
			if (prog.codigoFacultad==(codigoFacultad)) {
				return true;
			}
		}
		return false;
	}
	
}
