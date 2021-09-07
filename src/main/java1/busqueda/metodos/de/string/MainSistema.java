package busqueda.metodos.de.string;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		Estudiante estudiante1 = new Estudiante();
		Estudiante nomina[] = new Estudiante[5];
		int i = 0;

		do {
			System.out.println("BIENVENIDO, SELECCIONE UNA OPCION");
			System.out.println("  1. Ingresar Estudiante");
			System.out.println("  2. Buscar Estudiante");
			System.out.println("  3. SALIR");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese la cédula del estudiante: ");
				String cedula = teclado2.nextLine();
				estudiante1.setCedula(cedula);
				nomina[i] = estudiante1;

			} else if (opcion == 2) {
				System.out.println("Ingrese la cédula del estudiante: ");
				String cedula2 = teclado2.nextLine();
				boolean resultado1 = nomina[0].equals(cedula2);
				boolean resultado2 = nomina[1].equals(cedula2);
				boolean resultado3 = nomina[2].equals(cedula2);
				boolean resultado4 = nomina[3].equals(cedula2);
				boolean resultado5 = nomina[4].equals(cedula2);
				
				if (resultado1 == true) {
					System.out.println("Se ha encontrado al estudiante");
					
				} else {
					System.out.println("No se ha encontrado al estudiante");
					
				}
				
				if (resultado2 == true) {
					System.out.println("Se ha encontrado al estudiante");
					
				} else {
					System.out.println("No se ha encontrado al estudiante");
					
				}
				
				if (resultado3 == true) {
					System.out.println("Se ha encontrado al estudiante");
					
				} else {
					System.out.println("No se ha encontrado al estudiante");
					
				}
				
				if (resultado4 == true) {
					System.out.println("Se ha encontrado al estudiante");
					
				} else {
					System.out.println("No se ha encontrado al estudiante");
					
				}
				
				if (resultado5 == true) {
					System.out.println("Se ha encontrado al estudiante");
					
				} else {
					System.out.println("No se ha encontrado al estudiante");
					
				}
				
			}
			i = i+1;
		} while (opcion != 3);

	}

}
