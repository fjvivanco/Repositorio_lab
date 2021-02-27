package mundo;

public class Estudiante extends Persona { // Va a heredar los atributos de la clase padre
	// Definir atributos
	private int codigoestudiante;
	private float notafinal;

	// Constructor
	public Estudiante(String pNombre, String pApellido, int pEdad, int pCodigo, float pNotafinal) {
		super(pNombre, pApellido, pEdad);
		codigoestudiante = pCodigo;
		notafinal = pNotafinal;
	}

	// Metodo para mostrar notas
	public void mostrarNotas() {
		System.out.println("Nombre:" + getNombre() + "Apellido:" + getApellido() + "Edad:" + getEdad()
				+ " Codigo Estudiante:" + codigoestudiante + " Nota Final:" + notafinal);
	}
}
