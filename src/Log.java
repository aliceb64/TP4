public class Log extends OperationUnaire {

	public Log(Expression argument) {
		super(argument);
	}

	public double valeur(double x) {
		return Math.log(x);
	}
}
