public class Concussiva extends Arma{
    // esse tipo de arma reduz a velocidade do oponente!
    private double reducao;

    public Concussiva(double danoBase, double pesoArma, double reducao) {
        super(danoBase, pesoArma);
        this.reducao = reducao;
    }

    public double getReducao() {
        return reducao;
    }

    public void setReducao(double reducao) {
        this.reducao = reducao;
    }
}
