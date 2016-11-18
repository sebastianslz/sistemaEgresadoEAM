package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_EGRESADO")
public class Egresado implements Serializable {

	@Id
	@Column(name = "ID_EGRESADO")
	private int codigoEgresado;
	
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "TIPO_DOCUMENTO")
	private String tipoDocumento;
	
	@Column(name = "NUMERO")
	private String numeroDocumento;
	
	
	@Column(name = "CORREO")
	private String correo;
	
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	
	@ManyToOne
	@JoinColumn(name = "ID_PROGRAMA")
	private ProgramaAcademica programaAca;
	
	@OneToOne(mappedBy="egresado")
	private InformacionLaboral infoLaboral;

public Egresado(){
	
}
public Egresado(int codigoEgresado, String nombre, String apellido, String tipoDocumento, String numeroDocumento, String correo,
		String telefono, ProgramaAcademica programaAca) {
	
	this.codigoEgresado = codigoEgresado;
	this.nombre = nombre;
	this.apellido = apellido;
	this.tipoDocumento = tipoDocumento;
	this.numeroDocumento = numeroDocumento;
	this.correo = correo;
	this.telefono = telefono;
	this.programaAca = programaAca;
}

public int getCodigoEgresado() {
	return codigoEgresado;
}
public void setCodigoEgresado(int codigoEgresado) {
	this.codigoEgresado = codigoEgresado;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getTipoDocumento() {
	return tipoDocumento;
}
public void setTipoDocumento(String tipoDocumento) {
	this.tipoDocumento = tipoDocumento;
}
public String getNumeroDocumento() {
	return numeroDocumento;
}
public void setNumeroDocumento(String numeroDocumento) {
	this.numeroDocumento = numeroDocumento;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public ProgramaAcademica getProgramaAca() {
	return programaAca;
}
public void setProgramaAca(ProgramaAcademica programaAca) {
	this.programaAca = programaAca;
}

}
