import java.util.Scanner;

public class capitulo {
    private String nome;
    private String texto;
    private String escolha1 ;
    private String escolha2 ;
    personagem personagem;
    private int alterarEnergia;

   
    public capitulo(String nome, String texto, String escolha1, String escolha2, personagem personagem, int alterarEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
    }
    public capitulo(String nome, String texto, personagem personagem, int alterarEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
    }

    public void mostrar() {
        System.out.println("\nO seu nome é:" + nome);
        personagem.alterar_energia(alterarEnergia);
        personagem.energia();
        System.out.println(texto);
        System.out.println("Escolha 1: " + escolha1);
        System.out.println("Escolha 2: " + escolha2);
        
    }
    public void mostrar1() {
        System.out.println("\nO seu nome é:" + nome);
        personagem.alterar_energia(alterarEnergia);
        personagem.energia();
        System.out.println(texto);
        
    }

    public int escolher() {
        try (Scanner scanner = new Scanner(System.in)) {
            int escolha = 0;
            boolean escolhaValida = false;

            while (!escolhaValida) {
                System.out.print("Digite sua escolha (1 ou 2): ");
                escolha = scanner.nextInt();
            

                if (escolha == 1 || escolha == 2) {
                    escolhaValida = true;
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 1 ou 2.");
                }
            }
   
            return escolha;
        }
    }
}