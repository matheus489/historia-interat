
import java.util.Scanner;

class Capitulo1 {
    Scanner  scanner = new Scanner(System.in);
    private String texto;
    private int alterarEnergia;
    private personagem personagem;
    Escolha1[] escolhas;
    public Capitulo1(String nome, String texto, personagem personagem, int alterarEnergia) {
        this.texto = texto;
        this.alterarEnergia = alterarEnergia;
        this.personagem = personagem;
    }

    public Capitulo1(String texto, personagem personagem) {
        this.texto = texto;
        this.personagem = personagem;
    }

    public void mostrar() {
        System.out.println(texto);
        if(this.escolhas != null){
            for(int i = 0; i < escolhas.length; i++){
                System.out.println((i+1) +":"+escolhas[i].getTexto());
               
            }
            System.out.println("Sua Energia atual é: " + personagem.getEnergia());
            int Capituloescolha = escolher();
            escolhas[Capituloescolha-1].proximo.mostrar();
                }
            else{
                personagem.alterar_energia(alterarEnergia);
                System.out.println("Sua Energia final é:" + personagem.getEnergia());
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