package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOCiudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOCiudad  implements IDAOCiudad {
	
	/**
	 * 
	 */
	public List<Ciudad> listarCiudades(Departamento departamento) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
        Query query = em.createNamedQuery(Ciudad.CONSULTA_CIUDAD_POR_DEPARTAMENTO);
        query.setParameter(1, departamento);
        return query.getResultList();
	}

}
