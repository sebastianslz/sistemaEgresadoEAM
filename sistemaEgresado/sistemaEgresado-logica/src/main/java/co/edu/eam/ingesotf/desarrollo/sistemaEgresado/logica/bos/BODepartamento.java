/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAODepartamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAODepartamento;
import java.util.List;

/**
 *Esta clase esta encargada de manejar toda la logica del departamento
 * @author Cristian Sinisterra
 */
public class BODepartamento {
    private IDAODepartamento daoDepartamento;
    
    public BODepartamento(){
        daoDepartamento= new DAODepartamento();
    }
    
    /**
     * Lista los departamentos 
     * @param pais, pais a los cuales se le van a listar los departamentos
     * @return la lista de los de los departamentos de ese pais de lo contrario null
     * @throws Exception 
     */
     public List<Departamento> listarDepartamento(Pais pais)throws Exception {
       return  daoDepartamento.listarDepartamento(pais);
     }
}
