package Ulead.Ejemplo2;

public class Gorilla extends Animal3 {

	public Gorilla(int age) {
		super(age, "Gorilla");
	}

	public Gorilla() {
		super(5);
	}

	public void test() {

		System.out.println("Edad del gorilla: " + super.getAge());
		System.out.println("Nombre del gorilla:" + this.getName());
		
	}

}