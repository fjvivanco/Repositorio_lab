package mundo;

public class Persona {
	//Definir atributos:protected va a servir para las clases hijas
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	//Metodo constructor con parametros
	public Persona(String pNombre,String pApellido, int pEdad) {
		nombre=pNombre;
		apellido=pApellido;
		edad=pEdad;	
	}
	
	//Metodos get
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
}
