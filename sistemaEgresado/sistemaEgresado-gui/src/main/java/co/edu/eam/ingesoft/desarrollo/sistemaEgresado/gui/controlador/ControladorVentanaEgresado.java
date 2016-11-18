package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.gui.controlador;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEgresado;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOFacultadAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOProgramaAcademico;

/**
 * Clase responsable de controlar la ventana egresado
 * @author Sebastian
 *
 */
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
    
    /**
     * Metodo que lista las facultades academicas
     * @return
     * @throws Exception
     */
    public List<FacultadAcademica> listarFacultad() throws Exception {
        return boFacultad.listarFacultad();
     }
    
    /**
     * Metodo que lista los programas academicos
     * @param facultad, facultad a la que pertenece el programa academico
     * @return
     * @throws Exception
     */
    public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad) throws Exception {
        return boProg.listarPrograma(facultad);
    }
    
    /**
     * Metodo que edita la informacion de un egresado
     * @param egresado
     * @param infor
     * @throws Exception
     */
    public void editar(Egresado egresado, InformacionAcademica infor) throws Exception {
        boEgresado.editar(egresado, infor);
    }
}
