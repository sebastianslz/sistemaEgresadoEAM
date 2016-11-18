package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;

public interface IDAOContacto {

	/**
	 * Registra un contacto de la empresa
	 * @param contacto, de la empresa el cual se va registrar
	 * @throws Exception
	 */
	public void crear (ContactoEmpresa contacto) throws Exception;
        
        public ContactoEmpresa buscar(int codigo)throws Exception;
        
        
}
