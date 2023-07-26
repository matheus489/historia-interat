
public class personagem {
    String nome;
    public String getNome() {
        return nome;
    }

    int energia;

    public int getEnergia() {
        return energia;
    }
    public personagem (String nome, int energia){
        this.nome = nome;
        this.energia = energia;


    }
    public void energia(){
        System.out.println("Energia atual do personagem: " + energia);
    }
    
    public void alterar_energia(int quantidade) {
        energia += quantidade;
    }

}

        


