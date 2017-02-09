public class Addition extends OperationBinaire {

	public Addition(Expression gauche, Expression droite) {
		super(gauche, droite);
	}

	public double valeur(double x) {
		return gauche.valeur(x) + droite.valeur(x);
	}
}
