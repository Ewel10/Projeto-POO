public class Robo {
    private String nome;
    private String equipe;

    Motor m;
    Armadura ad;
    Arma arma;

    public Robo(String nome, String equipe, Motor m, Armadura ad, Arma arma) {
        this.nome = nome;
        this.equipe = equipe;
        this.m = m;
        this.ad = ad;
        this.arma = arma;
    }


    public void mostraInfo(){
        System.out.println("Robo: " + this.nome);
        System.out.println("Equipe do Robo: " + this.equipe);
        System.out.println("Vida restante do robo: " + ad.getDurabilidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
