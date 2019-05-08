package com.company;

public class Coche extends Vehiculo {

		private TipoVehiculo tipo;

	public Coche( String color) {
		super(50,color);
	}

	@Override
	public TipoVehiculo getTipo() {
		return TipoVehiculo.Coche;
	}
}
