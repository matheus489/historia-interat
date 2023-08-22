import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorDeArquivos {
    HashMap<String,personagem> Buscapersonagem(String caminho){
        HashMap<String,personagem> personagens = new HashMap<String,personagem>();

        File arquivo = new File(caminho);
        try{
            Scanner leitor = new Scanner(arquivo,"UTF-8");

            while (leitor.hasNextLine()){
                    String id = leitor.nextLine();
                    String nome = leitor.nextLine();
                    int Alteraçãodeenergia = Integer.parseInt(leitor.nextLine());
                    personagem consPersonagem = new personagem(nome,Alteraçãodeenergia);
                    personagens.put(id, consPersonagem);


                }

            
            leitor.close();
        }
         catch(FileNotFoundException x){
            System.out.println("O arquivo não foi encontrado no caminho: " + caminho );
        }
         return personagens;
}

    HashMap<String,Capitulo1> Buscacapitulo (String caminho, HashMap<String,personagem> persongens){
        HashMap<String,Capitulo1> Capitulo1s = new HashMap<String,Capitulo1>();
        File arquivocap = new File(caminho);
        try{
            Scanner leitor = new Scanner(arquivocap,"UTF-8");
            
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                if(linha.equalsIgnoreCase("CAPITULO")){
                    ArrayList<Escolha1> escolha = new ArrayList<Escolha1>();
                    String origem = leitor.nextLine();
                    String texto = leitor.nextLine();
                    String refpersonagem = leitor.nextLine();
                    int alteração = Integer.parseInt(leitor.nextLine());
                    Capitulo1 Capitulo1 = new Capitulo1(texto,escolha,persongens.get(refpersonagem),alteração );
                    Capitulo1s.put(origem,Capitulo1);
                }
                else if(linha.equalsIgnoreCase("ESCOLHA")){
                    String origem = leitor.nextLine();
                    String escolha = leitor.nextLine();
                    String saida = leitor.nextLine();
                    Capitulo1s.get(origem).addescolhas(new Escolha1(escolha, Capitulo1s.get(saida)));
                }

            }
            leitor.close();
        }
        catch(FileNotFoundException x){
            System.out.println("O arquivo não foi encontrado no caminho: " + caminho);
        }
        return Capitulo1s;
    }
}