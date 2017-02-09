public class Exp extends OperationUnaire {

	public Exp(Expression argument) {
		super(argument);
	}

	public double valeur(double x) {
		return Math.exp(x);
	}
}
