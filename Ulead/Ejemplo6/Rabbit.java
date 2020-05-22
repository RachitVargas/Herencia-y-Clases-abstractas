package Ulead.Ejemplo6;

class Dog {

	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog() {

	}

}

public class Rabbit extends Dog {

	public Rabbit(int age) {
		super();
		super.setAge(10);
	}

//	public Rabbit(int age) { // ERROR DE SINTAXYS
//		 super; // DOES NOT COMPILE
//		 super().setAge(10); // DOES NOT COMPILE
//		}
}
