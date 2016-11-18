package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionLaboral;

public interface IDAOInformacionLaboral {
	
	public void crear(InformacionLaboral iformacionLaboral) throws Exception;
	
	public void editar(InformacionLaboral iformacionLaboral) throws Exception;
	
	public InformacionLaboral buscar(int codigo)throws Exception;
}
