package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOContacto;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOContacto;

public class BOContacto {
	IDAOContacto daoContacto;
	
	public BOContacto(){
		daoContacto= new DAOContacto();
	}
	
	public void  crearContacto(ContactoEmpresa contactoEmpresa)throws Exception{
		 daoContacto.crear(contactoEmpresa);
	}
        
        public ContactoEmpresa buscar(int codigo)throws Exception{
              return  daoContacto.buscar(codigo);
        }
}
