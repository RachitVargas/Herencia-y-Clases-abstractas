package Ulead.Ejemplo5;

class Fish {

	protected int size; // EL COMANDO PROTECTED NOS PERMITE ENCAPSULAR Y PERMITIR QUE SOLO LA CLASE HIJA
						// SEA LA QUE PUEDE USAR ESTE OBJETO
	protected int age;

	public Fish(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}

public class Shark extends Fish {

	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		this.age = 2;
		this.size = 4;
	}

	public void displaySharkDetails() {
		
		 System.out.print("Shark with age: "+super.getAge());
		 System.out.print(" and "+super.size+" meters long");
		 System.out.println(" with "+this.numberOfFins+" fins");
		 
//		System.out.print("Shark with age: " + super.getAge());
//		System.out.print(" and " + super.size + " meters long");
//		System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE 
		// PARA QUE LA ULTIMA INSTRUCCION FUNCIONE, SE DEBE ELIMINAR EL SUPER. Y DEJARLO SOLAMENTE CON EL NUMBEROFFINS 

	}
}
