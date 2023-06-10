package Clase5;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        System.out.println("Ingrese el precio original del producto:");
        Scanner preguntaProducto = new Scanner(System.in);
        double precioProducto = preguntaProducto.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento que desea realizar:");
        Scanner preguntaPorcentaje = new Scanner(System.in);
        double precioPorcentaje = preguntaPorcentaje.nextDouble();

        if(precioProducto>0 || precioPorcentaje>0){
            double precioTotal = precioProducto - (precioProducto * precioPorcentaje /100);
            System.out.println("El precio total es: "+ precioTotal + " incluye el descuento");
        }else{
            System.out.println("No se registro valores a descontar");
        }
    }
}
