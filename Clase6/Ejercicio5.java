package Clase6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("Ingrese el primer numero");
        Scanner teclado = new Scanner(System.in);
        double numero1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo numero");
        Scanner teclado1 = new Scanner(System.in);
        double numero2 = teclado1.nextDouble();

        System.out.println("Ingrese el tercer numero");
        Scanner teclado2 = new Scanner(System.in);
        double numero3 = teclado2.nextDouble();

        double promedio = (numero1+numero2+numero3)/100;

        System.out.println("El promedio de los numeros ingresados es: " + promedio);
    }
}
