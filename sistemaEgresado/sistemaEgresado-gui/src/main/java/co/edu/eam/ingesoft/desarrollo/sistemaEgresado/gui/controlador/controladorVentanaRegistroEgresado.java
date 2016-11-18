/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.gui.controlador;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEgresado;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOFacultadAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOProgramaAcademico;
import java.util.List;

/**
 *Clase responsable de controlar la ventana registro egresado
 * @author Cristian Sinisterra
 */
public class controladorVentanaRegistroEgresado {
    private BOEgresado boEgresado;
    private BOInformacionAcademica boInformacionAca;
    private BOFacultadAcademica boFacultad;
    private BOProgramaAcademico boProg;
    
    public controladorVentanaRegistroEgresado(){
        boEgresado= new BOEgresado();
        boInformacionAca=new BOInformacionAcademica();
        boFacultad= new BOFacultadAcademica();
        boProg= new BOProgramaAcademico();
        
    }
    
    /**
     * Metodo para listar las facultades
     * @return
     * @throws Exception
     */
    public List<FacultadAcademica> listarFacultad() throws Exception {
       return boFacultad.listarFacultad();
    }
    
    /**
     * Metodo para crear la informacion academica de un egresado
     * @param egresado
     * @param infor
     * @throws Exception
     */
    public void crear(Egresado egresado, InformacionAcademica infor)throws Exception{
        boEgresado.crearEgresado(egresado, infor);
    }
    
   
    /**
     * Metodo para listar los programas academicos
     * @param facultad, facultad del programa academico
     * @return
     * @throws Exception
     */
     public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad) throws Exception {
         return boProg.listarPrograma(facultad);
     }
}
