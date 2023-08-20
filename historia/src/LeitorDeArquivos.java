import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorDeArquivos {
    HashMap<String,Personagem> LerPersonagem(String caminho){
        HashMap<String,Personagem> personagens = new HashMap<String,Personagem>();

        File arquivo = new File(caminho);
        try{
            Scanner leitor = new Scanner(arquivo,"UTF-8");
            System.out.println("Lendo os personagens...");
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                if (linha.equalsIgnoreCase("PERSONAGEM")){
                    String id = leitor.nextLine();
                    String nome = leitor.nextLine();
                    int felicidade = Integer.parseInt(leitor.nextLine());
                    Personagem ator = new Personagem(nome,felicidade);
                    personagens.put(id, ator);


                }

            }
            leitor.close();
        }
         catch(FileNotFoundException x){
            System.out.println("O arquivo que voce procura não foi encontrado no caminho: " + caminho );
        }
         return personagens;
}

    HashMap<String,Capitulo> LerCapitulo (String caminho, HashMap<String,Personagem> persongens){
        HashMap<String,Capitulo> capitulos = new HashMap<String,Capitulo>();
        File arquivocap = new File(caminho);
        try{
            Scanner leitor = new Scanner(arquivocap,"UTF-8");
            System.out.println("Lendo os Capítulos...");
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                if(linha.equalsIgnoreCase("CAPITULO")){
                    ArrayList<Escolha> escolha = new ArrayList<Escolha>();
                    String origem = leitor.nextLine();
                    String texto = leitor.nextLine();
                    String refpersonagem = leitor.nextLine();
                    int mudanca = Integer.parseInt(leitor.nextLine());
                    Capitulo capitulo = new Capitulo(texto,escolha,persongens.get(refpersonagem),mudanca );
                    capitulos.put(origem,capitulo);
                }
                else if(linha.equalsIgnoreCase("ESCOLHA")){
                    String origem = leitor.nextLine();
                    String escolha = leitor.nextLine();
                    String saida = leitor.nextLine();
                    capitulos.get(origem).addescolhas(new Escolha(escolha, capitulos.get(saida)));
                }

            }
            leitor.close();
        }
        catch(FileNotFoundException x){
            System.out.println("O arquivo que voce procura não foi encontrado no caminho: " + caminho);
        }
        return capitulos;
    }
}