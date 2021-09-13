package tarea.nonaccess.finall;

public class Cabo extends Tropa {
	
	protected void realizarMisiones() {
		System.out.println("El cabo también realiza las misiones encargadas por los superiores.");
	}
	
	/*Al no ser una tarea oficial suya sino una personal del soldado, 
	el cabo no esta obligado a realizar este método*/
	protected final void realizarTareasExtras() {
		System.out.println("El cabo no esta obligado a realizar tareas extras, esto es cosa personal del soldado.");
	}

}
