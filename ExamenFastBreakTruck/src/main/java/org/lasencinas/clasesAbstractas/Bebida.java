package org.lasencinas.clasesAbstractas;

import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;

public abstract class Bebida implements Item{
	
	
	public abstract Packing empaquetado();
	public abstract String toString();

}
