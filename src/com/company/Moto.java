package com.company;

public class Moto extends Vehiculo {

	private  TipoVehiculo tipo;

	public Moto(String color){
		super(25,color);

	}

	@Override
	public TipoVehiculo getTipo() {
		return TipoVehiculo.Moto;
	}
}
