import java.util.Scanner;
import java.util.ArrayList;

public class capitulo {
    private String nome;
    private String texto;
    private String[] escolhas;
    personagem personagem;
    private int alterarEnergia;

   
    public capitulo(String nome, String texto, String[] escolhas, personagem personagem, int alterarEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
       
    }

    public void mostrar() {
        System.out.println("\nO seu nome é:" + nome);
        personagem.alterar_energia(alterarEnergia);
        personagem.energia();
        System.out.println(texto);
        
        if (escolhas.length < 0) {
        System.out.println("Escolha 1: " + escolhas[0]);
        System.out.println("Escolha 2: " + escolhas[1]);
    } else {
System.out.println("Fim de jogo.");
    }
    }

    public int escolher() {
        try (Scanner scanner = new Scanner(System.in)) {
            int escolha = 0;
            boolean escolhaValida = false;

            while (!escolhaValida) {
                System.out.print("Digite sua escolha (1 ou 2): ");
                escolha = scanner.nextInt();
            

                if (escolha >= 1 && escolha <= escolhas.length) {
                escolhaValida = true;
            } else {
                System.out.println("Escolha inválida. Por favor, digite um valor válido.");
            }
            }
   
            return escolha;
        }
    }
}