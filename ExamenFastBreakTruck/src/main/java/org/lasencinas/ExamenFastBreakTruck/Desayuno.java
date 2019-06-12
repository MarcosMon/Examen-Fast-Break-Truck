package org.lasencinas.ExamenFastBreakTruck;

import org.lasencinas.productos.Eyeholes;
import org.lasencinas.productos.FleebJuice;
import org.lasencinas.productos.TurbulentJuice;

public class Desayuno {
	
	public Desayuno() {}
	
	public boolean complementosOkFleeb() {
		
		FleebJuice fleeb = new FleebJuice();
		
		if(fleeb.empaquetado().envoltorio() == "Tubo" ) {
			return true;
		}
		return false;
	}

	public void mostrarItems() {
		
		Eyeholes eyeholes = new Eyeholes();
		
		System.out.println(eyeholes.toString());
		
	}

	public Float getCoste() {
		Eyeholes eyeholes = new Eyeholes();
		TurbulentJuice turbulent = new TurbulentJuice();
		
		
		
		return  eyeholes.pvp() + turbulent.pvp();
	}

}
