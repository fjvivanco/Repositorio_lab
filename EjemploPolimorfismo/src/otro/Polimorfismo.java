package otro;

import mundo.Animal;
import mundo.Gato;
import mundo.Perro;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a=new Gato();
		test(a);
		
		a=new Perro();
		test(a);
		
		Animal animales[]=new Animal [2];
		animales[0]=new Gato();
		animales[1]=new Perro();

	}
	public static void test(Animal animal) {
		animal.hacerRuido();
	}

}
