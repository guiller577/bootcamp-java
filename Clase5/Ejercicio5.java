package Clase5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numeroRandom = (int) Math.floor(Math.random() * 100);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Adivina cual es el numero que estoy pensando?");
        int numeroIngresado = teclado.nextInt();

        if (numeroIngresado == numeroRandom) {
            System.out.println("Adivinaste el numero");
        } else {
            System.out.println("Erraste al adivinar, el numero era: "+ numeroRandom);
        }
    }
}
