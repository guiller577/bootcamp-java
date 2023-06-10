package Clase5;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        System.out.println("Ingrese el total de la cuenta a pagar:");
        Scanner preguntaPrecio = new Scanner(System.in);
        double precio = preguntaPrecio.nextDouble();

        System.out.println("Ingrese el porcentaje de propina a dejar:");
        Scanner preguntaPropina = new Scanner(System.in);
        double porcentajePropina = preguntaPropina.nextDouble();

        if(precio>0 || porcentajePropina>0){
            double totalPropina = precio * (porcentajePropina/100);
            System.out.println("El total de la propina a dejar es $:" + totalPropina);
        }else{
            System.out.println("No se ingresaron valores a calcular");
        }
    }
}
