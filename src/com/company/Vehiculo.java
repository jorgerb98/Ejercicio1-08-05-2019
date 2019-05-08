package com.company;

public class Vehiculo {

	private final double PRECIOREPARACION;
	private String tipo;
	private String color;

	protected Vehiculo(double precioReparacion, String color) {
		this.PRECIOREPARACION = precioReparacion;
		this.color = color;

	}

	public String getTipo() {
		return tipo;
	}

	public double getprecioReparacion() {
		return PRECIOREPARACION;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
