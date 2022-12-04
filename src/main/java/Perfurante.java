public class Perfurante extends Arma{
    // essa arma ignora um pouco a resistencia da armadura do inimigo
    private double penetracao;

    public Perfurante(double danoBase, double pesoArma, double penetracao) {
        super(danoBase, pesoArma);
        penetracao = this.penetracao;
    }

    public double getPenetracao() {
        return penetracao;
    }

    public void setPenetracao(double penetracao) {
        this.penetracao = penetracao;
    }
}
