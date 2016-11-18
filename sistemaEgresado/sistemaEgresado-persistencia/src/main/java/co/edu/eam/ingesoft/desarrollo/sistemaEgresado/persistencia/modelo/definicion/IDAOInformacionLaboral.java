package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionLaboral;

/**
 * Interface que se encarga de realizar las operaciones de la informacion laboral
 * @author Sebastian
 *
 */
public interface IDAOInformacionLaboral {
	
	public void crear(InformacionLaboral iformacionLaboral) throws Exception;
	
	public void editar(InformacionLaboral iformacionLaboral) throws Exception;
	
	public InformacionLaboral buscar(int codigo)throws Exception;
}
