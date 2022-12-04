public class Cortante extends Arma{
    // esse tipo de arma tem um dano fixo adicional!

    private double danoAdc;

    public Cortante(double danoBase, double pesoArma, double danoAdc) {
        super(danoBase, pesoArma);
        danoAdc = this.danoAdc;
    }

    public double getDanoAdc() {
        return danoAdc;
    }

    public void setDanoAdc(double danoAdc) {
        this.danoAdc = danoAdc;
    }
}
