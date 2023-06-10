package Clase5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese la edad del perro:");
        Scanner pregunta = new Scanner(System.in);
        int edadPerro = pregunta.nextInt();

        if(edadPerro>0){
            System.out.println("La edad del perro es: " + (edadPerro*7));
        }else{
            System.out.println("No hay dato ingresado");
        }
    }
}
