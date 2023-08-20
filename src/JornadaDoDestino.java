import java.util.HashMap;
import java.util.Scanner;

public class JornadaDoDestino {

    public static void main(String[] args) {
        LeitorDeArquivos leitor = new LeitorDeArquivos();
        Scanner escaneador = new Scanner(System.in, "UTF-8");

        HashMap<String, personagem> personagens = leitor.Buscapersonagem("rsc/teste1.txt");
HashMap<String, Capitulo1> capitulos = leitor.Buscacapitulo("rsc/teste.txt", personagens);
        
        Capitulo1 raiz = capitulos.get("mensagempricipal");
        raiz.executar();

        escaneador.close();

    }

}