public class Sin extends OperationUnaire {

	public Sin(Expression argument) {
		super(argument);
	}

	public double valeur(double x) {
		return Math.sin(x);
	}
}
