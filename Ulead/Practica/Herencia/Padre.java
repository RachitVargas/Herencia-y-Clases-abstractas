package Ulead.Practica.Herencia;

public class Padre {

	protected String carro;
	protected int casas;

	public int getCasas() {
		return casas;
	}

	public void setCasas(int casas) {
		this.casas = casas;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public Padre(int casas, String carro) {
		super();
		this.carro = carro;
		this.casas = casas;

	}

	public int edadDelPadre() {
		return 36;

	}

	public String metas() {
		return "Construir una fundación para ayudar a las personas";

	}
}
