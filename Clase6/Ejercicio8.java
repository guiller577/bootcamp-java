package Clase6;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras!");

        // Pedir la elección del usuario
        System.out.print("Ingresa tu elección (piedra, papel o tijeras): ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Generar la elección aleatoria de la computadora
        int eleccionComputadoraNumero = random.nextInt(3); // 0: piedra, 1: papel, 2: tijeras

        String eleccionComputadora;
        switch (eleccionComputadoraNumero) {
            case 0:
                eleccionComputadora = "piedra";
                break;
            case 1:
                eleccionComputadora = "papel";
                break;
            case 2:
                eleccionComputadora = "tijeras";
                break;
            default:
                eleccionComputadora = "desconocido";
                break;
        }

        System.out.println("La computadora eligió: " + eleccionComputadora);

        // Determinar el ganador
        String resultado;
        if (eleccionUsuario.equals(eleccionComputadora)) {
            resultado = "Empate";
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
            resultado = "Ganaste!";
        } else {
            resultado = "Perdiste :(";
        }

        // Mostrar el resultado
        System.out.println(resultado);
    }
}
