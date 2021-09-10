package consultorio.ordenamiento.vectores;

public class Paciente implements Comparable<Paciente>{
	
	private String nombre;
	private String apellido;
	private int edad;
	private String sintoma;
	
	//Métodos GET y SET
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getSintoma() {
		return sintoma;
	}
	
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	//Método compareTo()
	public int compareTo(Paciente o) {
		if (this.edad < o.getEdad()) {
			return 1;

		} else if (this.edad == o.getEdad()) {
			return 0;

		} else {
			return -1;

		}

	}

	//Método toString()
	@Override
	public String toString() {
		return "Paciente: " + nombre + " - Apellido: " + apellido + " - Edad: " + edad + " - Síntoma: " + sintoma;
	}
	
}
