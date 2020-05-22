package Ulead.Ejemplo2;

public class Animal3 {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal3(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Animal3(int age) {
		super();
		this.age = age;
		this.name = null;
	}

}
