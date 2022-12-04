public class Competidor {
    private String nome;
    private String equipe;
    private String nomerobo;

    public void mostraInfo(){
        System.out.println("Informações do vencedor: ");
        System.out.println("Nome do competidor: " + this.nome);
        System.out.println("Equipe pertencente: " + this.equipe);
        System.out.println("Nome do Robo: " + this.nomerobo);
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

    public String getNomerobo() {
        return nomerobo;
    }

    public void setNomerobo(String nomerobo) {
        this.nomerobo = nomerobo;
    }
}
