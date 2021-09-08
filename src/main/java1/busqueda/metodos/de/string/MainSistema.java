package busqueda.metodos.de.string;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		Estudiante estudiante3 = new Estudiante();
		Estudiante estudiante4 = new Estudiante();
		Estudiante estudiante5 = new Estudiante();
		Estudiante nomina[] = new Estudiante[5];
		int contador = 0;

		do {
			System.out.println("BIENVENIDO, SELECCIONE UNA OPCION");
			System.out.println("  1. Ingresar Estudiante");
			System.out.println("  2. Buscar Estudiante");
			System.out.println("  3. SALIR");
			opcion = teclado.nextInt();
			System.out.println(" ");

			if (opcion == 1) {
				System.out.println("Ingrese la cédula del estudiante: ");
				String cedula = teclado2.nextLine();
				System.out.println(" ");
				if (contador == 0) {				
					estudiante1.setCedula(cedula);
					nomina[contador] = estudiante1;
					
				} else if (contador == 1) {
					estudiante2.setCedula(cedula);
					nomina[contador] = estudiante2;
					
				} else if (contador == 2) {
					estudiante3.setCedula(cedula);
					nomina[contador] = estudiante3;
					
				}else if (contador == 3) {
					estudiante4.setCedula(cedula);
					nomina[contador] = estudiante4;
					
				}else if (contador == 4) {
					estudiante5.setCedula(cedula);
					nomina[contador] = estudiante5;
					
				}
				

			} else if (opcion == 2) {
				System.out.println("Ingrese la cédula para buscar al estudiante: ");
				String cedula2 = teclado2.nextLine();
				System.out.println(" ");
				for(int i = 0 ; i < 5 ; i++) {
					Estudiante estudiante = nomina[i];
					String cedula = estudiante.getCedula();
					boolean resultado = cedula2.equals(cedula);
					if(resultado == true) {
						System.out.println("Se ha encontrado al estudiante");
						System.out.println(" ");
						
					} else if (resultado == false) {
						System.out.println("No se ha encontrado al estudiante");
						System.out.println(" ");
						
					}
					
				}
				
			}
			contador = contador + 1;
		} while (opcion != 3);

	}

}
