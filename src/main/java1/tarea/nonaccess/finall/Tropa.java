package tarea.nonaccess.finall;

public class Tropa extends Militar{
	
	private String rango = "Soldado";
	private final String ejercito = "ECUATORIANO";
	
	protected void realizarMisiones() {
		System.out.println("El soldado realiza las misiones encargadas por los superiores.");
	}
	
	/*Se declara como final ya que esta no es una orden oficial,
	sino un método personal del soldado.*/
	protected final void realizarTareasExtras() {
		System.out.println("El soldado realiza tareas extras para ganar un ascenso.");
	}
	
}
