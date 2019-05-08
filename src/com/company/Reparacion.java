package com.company;

public class Reparacion {

	private final double PRECIOBASE = 30;
	private Vehiculo vehiculo;


	public Reparacion( Vehiculo vehiculo) {

		this.vehiculo = vehiculo;
	}

	public double getPrecioBase() {
		return PRECIOBASE;
	}



	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public double getPrecioTotal(){
		return (vehiculo.getprecioReparacion()+PRECIOBASE);
	}

	@Override
	public String toString() {
		return "Reparacion{" +
			   " Tipo = " + vehiculo.getTipo() +
			   " | Color = " + vehiculo.getColor() +
			   " | Precio =" + (PRECIOBASE + getVehiculo().getprecioReparacion()) + "€" +
			   '}';
	}
}
