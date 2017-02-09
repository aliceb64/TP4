public abstract class OperationBinaire implements Expression {

	protected Expression gauche, droite;

	protected OperationBinaire(Expression gauche, Expression droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
}