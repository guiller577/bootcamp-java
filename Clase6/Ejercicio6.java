package Clase6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero:");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();

        System.out.println("Ingrese un numero:");
        Scanner teclado1 = new Scanner(System.in);
        int numero2 = teclado1.nextInt();

        System.out.println("Ingrese un numero:");
        Scanner teclado2 = new Scanner(System.in);
        int numero3 = teclado2.nextInt();

        int mayor;
        int menor;

        if ((numero1 > numero2)&&(numero1 > numero3)) {
            mayor = numero1;
        } else if ((numero2 > numero1)&&(numero2 > numero3)) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        if((numero1<numero2)&&(numero1<numero3)){
            menor=numero1;
        } else if ((numero2<numero1)&&(numero2<numero3)) {
            menor=numero2;
        }else {
            menor=numero3;
        }
        System.out.println("El numero mayor es: "+mayor+" y el numero menor es: "+menor);
    }
}
