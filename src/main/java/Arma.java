public abstract class Arma {
    public double danoBase; // multiplicador baseado na força e no tipo
    public double pesoArma;

    public Arma(double danoBase, double pesoArma) {
        this.danoBase = danoBase;
        this.pesoArma = pesoArma;
    }
}
