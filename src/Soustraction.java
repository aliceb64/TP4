public class Soustraction extends OperationBinaire {

	public Soustraction(Expression gauche, Expression droite) {
		super(gauche, droite);
	}

	public double valeur(double x) {
		return gauche.valeur(x) - droite.valeur(x);
	}
}