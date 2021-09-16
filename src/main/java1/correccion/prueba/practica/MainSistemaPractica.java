package correccion.prueba.practica;

import java.util.Scanner;

public class MainSistemaPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		String clave;
		String opcion;
		int saldo = 2500;

		do {
			System.out.println("Ingrese clave: ");
			clave = teclado.nextLine();

			if (clave.equals("85AB")) {
				do {
					System.out.println(" ");
					System.out.println("##################################");
					System.out.println("BANCO PICHINCHA, elija una opción:");
					System.out.println("    1. Consultar pagos");
					System.out.println("    2. Realizar transferencia");
					System.out.println("    3. SALIR");
					opcion = teclado.nextLine();

					if (opcion.equals("1")) {
						System.out.println(" ");
						System.out.println("Ingrese cuenta de destino: ");
						String cuenta = teclado.nextLine();
						System.out.println(" ");
						System.out.println("Ingrese monto a transferir: ");
						int monto = teclado2.nextInt();
						saldo = saldo - monto;
						System.out.println(" ");
						System.out.println("Su nuevo saldo es: $" + saldo);

					} else if (opcion.equals("2")) {
						System.out.println(" ");
						System.out.println("No posee ningun movimiento");

					}
				} while (!opcion.equals("3"));
				//while (opcion == 1 || opcion == 2) (opcional)
				opcion = "0";

			} else {
				System.out.println(" ");
				System.out.println("CLAVE INCORRECTA");
				System.out.println(" ");

			}
		} while (!clave.equals("-1"));
		System.out.println("¡¡¡Gracias por preferirnos!!!");
	}

}
