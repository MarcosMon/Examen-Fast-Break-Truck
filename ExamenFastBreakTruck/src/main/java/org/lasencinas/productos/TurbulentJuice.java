package org.lasencinas.productos;

import org.lasencinas.ExamenFastBreakTruck.Tubo;
import org.lasencinas.clasesAbstractas.Bebida;
import org.lasencinas.interfaces.Packing;

public class TurbulentJuice extends Bebida {
	
	private String nombreProducto = "Turbulent Juice";
	private Float pvp = 30.0f;
	
	public TurbulentJuice(){}
	
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
