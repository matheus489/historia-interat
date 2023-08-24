public class personagem {
    private String nome;
    protected int energia;
    
    
   public personagem(String nome, int energia){
    this.nome = nome;
    this.energia = energia;
  }

    protected boolean alteraçãoEnergia1(int modificação){
      boolean energiaBoa = true;
      this.energia += modificação;

      if(energia <= 0){
        this.energia = 0;
        System.out.println("sua energia é: "+ this.energia);
        System.out.println(this.nome + " morreu");
        energiaBoa = false;
        return energiaBoa;
      }
      return energiaBoa;
      
     
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

   
    public void setEnergia(int energia) {
        this.energia = energia;
    }

}