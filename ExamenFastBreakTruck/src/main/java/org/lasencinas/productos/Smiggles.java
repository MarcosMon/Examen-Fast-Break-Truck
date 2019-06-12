package org.lasencinas.productos;

import org.lasencinas.ExamenFastBreakTruck.Caja;
import org.lasencinas.clasesAbstractas.Cereales;
import org.lasencinas.interfaces.Packing;

public class Smiggles  extends Cereales{
	
	private String nombreProducto = "Smiggles";
	private Float pvp = 50.0f;

	public Smiggles() {
	}

	public String nombre() {
		
		return this.nombreProducto;

	}

	public Float pvp() {
		
		return pvp;

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
