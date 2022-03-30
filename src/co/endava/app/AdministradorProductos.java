/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main del proyecto
        Producto p1 = new Producto(101, "Café", 1500); // Declaración e inicialización de p1
        Producto p2 = new Producto(102, "Azucar", 2500); // Declaración e inicialización de p2
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now()); // Declaración e inicialización de p3
        Producto p4 = new Bebida(104, "Té", 1800); //// Declaración e inicialización de p4

        //PRINT
        System.out.println(p1.getPrecio()); //Imprimir solo el precio de P1
        System.out.println(p2.getPrecio()); //Imprimir solo el precio de P2
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());
        
        Producto p5 = new Producto(105, "Agua", 1800);
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        } else {
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre());
            }
        }
        BigDecimal numero = BigDecimal.ZERO; // Big decimal es una variable numérica gigante
        try {
            numero = BigDecimal.valueOf(Long.parseLong("140"));
        } catch (Exception e){
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero);
    }
    
}
