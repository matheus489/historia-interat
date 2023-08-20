import java.util.Scanner;
import java.util.ArrayList;


public class Capitulo1 {
    private Scanner escaneador = new Scanner(System.in);
    private String texto;
    private ArrayList<Escolha1> escolhas;
    private personagem personagem;
    private int Alteraçãodeenergia;
   

    public Capitulo1(String texto,ArrayList<Escolha1> escolhas, personagem personagem, int Alteraçãodeenergia){
        this.texto = texto;
        this.personagem = personagem;
        this.Alteraçãodeenergia = Alteraçãodeenergia;
        this.escolhas = new ArrayList<>();
    }

    public void mostrar(){
         System.out.println(this.texto);
        
    
        if(Alteraçãodeenergia != 0){
            this.personagem.mudaFelicidade(Alteraçãodeenergia);
        }
    
    }
         public void executar() {
            mostrar();
            escolher();
         }
        


         public void escolher(){
            boolean escolhaValida = true;
            while (escolhaValida) {
                String resposta = escaneador.nextLine();
                for (Escolha1 escolha : escolhas) {
                    if (resposta.equalsIgnoreCase(escolha.getTexto())) {
                        escolhaValida = false;
                        Capitulo1 proximoCapitulo = escolha.getProximo();
                        proximoCapitulo.executar();
                        return;
            }  
       
          }
          System.out.println("Você digitou errado, tente novamente!");
       }
    }

    public Scanner getEscanar() {
        return escaneador;
    }

    public void setEscanear(Scanner escaneador) {
        this.escaneador = escaneador;
    }

   
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Escolha1> getEscolhas() {
        return escolhas;
    }

    public void addescolhas(Escolha1 escolha){
        escolhas.add(escolha);
    } 
   
    public personagem getPersonagem() {
        return personagem;
    }

  
    public void setPersonagem(personagem personagem) {
        this.personagem = personagem;
    }

    public int getAlteraçãodeenergia() {
        return Alteraçãodeenergia;
    }


    public void setAlteraçãodeenergia(int qtdfeliz) {
        this.Alteraçãodeenergia = qtdfeliz;
    }

}

        

        
         