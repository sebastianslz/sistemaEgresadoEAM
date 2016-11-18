/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.definicion.IDAOSectorLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.implementacion.JPA.DAOSectorLaboral;
import java.util.List;

/**
 *
 * @author Cristian Sinisterra
 */
public class BOSectorLaboral {
    private IDAOSectorLaboral daoSector;
    
    public BOSectorLaboral(){
        daoSector= new DAOSectorLaboral();
    }
    
     public List<SectorLaboral> listarSectorLaboral() throws Exception {
         return daoSector.listarSectorLaboral();
     }
     
     public void crear(SectorLaboral sector)throws Exception{
    	 daoSector.crear(sector);
     }
}
