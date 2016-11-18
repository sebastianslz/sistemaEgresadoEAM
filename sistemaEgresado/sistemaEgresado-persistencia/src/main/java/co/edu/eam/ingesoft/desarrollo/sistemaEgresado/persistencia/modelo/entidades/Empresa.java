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
@Table(name="T_EMPRESA")
public class Empresa implements Serializable {
	
	@Id
	@Column(name="ID_EMPRESA")
	private Integer codigoEmpresa;
	
	
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="PAIS")
	private String pais;
	
	@Column(name="TIPO_EMPRESA")
	private String tipoEmpresa;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="PAGINA_WEB")
	private String paginaWeb;
	
	@ManyToOne
	@JoinColumn(name="ID_SECTOR", nullable=false)
	private SectorLaboral sector;
	
	@ManyToOne
	@JoinColumn(name="ID_CIUDAD", nullable=false)
	private Ciudad ciudad;
	
	@OneToOne(mappedBy="empresa")
	private ContactoEmpresa conta;
	
	
	public Empresa(){
		
	}
	
	public Empresa(int codigoEmpresa, String razonSocial, String telefono, String pais, String tipoEmpresa,
			String direccion, String paginaWeb, SectorLaboral sector, Ciudad ciudad) {
		
		this.codigoEmpresa = codigoEmpresa;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.pais = pais;
		this.tipoEmpresa = tipoEmpresa;
		this.direccion = direccion;
		this.paginaWeb = paginaWeb;
		this.sector = sector;
		this.ciudad = ciudad;
		
	}


	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}


	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getTipoEmpresa() {
		return tipoEmpresa;
	}


	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getPaginaWeb() {
		return paginaWeb;
	}


	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}


	public SectorLaboral getSector() {
		return sector;
	}


	public void setSector(SectorLaboral sector) {
		this.sector = sector;
	}


	public Ciudad getCiudad() {
		return ciudad;
	}


	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	public ContactoEmpresa getConta() {
		return conta;
	}


	public void setConta(ContactoEmpresa conta) {
		this.conta = conta;
	}
	
	
}
