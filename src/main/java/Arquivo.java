import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public String nomeArquivo;
    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bf;

    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;

    private String linha;

    public Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        // Inicializando com null
        os = null;
        osw = null;
        bf = null;

        is = null;
        isr = null;
        br = null;
    }

    public void escrever(Competidor competidor){
        try{
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);

            bf.write("Competidor:" + "\n");
            bf.write(competidor.getNome() + "\n");
            bf.write(competidor.getEquipe() + "\n");
            bf.write(competidor.getNomerobo() + "\n");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try{
                bf.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Competidor> ler(){
        ArrayList<Competidor> competidors = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine();
            while(linha != null) {
                if (linha.contains("Competidor")) {
                    Competidor competidor = new Competidor();
                    competidor.setNome(br.readLine());
                    competidor.setEquipe(br.readLine());
                    competidor.setNomerobo(br.readLine());
                    competidors.add(competidor);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return competidors;
    }

}