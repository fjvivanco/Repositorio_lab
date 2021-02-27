package mundo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un objeto
		Estudiante estudiante=new Estudiante("Fernando ","Vivanco ", 20 , 3121 ,17.8f);
		estudiante.mostrarNotas();
		System.out.println(estudiante.getApellido());
	}

}
