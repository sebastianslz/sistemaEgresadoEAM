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
@Table(name="T_PROGRAMA")
@NamedQueries({ @NamedQuery(name= ProgramaAcademica.CONSULTA_PROGRAMA_POR_FACULTAD,query = "SELECT progra FROM ProgramaAcademica progra "
        + "where progra.facultad=?1")
})
public class ProgramaAcademica implements Serializable {
	
     public static final String CONSULTA_PROGRAMA_POR_FACULTAD="ProgramaAcademica.listarprogramaporfacultad";
    
	@Id
	@Column(name="ID_PROGRAMA")
	private int codigoPrograma;
	
	@Column(name="PROGRAMA")
	private String programa;
	
	@ManyToOne
	@JoinColumn(name="ID_FACULTAD", nullable=false)
	private FacultadAcademica facultad;

	public ProgramaAcademica(){
		
	}
	
	public int getCodigoPrograma() {
		return codigoPrograma;
	}
	public void setCodigoPrograma(int codigoPrograma) {
		this.codigoPrograma = codigoPrograma;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public FacultadAcademica getFacultad() {
		return facultad;
	}
	public void setFacultad(FacultadAcademica facultad) {
		this.facultad = facultad;
	}
	
public ProgramaAcademica(int codigoPrograma, String programa, FacultadAcademica facultad) {
		
		this.codigoPrograma = codigoPrograma;
		this.programa = programa;
		this.facultad = facultad;
	}

    @Override
    public String toString() {
        return programa;
    }

//    @Override
//	public boolean equals(Object arg0) {
//		if (arg0 instanceof ProgramaAcademica) {
//			ProgramaAcademica prog = (ProgramaAcademica) arg0;
//			if (prog.codigoPrograma==(codigoPrograma)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
}
