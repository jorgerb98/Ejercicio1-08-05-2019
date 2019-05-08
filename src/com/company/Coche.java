package com.company;

public class Coche extends Vehiculo {

		private String tipo;

	public Coche( String color) {
		super(50,color);
		tipo = "Coche";
	}

	@Override
	public String getTipo() {
		return tipo;
	}
}
