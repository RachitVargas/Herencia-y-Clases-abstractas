package Ulead.Ejemplo7;

public class Wolf extends Canine {

	public double getAverageWeight() {
		return super.getAverageWeight() + 20; // EL SUPER. AYUDA A INDENTIFICAR EL METODO DE LA CLASE PADRE
	}

	public static void main(String[] args) {
		
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
	}
}
