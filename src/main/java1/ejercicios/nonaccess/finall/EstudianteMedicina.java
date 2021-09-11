package ejercicios.nonaccess.finall;

public class EstudianteMedicina extends Estudiante{
	
	protected final void realizarPracticas() {
		System.out.println("Realiza 50 horas de prácticas");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de pasantias");
	}
	
}
