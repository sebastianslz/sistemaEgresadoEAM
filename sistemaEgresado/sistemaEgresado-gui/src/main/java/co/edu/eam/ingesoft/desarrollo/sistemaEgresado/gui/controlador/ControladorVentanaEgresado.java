package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.gui.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEgresado;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOFacultadAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOProgramaAcademico;

public class ControladorVentanaEgresado {
	private BOEgresado boEgresado;
    private BOInformacionAcademica boInformacionAca;
    private BOFacultadAcademica boFacultad;
    private BOProgramaAcademico boProg;
    
    public ControladorVentanaEgresado(){
    	boEgresado= new BOEgresado();
        boInformacionAca=new BOInformacionAcademica();
        boFacultad= new BOFacultadAcademica();
        boProg= new BOProgramaAcademico();
    }
    
    public List<FacultadAcademica> listarFacultad() throws Exception {
        return boFacultad.listarFacultad();
     }
    
    public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad) throws Exception {
        return boProg.listarPrograma(facultad);
    }
}
