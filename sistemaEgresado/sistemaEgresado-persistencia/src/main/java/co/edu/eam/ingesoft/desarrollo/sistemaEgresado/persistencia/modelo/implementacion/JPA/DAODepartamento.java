package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAODepartamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;

public class DAODepartamento implements IDAODepartamento{

	public List<Departamento> listarDepartamento(Pais pais) throws Exception {
	EntityManager em= AdministradorEntetyManager.getEntityManager();
        Query query = em.createNamedQuery(Departamento.CONSULTA_DEPARTAMENTO_POR_PAIS);
        query.setParameter(1, pais);
        return query.getResultList();
	}

}
