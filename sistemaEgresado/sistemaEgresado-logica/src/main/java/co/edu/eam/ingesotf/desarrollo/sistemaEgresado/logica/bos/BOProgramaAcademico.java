/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOProgramaAcademici;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOProgramaAcademico;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public class BOProgramaAcademico {
    private IDAOProgramaAcademici daoProgramaAca;
    
    public BOProgramaAcademico(){
        daoProgramaAca= new DAOProgramaAcademico();
    }
    
     public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad) throws Exception {
       return  daoProgramaAca.listarPrograma(facultad);
     }
    
}
