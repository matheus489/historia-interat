
public class personagem {
    String nome;
    int energia;

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

        


