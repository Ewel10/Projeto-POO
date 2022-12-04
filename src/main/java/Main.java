import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando as peças do robo 1
        Motor m1 = new Motor(18, 1);
        Armadura ad1 = new Armadura(10, 100, 1);
        Concussiva cc1 = new Concussiva(10, 1, 0.3);

        // criando as peças do robo 2
        Motor m2 = new Motor(20, 1);
        Armadura ad2 = new Armadura(8, 120, 1);
        Perfurante p1 = new Perfurante(12, 1, 4);

        // criando os robos 1 e 2
        Robo r1 = new Robo("Bullbassauro", "RobotBulls", m1, ad1, cc1);
        Robo r2 = new Robo("Bullvidoso", "RobotBulls", m2, ad2, p1);

        // apresentação dos participantes
        System.out.println("Vai começar a luta!");
        System.out.println("Robo " + r1.getNome() + " da equipe " + r1.getEquipe() + " pesando " + (ad1.getPesoArmadura()+ m1.getPesoMotor() + r1.arma.pesoArma) + "kgs");
        System.out.println("X ------- VS ------- X");
        System.out.println("Robo " + r2.getNome() + " da equipe " + r2.getEquipe() + " pesando " + (ad2.getPesoArmadura()+ m2.getPesoMotor() + r2.arma.pesoArma) + "kgs");

        // loop da luta, acaba quando algum robo ficar sem velocidade ou sem resistencia
        while (ad1.getDurabilidade() > 0 && ad2.getDurabilidade() > 0 && r1.m.getVelocidade() > 0 && r2.m.getVelocidade() > 0) {
            // quando o primeiro robo for mais rapido, a luta começa com ele atacando
            if (m1.getVelocidade() >= m2.getVelocidade()) {
                System.out.println("O ROBO " + r1.getNome() + " ATACA!");
                if (r1.arma instanceof Concussiva) {
                    r2.m.setVelocidade(r2.m.getVelocidade() - ((Concussiva) r1.arma).getReducao());
                    ad2.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - ad2.getResistencia()));
                    System.out.println("A velocidade do robô " + r2.getNome() + " agora é " + r2.m.getVelocidade());
                    if (r2.m.getVelocidade() <= 0) {
                        System.out.println("Vitória do robô " + r1.getNome() + " por incapacitação! ");
                        break;
                    }
                }
                else if (r1.arma instanceof Perfurante){
                        ad2.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - (ad2.getResistencia()) - ((Perfurante) r1.arma).getPenetracao()));
                }
                else if (r1.arma instanceof Cortante){
                    ad2.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - ad2.getResistencia()) - ((Cortante) r1.arma).getDanoAdc());
                }
                System.out.println("DURABILIDADE DO " + r2.getNome() + " = " + ad2.getDurabilidade());
                if (ad2.getDurabilidade() > 0 && r2.m.getVelocidade() > 0) {
                    System.out.println("O ATAQUE DO ROBO " + r2.getNome());
                    if (r2.arma instanceof Concussiva) {
                        r1.m.setVelocidade(r1.m.getVelocidade() - ((Concussiva) r2.arma).getReducao());
                        ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - ad1.getResistencia()));
                        System.out.println("A velocidade do robô " + r1.getNome() + " agora é " + r1.m.getVelocidade());
                        if (r1.m.getVelocidade() <= 0) {
                            System.out.println("Vitória do robô " + r2.getNome() + " por incapacitação! ");
                            break;
                        }
                    }
                    else if (r2.arma instanceof Perfurante){
                        ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - (ad1.getResistencia()) - ((Perfurante) r2.arma).getPenetracao()));
                    }
                    else if (r2.arma instanceof Cortante){
                        ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - ad1.getResistencia()) - ((Cortante) r2.arma).getDanoAdc());
                    }
                    System.out.println("DEIXA A DURABILIDADE DO " + r1.getNome() + " = " + ad1.getDurabilidade());
                }

            }
            // quando o robo 2 for mais rapido, ele começa atacando
            else
            {
                System.out.println("O ROBO " + r2.getNome() + " ATACA!");
                if (r2.arma instanceof Concussiva) {
                    r1.m.setVelocidade(r1.m.getVelocidade() - ((Concussiva) r2.arma).getReducao());
                    ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - ad1.getResistencia()));
                    System.out.println("A velocidade do robô " + r1.getNome() + " agora é " + r1.m.getVelocidade());
                    if (r1.m.getVelocidade() <= 0) {
                        System.out.println("Vitória do robô " + r2.getNome() + " por incapacitação! ");
                        break;
                    }
                }
                else if (r2.arma instanceof Perfurante){
                    ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - (ad1.getResistencia()) - ((Perfurante) r2.arma).getPenetracao()));
                }
                else if (r2.arma instanceof Cortante){
                    ad1.setDurabilidade(ad1.getDurabilidade() - (r2.arma.danoBase - ad1.getResistencia()) - ((Cortante) r2.arma).getDanoAdc());
                }
                System.out.println("DURABILIDADE DO " + r1.getNome() + " = " + ad1.getDurabilidade());

                if (ad1.getDurabilidade() > 0 && r1.m.getVelocidade() > 0) {
                    System.out.println("O ATAQUE DO ROBO " + r1.getNome());
                    if (r1.arma instanceof Concussiva) {
                        r2.m.setVelocidade(r2.m.getVelocidade() - ((Concussiva) r1.arma).getReducao());
                        ad1.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - ad2.getResistencia()));
                        System.out.println("A velocidade do robô " + r2.getNome() + " agora é " + r2.m.getVelocidade());
                        if (r2.m.getVelocidade() <= 0) {
                            System.out.println("Vitória do robô " + r1.getNome() + " por incapacitação! ");
                            break;
                        }
                    }
                    else if (r1.arma instanceof Perfurante){
                        ad2.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - (ad2.getResistencia()) - ((Perfurante) r1.arma).getPenetracao()));
                    }
                    else if (r1.arma instanceof Cortante){
                        ad2.setDurabilidade(ad2.getDurabilidade() - (r1.arma.danoBase - ad2.getResistencia()) - ((Cortante) r1.arma).getDanoAdc());
                    }
                    System.out.println("DEIXA A DURABILIDADE DO " + r2.getNome() + " = " + ad2.getDurabilidade());
                }
            }
        }

        // criando um arquivo e definindo umas variaveis
        Arquivo arquivo = new Arquivo("Competidores.txt");

        boolean bull = false;
        int op = 0;
        Scanner input = new Scanner(System.in);

        // menu interativo
        while (!bull) {
            System.out.println("Menu de ações: ");
            System.out.println("Digite 1 para inserir os dados do vencedor.");
            System.out.println("Digite 2 para verificar a lista com os vencedores das versões anteriores.");
            System.out.println("Digite 3 para sair do menu.");
            op = input.nextInt();
            input.nextLine();
            switch (op) {
                case 1:
                    Competidor competidor = new Competidor();
                    System.out.println("Nome do competidor: ");
                    competidor.setNome(input.nextLine());
                    System.out.println("Equipe do competidor: ");
                    competidor.setEquipe(input.nextLine());
                    System.out.println("Nome do robô do vencedor: ");
                    competidor.setNomerobo(input.nextLine());
                    arquivo.escrever(competidor);
                    break;
                case 2:
                    try {
                        ArrayList<Competidor> competidors = arquivo.ler();
                        for (Competidor comp : competidors) {
                            comp.mostraInfo();
                        }
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Volte sempre!");
                    bull = true;
                    break;
                default:
                    System.err.println("Digite um numero válido!");
            }
        }
        }
    }