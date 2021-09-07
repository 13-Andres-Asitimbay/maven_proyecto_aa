package ejercicios.clase.string;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Contains
		String frase = "Programación de Algoritmos Módulo 1";
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del libro: ");
		String palabra = teclado.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("¿Contiene la palabra?: " + resultado);
		
		
		//2.Equals
		System.out.println("**********************************************");
		String cadena1 = "Mechagodzilla";
		System.out.println("Ingrese la segunda cadena a comparar: ");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("¿Las cadenas son iguales?: " + resultado2);
		
		
		//3.Upper - 4.Lower
		System.out.println("**********************************************");
		String nombre = "juanito";
		String nombreMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayúscula: " + nombreMayuscula);
		
		String nombre2 = "JOSE";
		String nombreMinuscula= nombre2.toLowerCase();
		System.out.println("Nombre en minúscula: " + nombreMinuscula);
	}

}
