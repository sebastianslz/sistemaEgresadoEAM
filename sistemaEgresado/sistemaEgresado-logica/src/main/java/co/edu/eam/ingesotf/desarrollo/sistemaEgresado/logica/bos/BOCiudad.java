/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOCiudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOCiudad;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public class BOCiudad {
    private IDAOCiudad daoCiudad;
    
    public BOCiudad(){
        daoCiudad= new DAOCiudad();
    }
    
    public List<Ciudad> listarCiudades(Departamento departamento)throws Exception{
        return daoCiudad.listarCiudades(departamento);
    }
}
