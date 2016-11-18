package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOInformacionAcademica;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOInformacionLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOInformacionLaboral;

public class BOInformacionLaboral {
	IDAOInformacionLaboral daoInformacionLaboral;

	public BOInformacionLaboral() {
		daoInformacionLaboral = new DAOInformacionLaboral();
	}
	
	/**
	 * Logica que crear una ifnormacion laboral del egresedado
	 * @param informacionLab, informacion laboral del egresado
	 * @throws Exception
	 */
	public void crearInformacionLaboral(InformacionLaboral informacionLab)throws Exception{
		daoInformacionLaboral.crear(informacionLab);
	}
	
	/**
	 * logica que edita la informacion laboral del egresado
	 * @param informacionLab, del egresado que se va editar
	 * @throws Exception
	 */
	public void editarInformacionLaboral(InformacionLaboral informacionLab)throws Exception{
		daoInformacionLaboral.editar(informacionLab);
	}
	
	public InformacionLaboral buscar(int codigo)throws Exception{
		return daoInformacionLaboral.buscar(codigo);
		
	}
}
