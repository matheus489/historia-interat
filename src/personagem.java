public class personagem {
    private String nome;
    private int energia;
    
    
   public personagem(String nome, int energia){
    this.nome = nome;
    this.energia = energia;
  }

    boolean mudaFelicidade(int mudanca){
      boolean feliz = true;
      this.energia += mudanca;

      if(energia <= 0){
        this.energia = 0;
        System.out.println("sua felicidade é: "+ this.energia);
        System.out.println(this.nome + " morreu de tristeza");
        feliz = false;
        return feliz;
      }
      else if(energia > 50){
        this.energia = 50;
        System.out.println("sua nova felicidade é: "+ this.energia);
        System.out.println(this.nome+ " está extremamente feliz!");
        return feliz;
      }
      else{
        System.out.println(this.nome +" mudou seu estado de felicidade");
        System.out.println("Sua nova felicidade é de "+ this.energia);
        return feliz;
      } 
     
    }
  
 
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

   
    public void setEnergia(int felicidade) {
        this.energia = felicidade;
    }

}