/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.gui.controlador;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.InformacionAcademica;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOContacto;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEgresado;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEmpresa;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOInformacionAcademica;

/**
 *
 * @author Cristian Sinisterra
 */
public class controladorLogin {
    private  BOEgresado boEgresado;
    private BOInformacionAcademica bOInformacionAcademica;
    private BOEmpresa boEmpresa;
    private BOContacto bOContacto;
    

    public controladorLogin() {
       boEgresado = new BOEgresado();
       bOInformacionAcademica=new BOInformacionAcademica();
       boEmpresa= new BOEmpresa();
       bOContacto= new BOContacto();
    }
    
    public Egresado buscarEgresado(int codigo) throws Exception{
		return boEgresado.buscar(codigo);
                
	}
    
    public InformacionAcademica buscar(int codigo)throws Exception{
        return bOInformacionAcademica.buscar(codigo);
    }
    
    public Empresa buscarEmpresa(int codigo)throws Exception{
        return boEmpresa.buscar(codigo);
    }
    
    public ContactoEmpresa buscarContacto(int codigo)throws Exception{
        return bOContacto.buscar(codigo);
    }
    
}
