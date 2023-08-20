
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception { 
    
    LeitorDeArquivos leitor = new LeitorDeArquivos();
    HashMap<String, Personagem> personagens = leitor.LerPersonagem("rsc/perso.txt");
    HashMap<String, Capitulo> capitulos = leitor.LerCapitulo("rsc/teste1.txt", personagens);

    Capitulo raiz = capitulos.get("cap1");
    raiz.executar();

        
        

}
}