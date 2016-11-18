package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_AREA_EGRESADO")
@IdClass(AreaEgresadoPK.class)
public class AreaEgresado implements Serializable {
	
		
		@Id
		@ManyToOne
		@JoinColumn(name="ID_AREA")
		private AreaInteres areaInteres;
		
		
		@Id
		@ManyToOne
		@JoinColumn (name="ID_EGRESADO")
		private Egresado egresado;
		
		public  AreaEgresado(){
			
		}
		public AreaEgresado(AreaInteres areaInteres, Egresado egresado) {
			
			this.areaInteres = areaInteres;
			this.egresado = egresado;
		}
		
		
		
		public AreaInteres getAreaInteres() {
			return areaInteres;
		}

		public void setAreaInteres(AreaInteres areaInteres) {
			this.areaInteres = areaInteres;
		}

		public Egresado getEgresado() {
			return egresado;
		}

		public void setEgresado(Egresado egresado) {
			this.egresado = egresado;
		}
}
