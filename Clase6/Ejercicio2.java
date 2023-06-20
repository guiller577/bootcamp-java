package Clase6;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = teclado.nextLine();

        String busqueda = "https://twitter.com/search?q=";

        System.out.println("El link para la busqueda es: " + busqueda + palabra);
    }
}
