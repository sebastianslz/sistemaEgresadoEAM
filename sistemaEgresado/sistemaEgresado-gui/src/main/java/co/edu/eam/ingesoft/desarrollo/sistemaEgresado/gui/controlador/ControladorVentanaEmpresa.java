/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.gui.controlador;

import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.ContactoEmpresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOCiudad;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BODepartamento;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOEmpresa;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOPais;
import co.edu.eam.ingesotf.desarrollo.sistemaEgresado.logica.bos.BOSectorLaboral;
import java.util.List;

/**
 *Clase responsable de controlar la ventana empresa
 * @author Cristian Sinisterra
 */
public class ControladorVentanaEmpresa {
    private BOCiudad boCiudad;
    private BODepartamento boDepartamento;
    private BOEmpresa boEmpresa;
    private BOPais boPais;
    private BOSectorLaboral boSectorLaboral;
    
    public ControladorVentanaEmpresa(){
        boCiudad= new BOCiudad();
        boDepartamento= new BODepartamento();
        boEmpresa= new BOEmpresa();
        boPais= new BOPais();
        boSectorLaboral=new BOSectorLaboral();
    }
    
    /**
     * Metodo para listar el sector laboral
     * @return
     * @throws Exception
     */
     public List<SectorLaboral> listarSectorLaboral() throws Exception {
         return boSectorLaboral.listarSectorLaboral();
     }
     /**
      * Metodo para listar los departamento
      * @param pais, pais al que pertenece el departamento
      * @return
      * @throws Exception
      */
     public List<Departamento> listarDepartamento(Pais pais)throws Exception{
        return boDepartamento.listarDepartamento(pais);
    }
    
     /**
      * Metodo para listar paises
      * @return
      * @throws Exception
      */
    public List<Pais> listarPais()throws Exception{
        return boPais.listarPais();
    }
    
    /**
     * Metodo para listar ciudades
     * @param departamento, departemento de la ciudad
     * @return
     * @throws Exception
     */
    public List<Ciudad> listarCiudades(Departamento departamento)throws Exception{
        return boCiudad.listarCiudades(departamento);
    }
    
    /**
     * Metodo para editar la empresa
     * @param empresa, empresa a editar
     * @param contacto, contacto de la empresa a editar
     * @throws Exception
     */
    public void editarEmpresa(Empresa empresa, ContactoEmpresa contacto)throws Exception{
        boEmpresa.editarEmpresa(empresa, contacto);
    }
}
