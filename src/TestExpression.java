public class TestExpression {

	public static void main(String[] args) {
		// f(x) = 2 * sin(x) + 3 * cos(x)
		Expression f = new Addition(new Multiplication(new Constante(2), new Sin(new Variable())),
				new Multiplication(new Constante(3), new Cos(new Variable())));

		double[] x = { 0, 0.5, 1, 1.5, 2, 2.5 };
		for (int i = 0; i < x.length; i++)
			System.out.println("f(" + x[i] + ") = " + f.valeur(x[i]));
	}
}
