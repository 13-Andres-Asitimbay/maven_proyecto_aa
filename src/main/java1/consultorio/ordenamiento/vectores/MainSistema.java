package consultorio.ordenamiento.vectores;

import java.util.Arrays;
import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		Paciente paciente3 = new Paciente();
		Paciente paciente4 = new Paciente();
		Paciente paciente5 = new Paciente();
		Paciente registro[] = new Paciente[5];
		int contador = 0;
		
		do {
			do {
				System.out.println("Consultorio del Dr. Herbert West, bienvenido");
				System.out.println("   1. Registrar paciente");
				System.out.println("   2. Imprimir reporte");
				System.out.println("   3. SALIR");
				opcion = teclado.nextInt();
			}while(opcion < 1 || opcion > 3);
			
			if (opcion == 1) {
				System.out.println(" ");
				System.out.print("Ingrese el nombre del paciente: ");
				String nombre = teclado2.nextLine();
				
				System.out.print("Ingrese el apellido del paciente: ");
				String apellido = teclado2.nextLine();
				
				System.out.print("Ingrese la edad del paciente: ");
				int edad = teclado.nextInt();
				
				System.out.print("Ingrese el síntoma del paciente: ");
				String sintoma = teclado2.nextLine();
				
				System.out.println(" ");
				
				if (contador == 0) {
					paciente1.setNombre(nombre);
					paciente1.setApellido(apellido);
					paciente1.setEdad(edad);
					paciente1.setSintoma(sintoma);
					registro[contador] = paciente1;
					
				} else if (contador == 1) {
					paciente2.setNombre(nombre);
					paciente2.setApellido(apellido);
					paciente2.setEdad(edad);
					paciente2.setSintoma(sintoma);
					registro[contador] = paciente2;
					
				} else if (contador == 2) {
					paciente3.setNombre(nombre);
					paciente3.setApellido(apellido);
					paciente3.setEdad(edad);
					paciente3.setSintoma(sintoma);
					registro[contador] = paciente3;
					
				} else if (contador == 3) {
					paciente4.setNombre(nombre);
					paciente4.setApellido(apellido);
					paciente4.setEdad(edad);
					paciente4.setSintoma(sintoma);
					registro[contador] = paciente4;
					
				} else if (contador == 4) {
					paciente5.setNombre(nombre);
					paciente5.setApellido(apellido);
					paciente5.setEdad(edad);
					paciente5.setSintoma(sintoma);
					registro[contador] = paciente5;
					
				}
				
				
			} else if (opcion == 2) {
				Arrays.sort(registro);
				System.out.println(" ");
				for(int i = 0 ; i < 5 ; i++) {
					System.out.println(registro[i]);
				}
				System.out.println(" ");
				
			} else if (opcion == 3) {
				System.out.println(" ");
				System.out.print("HASTA PRONTO");
				System.out.println(" ");
				
			}
			contador = contador + 1;
		}while(opcion != 3);
		
	}

}
