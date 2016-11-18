package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOEmpresa;

public class BOEmpresa {
	IDAOEmpresa daoEmpresa;
	
	public BOEmpresa(){
		daoEmpresa= new DAOEmpresa();
		
	}
	
	public void crearEmpresa(Empresa empresa, ContactoEmpresa contacto)throws Exception{
		daoEmpresa.crear(empresa, contacto);
	}
	
	
	public void editarEmpresa(Empresa empresa, ContactoEmpresa contacto)throws Exception{
		daoEmpresa.editar(empresa, contacto);
	}
        
        public Empresa buscar(int nit)throws Exception{
            return daoEmpresa.buscar(nit);
        }
	
	
}
