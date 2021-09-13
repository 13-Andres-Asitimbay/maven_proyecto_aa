package tarea.nonaccess.finall;

public final class Oficial extends Militar {

	private String rango = "Coronel";
	private final String ejercito = "ECUATORIANO";

	public Oficial() {
		/*Como rango no es final, puedo cambiar su valor, ya que en el rango de Oficial
		existen mas cargos*/
		rango = "Capitán";
		
		/*Es una variable final, los militares de este programa pertenecen
		al ejército Ecuatoriano, por lo que nadie puede cambiar eso*/
		ejercito = "PERUANO";
	}

}
