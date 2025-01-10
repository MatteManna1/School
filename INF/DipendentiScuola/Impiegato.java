import java.time.LocalDate;

public class Impiegato extends DipendentiScuola{
    private int livello; 
    private double oreStraordinari;
    private double retribuzioneOraria=25;

    public Impiegato(String nome, String sesso, LocalDate dataNascita, double stipendio, int livello) {
        super(nome, sesso, dataNascita, stipendio);
        if (livello>1 || livello<7){
            this.livello = livello;
        } else{
            errorPrint();
        }
        this.oreStraordinari = 0;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public double getOreStraordinari() {
        return oreStraordinari;
    }

    public void setOreStraordinari(double oreStraordinari) {
        this.oreStraordinari = oreStraordinari;
    }

    public double getRetribuzioneOraria() {
        return retribuzioneOraria;
    }

    public void setRetribuzioneOraria(double retribuzioneOraria) {
        this.retribuzioneOraria = retribuzioneOraria;
    }
    
    public void errorPrint(){
        System.err.println("Error, invalid level of the employe");
    }

    public void aggiungiStraordinari(double ore){
        this.oreStraordinari+=ore;
        setStipendio(getStipendio()+(ore*this.retribuzioneOraria));
    }

    @Override
    public String toString() {
        return super.toString()+"Impiegato [livello=" + livello + ", oreStraordinari=" + oreStraordinari
                + "]";
    }


    

}
