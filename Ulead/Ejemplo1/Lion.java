package Ulead.Ejemplo1;

public class Lion extends Animal { // EL EXTENDS PERMITE REALIZAR LA HEREDACION DE LA CLASE ANIMAL

	public void roar() {

		System.out.println("The " + super.getAge() + " year old lion says: Roar!");

	}

}
