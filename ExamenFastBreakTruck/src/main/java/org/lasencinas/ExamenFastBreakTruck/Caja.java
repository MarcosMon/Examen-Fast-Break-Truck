package org.lasencinas.ExamenFastBreakTruck;

import org.lasencinas.interfaces.Packing;

public class Caja implements Packing {
	
	private String envoltorio = "Tubo";

	public Caja() {
	}

	public String envoltorio() {
		return this.envoltorio;
	}

}
