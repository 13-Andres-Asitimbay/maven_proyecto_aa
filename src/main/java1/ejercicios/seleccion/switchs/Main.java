package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja opción: ");
			System.out.println("  1. Realizar transferencia");
			System.out.println("  2. Consultar pagos");
			System.out.println("  3. SALIR");
			opcion = teclado.nextLine();

			switch (opcion) { // El switch hasta antes de la version 1.7 solo funcionaba para byte, short, char e int
			case "1":
				System.out.println("Ingrese número de cuenta: ");
				break;

			case "2":
				System.out.println("No existen pagos.");
				break;

			case "3":
				System.out.println("Cerrando el sistema...");
				break;

			default:
				System.out.println("No ha elegido ninguna opcion.");
				break; // El break del default es opcional
			}

		} while (!opcion.equals("3")); // Similar a: opcion != 3
		System.out.println("¡¡¡Gracias por prefirnos!!!");
	}

}
