package Ulead.Ejemplo2;

public class Zebra extends Animal2 {

	// HAY DOS CONSTRUCTORES
	
	public Zebra(int age) {
		super(age);
	}

	public Zebra() {
		this(4);
	}

	public void test () {	
		
		System.out.println("Edad de la Zebra: " + this.getAge());
	}
	
}
