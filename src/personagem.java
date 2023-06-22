
public class personagem {
    String nome;
    int energia;

    public personagem (String nome, int energia){
        this.nome = nome;
        this.energia = energia;


    }
    public void adicionarEnergia(int quantidade) {
        energia += quantidade;
    }

    public void subtrairEnergia(int quantidade) {
        energia -= quantidade;
    }

}
