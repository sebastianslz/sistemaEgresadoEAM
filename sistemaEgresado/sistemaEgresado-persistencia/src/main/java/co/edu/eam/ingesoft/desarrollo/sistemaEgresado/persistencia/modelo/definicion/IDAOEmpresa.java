package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;

/**
 * Interface que realiza las operaciones de una empreesa
 * @author Sebastian
 *
 */
public interface IDAOEmpresa {

	/**
	 * Registra una empresa
	 * @param egresado, el cual se va registrar
	 * @throws Exception
	 */
	public void crear (Empresa empresa, ContactoEmpresa contacto) throws Exception;
	
	/**
	 * Edita la informacion la empresa
	 * @param empresa, que se va editar
	 * @throws Exception
	 */
	public void editar (Empresa empresa, ContactoEmpresa contacto) throws Exception;
	
	/**
	 * Busca una empresa
	 * @param cedula, del egresado a buscar
	 * @return un egresado de lo contrario null
	 * @throws Exception
	 */
	public Empresa buscar (int nit) throws Exception;
	
}
