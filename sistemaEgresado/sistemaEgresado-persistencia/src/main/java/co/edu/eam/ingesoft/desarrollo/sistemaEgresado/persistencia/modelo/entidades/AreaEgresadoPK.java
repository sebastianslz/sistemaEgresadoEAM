package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

public class AreaEgresadoPK implements Serializable {
	
	private int egresado;
	

	private int areaInteres;
	
	public AreaEgresadoPK(int egresado, int areaInteres) {
		
		this.egresado = egresado;
		this.areaInteres = areaInteres;
	}
	
	public AreaEgresadoPK(){
		
	}
	
	public int getEgresado() {
		return egresado;
	}

	public void setEgresado(int egresado) {
		this.egresado = egresado;
	}

	public int getAreaInteres() {
		return areaInteres;
	}

	public void setAreaInteres(int areaInteres) {
		this.areaInteres = areaInteres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaInteres;
		result = prime * result + egresado;
		return result;// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreaEgresadoPK other = (AreaEgresadoPK) obj;
		if (areaInteres != other.areaInteres)
			return false;
		if (egresado != other.egresado)
			return false;
		return true;
	}

}
