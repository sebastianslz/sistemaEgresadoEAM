package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_SECTORLABORAL")
public class SectorLaboral implements Serializable{

	@Id
	@Column(name="ID_SECTOR")
	private int codigoSectorLaboral;
	
	
	@Column(name="SECTOR_LABORAL")
	private String sectorLaboral;
	
	public SectorLaboral(int codigoSectorLaboral, String sectorLaboral) {
		
		this.codigoSectorLaboral = codigoSectorLaboral;
		this.sectorLaboral = sectorLaboral;
	}
	
	public SectorLaboral(){
		
	}
	
	public int getCodigoSectorLaboral() {
		return codigoSectorLaboral;
	}

	public void setCodigoSectorLaboral(int codigoSectorLaboral) {
		this.codigoSectorLaboral = codigoSectorLaboral;
	}

	public String getSectorLaboral() {
		return sectorLaboral;
	}

	public void setSectorLaboral(String sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
	}

    @Override
    public String toString() {
        return sectorLaboral;
    }

	
	
	
}
