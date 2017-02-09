public class Multiplication extends OperationBinaire {

    public Multiplication(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    public double valeur(double x) {
        return gauche.valeur(x) * droite.valeur(x);
    }
}
