public class Cos extends OperationUnaire {

	public Cos(Expression argument) {
		super(argument);
	}

	public double valeur(double x) {
		return Math.cos(x);
	}
}