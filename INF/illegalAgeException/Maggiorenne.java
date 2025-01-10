public class Maggiorenne {
    private String nome;
    private int eta;

    public Maggiorenne(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String verifica() throws illegalAgeException{
        if(this.eta<18){
            throw new illegalAgeException(this.nome + ", sei minorenne");
        }
        return (this.nome + ", sei maggiorenne");
    }
}