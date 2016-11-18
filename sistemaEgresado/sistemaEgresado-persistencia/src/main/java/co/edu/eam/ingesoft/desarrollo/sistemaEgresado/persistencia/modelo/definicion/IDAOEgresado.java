package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;

/**
 * Interface que realiza las operaciones de un egresado
 * @author Sebastian
 *
 */
public interface IDAOEgresado {
	
	/**
	 * Registra un egresado de la universidad
	 * @param egresado, el cual se va registrar
	 * @throws Exception
	 */
	public void crear (Egresado egresado, InformacionAcademica infor) throws Exception;
	
	/**
	 * Edita la informacion personal de un egresado
	 * @param egresado, que se va editar
	 * @throws Exception
	 */
	public void editar (Egresado egresado, InformacionAcademica infor) throws Exception;
	
	/**
	 * Busca un egresado
	 * @param cedula, del egresado a buscar
	 * @return un egresado de lo contrario null
	 * @throws Exception
	 */
	public Egresado buscar (int codigo) throws Exception;
	
}
