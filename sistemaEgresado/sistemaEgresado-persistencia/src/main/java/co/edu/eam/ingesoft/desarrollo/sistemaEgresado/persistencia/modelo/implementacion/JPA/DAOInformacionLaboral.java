package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOInformacionLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOInformacionLaboral implements IDAOInformacionLaboral {

	public void crear(InformacionLaboral iformacionLaboral) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(iformacionLaboral);
		em.getTransaction().commit();
		
	}

	public void editar(InformacionLaboral iformacionLaboral) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(iformacionLaboral);
		em.getTransaction().commit();		
	}

	public InformacionLaboral buscar(int codigo) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		return em.find(InformacionLaboral.class, codigo);
	}

}
