/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOFacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOFacultadAcademica;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public class BOFacultadAcademica {
    private IDAOFacultadAcademica daoFacultad;
    
    public BOFacultadAcademica(){
        daoFacultad= new DAOFacultadAcademica();
    }
    
     public List<FacultadAcademica> listarFacultad() throws Exception {
      return daoFacultad.listarFacultad();
     }
}
