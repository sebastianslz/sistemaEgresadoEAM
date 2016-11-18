package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOInformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOInformacionAcademica implements IDAOInformacionAcademica {

	/**
	 * Crear informacion academica que tiene el egresado
	 */
	public void crear(InformacionAcademica informacion) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(informacion);
		em.getTransaction().commit();
		
	}
	
	/**
	 * Editar informacion academica del egresado
	 */
	public void editar(InformacionAcademica informacion) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(informacion);
		em.getTransaction().commit();
	}
	
	/**
	 * Busca la informacion academica del egresado
	 */
	public InformacionAcademica buscar(int codigo) throws Exception {
            	EntityManager em= AdministradorEntetyManager.getEntityManager();
		return em.find(InformacionAcademica.class, codigo);
	}

}
