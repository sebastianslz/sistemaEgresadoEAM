package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOInformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOInformacionAcademica;

public class BOInformacionAcademica {
	IDAOInformacionAcademica daoInformacionAcademica;
	
	public BOInformacionAcademica(){
		daoInformacionAcademica= new DAOInformacionAcademica();
	}
	
	/**
	 * Logica de crear informacion academica
	 * @param informacion, academica del egresado
	 * @throws Exception
	 */
	public void crearInformacion(InformacionAcademica informacion)throws Exception{
		daoInformacionAcademica.crear(informacion);
	}
	
	/**
	 * Logica que edita informacion academica del estudiante
	 * @param informacion
	 * @throws Exception
	 */
	public void editarInformacion(InformacionAcademica informacion)throws Exception{
		daoInformacionAcademica.editar(informacion);
	}
	
	public InformacionAcademica buscar(int codigo)throws Exception{
		return daoInformacionAcademica.buscar(codigo);
	}
}
