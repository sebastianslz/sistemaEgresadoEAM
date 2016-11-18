/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import java.util.List;

/**
 *Interface que realzia las operaciones de un programa academico
 * @author Cristian Sinisterra
 */
public interface IDAOProgramaAcademici {
    public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad)throws Exception;
    
    public void crear (ProgramaAcademica programa)throws Exception;
}
