package Clase5;

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args){
        System.out.println("Ingrese la distancia en millas:");
        Scanner pregunta = new Scanner(System.in);
        double millas = pregunta.nextDouble();

        if(millas>0){
            System.out.println("El resultado convertido es de: " + (millas*1.60934)+" de millas a kilometros");
        }else{
            System.out.println("No ingreso valor a convertir");
        }
    }
}
