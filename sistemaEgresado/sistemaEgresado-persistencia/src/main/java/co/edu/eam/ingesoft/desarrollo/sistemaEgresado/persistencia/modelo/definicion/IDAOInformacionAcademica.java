package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;

public interface IDAOInformacionAcademica {

	/**
	 * Informacion academica del estudiante
	 * @param informacion, de sus estudio del estudiante
	 * @throws Exception
	 */
	public void crear(InformacionAcademica informacion)throws Exception;
	
	public void editar(InformacionAcademica informacion)throws Exception;
	
	public InformacionAcademica buscar(int codigo)throws Exception;
	
}
