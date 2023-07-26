
import java.util.Scanner;

class Capitulo1 {
    Scanner  scanner = new Scanner(System.in);
    private String nome;
    private String texto;
    Escolha1[] escolhas;
    private personagem personagem;
    private int alterarEnergia;

    public Capitulo1(String nome, String texto, personagem personagem, int alterarEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
    }

public Capitulo1(String texto) {
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println(texto);
    if(this.escolhas != null){
        for(int i = 0; i < escolhas.length; i++){
            System.out.println((i+1) +":"+escolhas[i].getTexto());
        }
        int Capituloescolha = escolher();
        escolhas[Capituloescolha-1].proximo.mostrar();
            }
        }
    
    public int escolher() {
        int opcao = 0;
        boolean escolhaInvalida = false;
        String resposta;

        if (escolhas == null) {
            return 0;
        }
        else{
        
        while (!escolhaInvalida) {
            resposta = scanner.nextLine();
            for (int i = 0; i < escolhas.length; i++){
                if (resposta.equalsIgnoreCase(escolhas[i].getTexto())) {
                    escolhaInvalida = true;
                    opcao = i + 1;
                break;}
                }

                    if (!escolhaInvalida) {
                    System.out.println("Digite novamente");} } }
                 
                
           return opcao; }
           
        
    
    

    public void executar() {
        mostrar();
        escolher();
    }

}