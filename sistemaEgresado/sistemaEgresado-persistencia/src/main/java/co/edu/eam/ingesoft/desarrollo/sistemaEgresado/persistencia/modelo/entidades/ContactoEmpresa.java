package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTACTO")
public class ContactoEmpresa implements Serializable {
	
	@Id
	@Column(name="ID_EMPRESA")
	private Integer codigoEmpresa;
	
	
	
	@OneToOne()
	@JoinColumn(name="ID_EMPRESA", insertable=false, updatable=false)
	@MapsId
	private Empresa empresa;
	
		
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="CARGO")
	private String cargo;
	
	@Column(name="CORREO")
	private String correo;
	
	public ContactoEmpresa(){
		
	}
	
	public ContactoEmpresa(int codigoEmpresa, Empresa empresa, String nombre, String telefono, String cargo,
			String correo) {
		
		this.codigoEmpresa = codigoEmpresa;
		this.empresa = empresa;
		this.nombre = nombre;
		this.telefono = telefono;
		this.cargo = cargo;
		this.correo = correo;
	}

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
	
	
}
