/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOProgramaAcademici;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.FacultadAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ProgramaAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Cristian Sinisterra
 */
public class DAOProgramaAcademico implements IDAOProgramaAcademici{

    public List<ProgramaAcademica> listarPrograma(FacultadAcademica facultad) throws Exception {
        EntityManager em= AdministradorEntetyManager.getEntityManager();
        Query query = em.createNamedQuery(ProgramaAcademica.CONSULTA_PROGRAMA_POR_FACULTAD);
        query.setParameter(1, facultad);
        System.out.println(query);
        return query.getResultList();
    }
    
    public void crear(ProgramaAcademica programa)throws Exception{
    	EntityManager em= AdministradorEntetyManager.getEntityManager();
    	em.getTransaction().begin();
    	em.persist(programa);
    	em.getTransaction().commit();
    }
}
