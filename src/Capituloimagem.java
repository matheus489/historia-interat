import java.util.ArrayList;

public class Capituloimagem extends Capitulo1 {

private String imagem;

protected Capituloimagem(String texto, ArrayList<Escolha1> escolhas, personagem personagem,
int Alteraçãodeenergia, String imagem) {
        super(texto, escolhas, personagem, Alteraçãodeenergia);
        this.imagem = imagem;
        
    }

protected void mostrar(){
System.out.println("\n" + this.imagem);
System.out.println("\n" + this.texto);

for (Escolha1 escolha : escolhas){
System.out.println(escolha.getTexto());


}


}}

