package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOPais;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAOPais implements IDAOPais {

	public List<Pais> listarPais() throws Exception {
		EntityManager em= AdministradorEntetyManager.getEntityManager();
		String sql="SELECT pais from Pais pais";
		Query q= em.createQuery(sql);
		List<Pais> lista= q.getResultList();
		System.out.println(lista.size());
		return lista;
		
	}

}
