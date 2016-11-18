/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOPais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOPais;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public class BOPais {
    IDAOPais daoPais;
    
    public BOPais(){
        daoPais= new DAOPais();
    }
    
    public List<Pais> listarPais()throws Exception{
        return daoPais.listarPais();
    }
}
