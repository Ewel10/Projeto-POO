public class Motor {
    private double velocidade;
    private double pesoMotor;

    public Motor(double velocidade, double pesoMotor) {
        this.velocidade = velocidade;
        this.pesoMotor = pesoMotor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getPesoMotor() {
        return pesoMotor;
    }

    public void setPesoMotor(double pesoMotor) {
        this.pesoMotor = pesoMotor;
    }
}
