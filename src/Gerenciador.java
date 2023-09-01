import java.util.HashMap;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;


public class Gerenciador {


    @FXML
    private Button Butãoiniciar;


    @FXML
    private TextArea Caixadeentrada;


     @FXML
    private VBox EscolhasVbox;
   
    @FXML
    void iniciar(ActionEvent event) {
        LeitorDeArquivos leitor = new LeitorDeArquivos();
            HashMap<String, personagem> personagens = leitor.Buscapersonagem("rsc/personagens.txt");
            HashMap<String, Capitulo1> capitulos = leitor.Buscacapitulo("rsc/Capitulo1s.txt", personagens);
            Capitulo1 raiz = capitulos.get("mensagempricipal");
            this.mostrar(raiz);
        this.Butãoiniciar.setVisible(false);  }

    void mostrar(Capitulo1 capitulo){
            boolean capimagem = capitulo instanceof Capituloimagem;
        if(capimagem){
            Capituloimagem capituloimagem = (Capituloimagem) capitulo;
this.Caixadeentrada.setText(capituloimagem.getTexto()+"\n"+"Seu nome é:"+capituloimagem.personagem.getNome() + "\n" +"Sua Energia é:" +capituloimagem.personagem.getEnergia()+ "\n" + capituloimagem.getImagem()+"\n");
        }else{
            this.Caixadeentrada.setText(capitulo.getTexto()+"\n"+"Seu nome é:"+capitulo.personagem.getNome() + "\n" +"Sua Energia é:" +capitulo.personagem.getEnergia()+ "\n");
        }
        for (Escolha1 escolha : capitulo.getEscolhas()) {
            Button botao = new Button(escolha.getTexto());
            
            botao.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Capitulo1 proximoCapitulo = escolha.getProximo();
                    EscolhasVbox.getChildren().clear();
            mostrar(proximoCapitulo);
                }
                
            });
            this.EscolhasVbox.getChildren().add(botao);
            
            
}
        }
     
    

    }



    
    
