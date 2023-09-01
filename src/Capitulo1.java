import java.util.Scanner;
import java.util.ArrayList;


public class Capitulo1 {
    private Scanner escaneador = new Scanner(System.in);
    protected String texto;
    protected ArrayList<Escolha1> escolhas;
    protected personagem personagem;
    protected int Alteraçãodeenergia;
   

    protected Capitulo1(String texto,ArrayList<Escolha1> escolhas, personagem personagem, int Alteraçãodeenergia){
        this.texto = texto;
        this.personagem = personagem;
        this.Alteraçãodeenergia = Alteraçãodeenergia;
        this.escolhas = new ArrayList<>();
    }
    
         public void executar() {
            mostrar();
            escolher();
         }
         protected void mostrar(){
            System.out.println();
         System.out.println(this.texto);
            System.out.println("Nome: " + personagem.getNome());
        System.out.println("Energia: " + personagem.getEnergia());
        if(escolhas == null){
        System.out.println("Digite a opção desejada: ");}

        for (Escolha1 escolha : escolhas){
            System.out.println(escolha.getTexto());
        
    
        if(Alteraçãodeenergia != 0){
            this.personagem.alteraçãoEnergia1(Alteraçãodeenergia);
        }}
    
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

    public String getTexto() {
        return texto;
    }

}

        

        
         