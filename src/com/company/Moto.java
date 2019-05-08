package com.company;

public class Moto extends Vehiculo {

	private  String tipo;

	public Moto(String color){
		super(25,color);
		tipo="Moto";
	}

	@Override
	public String getTipo() {
		return tipo;
	}
}
