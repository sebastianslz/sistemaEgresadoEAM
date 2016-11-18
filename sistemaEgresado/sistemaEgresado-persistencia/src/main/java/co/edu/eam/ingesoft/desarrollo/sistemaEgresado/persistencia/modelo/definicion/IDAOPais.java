package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import java.util.List;


import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;

/**
 * Interface que realiza las operaciones de un pais
 * @author Sebastian
 *
 */
public interface IDAOPais {

	public List<Pais> listarPais()throws Exception;
}
