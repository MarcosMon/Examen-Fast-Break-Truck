package org.lasencinas.productos;

import org.lasencinas.ExamenFastBreakTruck.Caja;
import org.lasencinas.clasesAbstractas.Cereales;
import org.lasencinas.interfaces.Packing;

public class Eyeholes extends Cereales{
	
	
	private String nombreProducto = "TurbulentJuice";
	private Float pvp = 25.0f;
	public Eyeholes() {
	}

	public String nombre() {

		return this.nombreProducto;
	}

	public Float pvp() {
		
		return this.pvp;

	}

	@Override
	public Packing empaquetado() {
		Packing paquete  = new Caja();
		paquete.envoltorio();
		return paquete ;
	}

	@Override
	public String toString() {
		return "Item: " + nombre() + " Empaquetado: " + " " +  empaquetado() + " " + pvp();
	}

}
