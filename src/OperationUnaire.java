public abstract class OperationUnaire implements Expression {

	protected Expression argument;

	protected OperationUnaire(Expression argument) {
		this.argument = argument;
	}
}
