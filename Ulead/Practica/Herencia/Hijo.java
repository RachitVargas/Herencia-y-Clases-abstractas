package Ulead.Practica.Herencia;

public class Hijo extends Padre {

	public Hijo(String carro, int casas) {
		super(casas, carro);

	}

	public Hijo() {
		super(5, "Nissan Yaris y Toyota Prado");

	}

	public void cosasHeredadas() {

		System.out.println("El carro hererado del hijo por parte del padre es: " + this.getCarro());
		System.out.println("El hijo heredada del padre la siguente cantidad de casas: " + super.casas);

	}

	public int edadDelHijo() {
		return super.edadDelPadre() - 20;

	}

	public String metas() {
		return "El sueño del padre es el mismo que tiene el hijo. El sueño heredado es: " + super.metas();

	}
}
