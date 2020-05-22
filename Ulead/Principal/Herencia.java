package Ulead.Principal;

import Ulead.Ejemplo1.Lion;
import Ulead.Ejemplo2.Gorilla;
import Ulead.Ejemplo2.Zebra;
import Ulead.Ejemplo3.Elephant;
import Ulead.Ejemplo5.Shark;
import Ulead.Ejemplo7.Bird;
import Ulead.Ejemplo7.Eagle;

public class Herencia {

	public static void main(String[] args) {

		Lion lion = new Lion();
		Zebra zebra = new Zebra ();
		Gorilla gorilla = new Gorilla();
		Shark shark = new Shark (0);
		Bird bird = new Bird (); 
		Eagle eagle = new Eagle ();
		//
		
		// ESTO ES PARA COMPROBAR LAS HERENCIAS
		lion.roar(); 
		System.out.println("***************");
		zebra.test();
		System.out.println("***************");
		gorilla.test(); 
		System.out.println("***************");
		shark.displaySharkDetails();
		System.out.println("***************");
		bird.eat(1);
		bird.fly();
		System.out.println("***************");
		eagle.eat(2);
		eagle.fly();


	}

}


