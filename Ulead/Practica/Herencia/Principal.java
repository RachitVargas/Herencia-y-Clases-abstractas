package Ulead.Practica.Herencia;

public class Principal {

	public static void main(String args[]) {

		Hijo hijo = new Hijo();

		hijo.cosasHeredadas();

		System.out.println("El padre tiene 20 a�os m�s que el hijo y ahora el padre tiene "
				+ (new Hijo().edadDelHijo() + 20) + ", entonces su hijo tiene: " + new Hijo().edadDelHijo());

		System.out.println(new Hijo().metas());
	}

}
