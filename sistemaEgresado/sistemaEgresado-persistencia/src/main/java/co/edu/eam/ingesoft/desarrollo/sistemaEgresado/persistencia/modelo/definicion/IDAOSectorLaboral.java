/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.SectorLaboral;
import java.util.List;

/**
 *Interface que realiza las operaciones de un sector laboral
 * @author Cristian Sinisterra
 */
public interface IDAOSectorLaboral {
    public List<SectorLaboral> listarSectorLaboral()throws Exception;
    
    public void crear (SectorLaboral sector)throws Exception;
}
