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
 *Clase responsable de controlar la ventana login
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
    
    /**
     * Metodo que busca un egresado por su codigo
     * @param codigo, codigo del egresado a buscar
     * @return
     * @throws Exception
     */
    public Egresado buscarEgresado(int codigo) throws Exception{
		return boEgresado.buscar(codigo);
                
	}
    
    /**
     * Metodo que busca la informacion academica 
     * @param codigo
     * @return
     * @throws Exception
     */
    public InformacionAcademica buscar(int codigo)throws Exception{
        return bOInformacionAcademica.buscar(codigo);
    }
    
    /**
     * Metodo que busca la empresa por su codigo
     * @param codigo
     * @return
     * @throws Exception
     */
    public Empresa buscarEmpresa(int codigo)throws Exception{
        return boEmpresa.buscar(codigo);
    }
    
    /**
     * Metodo que busca el contacto de la empresa
     * @param codigo
     * @return
     * @throws Exception
     */
    public ContactoEmpresa buscarContacto(int codigo)throws Exception{
        return bOContacto.buscar(codigo);
    }
    
}
