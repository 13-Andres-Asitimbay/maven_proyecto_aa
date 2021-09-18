package ejercicios.coleccion.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero1 = 1;
		Integer numero2 = 2;
		Integer numero3 = 3;
		Integer numero4 = 4;

		List<Integer> listaNueva = new ArrayList<Integer>();
		// Una interfaz List no puede contener datos primitivos, solo clases Wrappers
		listaNueva.add(numero1);
		listaNueva.add(numero2);
		listaNueva.add(numero3);
		listaNueva.add(numero4);
		
		//La interfaz List simplifica el proceso de un vector
		int vector[] = new int[10];
	}

}
