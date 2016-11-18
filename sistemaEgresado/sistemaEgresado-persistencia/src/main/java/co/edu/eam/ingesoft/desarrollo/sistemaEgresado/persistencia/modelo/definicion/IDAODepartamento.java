package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;

/**
 * Interface que realiza las operaciones de un departamento
 * @author Sebastian
 *
 */
public interface IDAODepartamento {
	
	 public List<Departamento> listarDepartamento(Pais pais)throws Exception;

}
