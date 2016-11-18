/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOFacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Cristian Sinisterra
 */
public class DAOFacultadAcademica implements IDAOFacultadAcademica{

    public List<FacultadAcademica> listarFacultad() throws Exception {
      EntityManager em= AdministradorEntetyManager.getEntityManager();
		String sql="SELECT facultad from FacultadAcademica facultad";
		Query q= em.createQuery(sql);
		List<FacultadAcademica> lista= q.getResultList();
		System.out.println(lista.size());
		return lista;
    }
    
}
