/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOSectorLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.utilidades.AdministradorEntetyManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Cristian Sinisterra
 */
public class DAOSectorLaboral implements IDAOSectorLaboral{

    public List<SectorLaboral> listarSectorLaboral() throws Exception {
        EntityManager em= AdministradorEntetyManager.getEntityManager();
		String sql="SELECT sector from SectorLaboral sector";
		Query q= em.createQuery(sql);
		List<SectorLaboral> lista= q.getResultList();
		
		return lista;
		
	}
    
    
}
