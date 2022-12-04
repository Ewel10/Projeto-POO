public class Armadura {
    private double resistencia;
    private double durabilidade;
    private double pesoArmadura;

    public Armadura(double resistencia, double durabilidade, double pesoArmadura) {
        this.resistencia = resistencia;
        this.durabilidade = durabilidade;
        this.pesoArmadura = pesoArmadura;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(double durabilidade) {
        this.durabilidade = durabilidade;
    }

    public double getPesoArmadura() {
        return pesoArmadura;
    }

    public void setPesoArmadura(double pesoArmadura) {
        this.pesoArmadura = pesoArmadura;
    }
}
