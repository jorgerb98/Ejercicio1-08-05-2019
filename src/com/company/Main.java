package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> veiculoList = new ArrayList<>();
        veiculoList.add(new Coche("Rojo"));
        veiculoList.add(new Coche("Azul"));
        veiculoList.add(new Coche("Verde"));
        veiculoList.add(new Moto("Rosa"));
        veiculoList.add(new Moto("Amarillo"));
        veiculoList.add(new Moto("Morado"));

        List<Reparacion> reparacionList = new ArrayList<>();
        reparacionList.add(new Reparacion(veiculoList.get(0)));
        reparacionList.add(new Reparacion(veiculoList.get(1)));
        reparacionList.add(new Reparacion(veiculoList.get(2)));
        reparacionList.add(new Reparacion(veiculoList.get(2)));
        reparacionList.add(new Reparacion(veiculoList.get(2)));
        reparacionList.add(new Reparacion(veiculoList.get(3)));
        reparacionList.add(new Reparacion(veiculoList.get(4)));
        reparacionList.add(new Reparacion(veiculoList.get(5)));

        reparacionList.stream().forEach(System.out::println);

        System.out.println("Total: "+reparacionList.stream().mapToDouble(Reparacion::getPrecioTotal).sum()+ "€");

       // System.out.println("Numero de motos reparadas: "+reparacionList.stream().filter(reparacion -> reparacion.getVehiculo().getTipo().equals("Moto")).count());
        System.out.println("Numero de motos reparadas: "+ reparacionList.stream().filter(reparacion -> reparacion.getVehiculo() instanceof Moto).count());

        System.out.println("Media de las reparaciones: "+reparacionList.stream().mapToDouble(Reparacion::getPrecioTotal).average().getAsDouble()+ "€");

        reparacionList.stream().collect(Collectors.groupingBy(reparacion -> reparacion.getVehiculo() instanceof Coche));
        //total factura solo en operaciones de coche
        //total facturado en cada tipo de vehiculo
        //groupingby





    }
}
