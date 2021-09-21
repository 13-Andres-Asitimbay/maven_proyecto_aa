package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(); //Esta clase esta deprecada y no se debería usar.
		
		//Esta es una convención, algo que se debe realizar de esta manera
		LocalDate diaHoy = LocalDate.now(); //Para obtener la fecha actual.
		LocalDate diaFin = diaHoy.plusDays(15);//Aumentar 15 días
		//System.out.println(diaHoy);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Voley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		System.out.println("Nombre del curso: " + curso1.getNombre());
		System.out.println("Fecha de inicio: " + curso1.getFechaInicio());
		System.out.println("Fecha de cierre: " + curso1.getFechaFin());
		System.out.println(" ");
		
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("Nombre del curso: " + curso2.getNombre());
		System.out.println("Fecha de inicio: " + curso2.getFechaInicio());
		System.out.println("Fecha de cierre: " + curso2.getFechaFin());
		System.out.println(" ");
		
		
		//Establecer fechas específicas
		LocalDate fechaEspecifica = LocalDate.of(2022, 02, 15);
		System.out.println(fechaEspecifica);
		System.out.println(" ");
		
		//Ejercicios
		LocalDate fechaEspecifiIni = LocalDate.of(2022, 02, 15);
		LocalDate fechaEspecifiFin = LocalDate.of(2022, 07, 10);
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspecifiIni);
		curso3.setFechaFin(fechaEspecifiFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre del curso: " + curso3.getNombre());
		System.out.println("Fecha de inicio: " + curso3.getFechaInicio());
		System.out.println("Fecha de cierre: " + curso3.getFechaFin());
		
	}

}
