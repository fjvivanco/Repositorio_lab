package mundo.abstracto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planta a = new Planta();
		AnimalCarnivoro b = new AnimalCarnivoro();
		AnimalHerbivoro c = new AnimalHerbivoro();
		
		a.alimentarse();
		b.alimentarse();
		c.alimentarse();

	}

}
