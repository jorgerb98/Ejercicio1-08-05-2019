package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

//////////////////////////////////////////////////////////EJERCICIO 1//////////////////////////////////////////////////////////////////////////////
        
        reparacionList.forEach(System.out::println);


//////////////////////////////////////////////////////////EJERCICIO 2//////////////////////////////////////////////////////////////////////////////

        System.out.println("Total = "+reparacionList.stream().mapToDouble(Reparacion::getPrecioTotal).sum()+ "€");


//////////////////////////////////////////////////////////EJERCICIO 3//////////////////////////////////////////////////////////////////////////////

       // System.out.println("Numero de motos reparadas: "+reparacionList.stream().filter(reparacion -> reparacion.getVehiculo().getTipo().equals("Moto")).count());  SIN INSTACEOFF


        System.out.println("Numero de motos reparadas = "+ reparacionList.stream().filter(reparacion -> reparacion.getVehiculo() instanceof Moto).count());

//////////////////////////////////////////////////////////EJERCICIO 4//////////////////////////////////////////////////////////////////////////////

        if (reparacionList.stream().mapToDouble(Reparacion::getPrecioTotal).average().isPresent()){
            System.out.println("Media de las reparaciones = "+reparacionList.stream().mapToDouble(Reparacion::getPrecioTotal).average().getAsDouble()+ "€");
        }else System.out.println("La media de las reparaciones no se puede sacar debido a que el average no cumple el .isPresent.");


//////////////////////////////////////////////////////////EJERCICIO 5//////////////////////////////////////////////////////////////////////////////

       Stream<Reparacion> lista = reparacionList.stream().filter(reparacion -> reparacion.getVehiculo() instanceof Coche);
        System.out.println("Total facturado solo en coches = "+lista.mapToDouble(Reparacion::getPrecioTotal).sum()+"€");

//////////////////////////////////////////////////////////EJERCICIO 6//////////////////////////////////////////////////////////////////////////////

        List<Reparacion> listaMotos = reparacionList.stream().collect(Collectors.groupingBy(Reparacion::getTipoReparacion)).get(TipoVehiculo.Moto);

        System.out.println("Total facturado de motos = "+listaMotos.stream().mapToDouble(Reparacion::getPrecioTotal).sum()+ "€");


        List<Reparacion> listaCoches = reparacionList.stream().collect(Collectors.groupingBy(Reparacion::getTipoReparacion)).get(TipoVehiculo.Coche);

        System.out.println("Total facturado de coches = "+listaCoches.stream().mapToDouble(Reparacion::getPrecioTotal).sum()+ "€");



    }
}
