public class Constante implements Expression {

	private double valeur;

	public Constante(double valeur) {
		this.valeur = valeur;
	}

	public double valeur(double x) {
		return valeur;
	}
}
