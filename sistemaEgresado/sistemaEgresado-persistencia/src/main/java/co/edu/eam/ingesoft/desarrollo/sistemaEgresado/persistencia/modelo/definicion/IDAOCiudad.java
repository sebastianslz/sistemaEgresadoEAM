package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;

/**
 * Interface que se encarga de la ciudad
 * @author Cristian Sinisterra
 */
public interface IDAOCiudad {
    
    /**
     * Metodo que lista las ciudades
     * @param departamento, departamento el cual se le van a listar las ciudades
     * @return la lista de ciudades de lo contrario null
     * @throws Exception 
     */
	public List<Ciudad> listarCiudades(Departamento departamento)throws Exception;
}
