package org.lasencinas.productos;

import org.lasencinas.ExamenFastBreakTruck.Tubo;
import org.lasencinas.clasesAbstractas.Bebida;
import org.lasencinas.interfaces.Packing;

public class FleebJuice extends Bebida{

	private String nombreProducto = "Fleeb Juice";
	private Float pvp = 35.0f;
	
	public FleebJuice() {
	}

	public String nombre() {
		
		return this.nombreProducto;

	}

	public Float pvp() {
		
		return this.pvp;

	}

	@Override
	public Packing empaquetado() {
		Packing paquete  = new Tubo();
		paquete.envoltorio();
		return paquete ;
	}

	@Override
	public String toString() {
		return "Item: " + nombre() + " Empaquetado: " + " " +  empaquetado() + " " + pvp();
	}
}
