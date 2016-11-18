package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import java.util.List;


import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
public interface IDAOPais {

	public List<Pais> listarPais()throws Exception;
}
