package org.lasencinas.ExamenFastBreakTruck;

import org.lasencinas.interfaces.Packing;

public class Tubo implements Packing {
	
	private String envoltorio = "Tubo";

	public Tubo() {
	}

	public String envoltorio() {
		return this.envoltorio;
	}

}
