package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOContacto;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOContacto implements IDAOContacto {

	public void crear(ContactoEmpresa contactoEmpresa) throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(contactoEmpresa);
		em.getTransaction().commit();
		
	}

    public ContactoEmpresa buscar(int codigo) throws Exception {
        EntityManager em= AdministradorEntetyManager.getEntityManager();
        return em.find(ContactoEmpresa.class, codigo);
    }

}
