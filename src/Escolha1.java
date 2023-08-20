public class Escolha1 {
    private String texto;
    private Capitulo1 proximo;

    public Escolha1(String texto, Capitulo1 proximo){
        this.texto = texto;
        this.proximo = proximo;
    }

     public String getTexto() {
        return texto;
    }

    public Capitulo1 getProximo() {
        return proximo;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }

    
    public void setProximo(Capitulo1 proximo) {
        this.proximo = proximo;
    }

}