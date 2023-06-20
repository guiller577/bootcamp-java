package Clase6;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un país:");
        String pais = teclado.nextLine();

        String url = "https://www.google.com/maps/search/";

        System.out.println("La búsqueda es: " + url + pais);
    }
}
