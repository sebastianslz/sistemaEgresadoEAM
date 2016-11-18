package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import javax.persistence.EntityManager;


import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOEgresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOEgresado implements IDAOEgresado {

	/**
	 * Este metodo registra un egresado
	 */
	public void crear(Egresado egresado, InformacionAcademica infor) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(egresado);
		em.persist(infor);
		em.getTransaction().commit();
		
	}
	/**
	 * Este metodo edita un egresado
	 */
	public void editar(Egresado egresado, InformacionAcademica infor) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(egresado);
                em.merge(infor);
		em.getTransaction().commit();
	}

	public Egresado buscar(int codigo) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		return em.find(Egresado.class, codigo);
	}

}
