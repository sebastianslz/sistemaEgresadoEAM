package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="T_DEPARTAMENTO")
@NamedQueries({ @NamedQuery(name= Departamento.CONSULTA_DEPARTAMENTO_POR_PAIS,query = "SELECT departa FROM Departamento departa "
        + "where departa.pais=?1")
})
public class Departamento implements Serializable{

	 public static final String CONSULTA_DEPARTAMENTO_POR_PAIS="Departamento.listardepartamentoporpais";
	
	@Id
	@Column(name="ID_DEPARTAMENTO")
	private int codigoDepartamento;
	
		

	@Column(name="DEPARTAMENTO")
	private String departamento;
        
        @ManyToOne
	@JoinColumn(name="ID_PAIS", nullable=false)
	private Pais pais;
	
	public Departamento(){
		
	}
	
	public Departamento(int codigoDepartamento, String departamento) {
		
		this.codigoDepartamento = codigoDepartamento;
		this.departamento = departamento;
	}
	
	
	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
            return departamento;
	}
}
