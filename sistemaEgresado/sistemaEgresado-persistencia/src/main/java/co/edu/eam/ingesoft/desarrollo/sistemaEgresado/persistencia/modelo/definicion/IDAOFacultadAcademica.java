/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public interface IDAOFacultadAcademica {
    /**
	 * lista la facultades academicas de la universidad
	 * @return la lista de facultades
	 * @throws Exception
	 */
	public List<FacultadAcademica> listarFacultad()throws Exception;
	
	public void crear(FacultadAcademica facultad)throws Exception;
	
	
}
