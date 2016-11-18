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
 *Clase responsable de controlar la venta registro empresa
 * @author Cristian Sinisterra
 */
public class controladorVentanaRegistroEmpresa {
    private BOCiudad boCiudad;
    private BODepartamento boDepartamento;
    private BOEmpresa boEmpresa;
    private BOPais boPais;
    private BOSectorLaboral boSectorLaboral;
    
    public controladorVentanaRegistroEmpresa(){
        boCiudad= new BOCiudad();
        boDepartamento= new BODepartamento();
        boEmpresa= new BOEmpresa();
        boPais= new BOPais();
        boSectorLaboral=new BOSectorLaboral();
    }
    
    /**
     * Metodo para listar los departamentos
     * @param pais, pais del departamento
     * @return
     * @throws Exception
     */
    public List<Departamento> listarDepartamento(Pais pais)throws Exception{
        return boDepartamento.listarDepartamento(pais);
    }
    
    /**
     * Metodo para listar un pais
     * @return
     * @throws Exception
     */
    public List<Pais> listarPais()throws Exception{
        return boPais.listarPais();
    }
    
    /**
     * Metodo para listar una ciudad
     * @param departamento, departamento de la ciudad
     * @return
     * @throws Exception
     */
    public List<Ciudad> listarCiudades(Departamento departamento)throws Exception{
        return boCiudad.listarCiudades(departamento);
    }
    
    /**
     * Metodo para crear empresa
     * @param empresa, empresa a crear
     * @param contacto, contacto de la empresa a crear
     * @throws Exception
     */
    public void CrearEmpresa(Empresa empresa, ContactoEmpresa contacto)throws Exception{
        boEmpresa.crearEmpresa(empresa, contacto);
    }
    
    /**
     * Metodo para listar el sector laboral
     * @return
     * @throws Exception
     */
     public List<SectorLaboral> listarSectorLaboral() throws Exception {
         return boSectorLaboral.listarSectorLaboral();
     }
}
