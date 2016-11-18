package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOEmpresa implements IDAOEmpresa {

	public void crear(Empresa empresa, ContactoEmpresa contacto) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(empresa);
                em.persist(contacto);
		em.getTransaction().commit();
		
	}

	public void editar(Empresa empresa, ContactoEmpresa contacto) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(empresa);
                em.merge(contacto);
		em.getTransaction().commit();
		
	}

	public Empresa buscar(int nit) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
                return em.find(Empresa.class, nit);
	}

}
