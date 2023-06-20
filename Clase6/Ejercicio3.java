package Clase6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero de celular:");
        String celular = teclado.nextLine();

        String url ="api.whatsapp.com/send?phone=";

        System.out.println("El link para ir al WhatsApp es: " + url + celular);
    }
}
