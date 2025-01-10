import java.util.ArrayList;

public class CdTeca {
    private ArrayList<Cd> cdTeca;

    public CdTeca(){
        this.cdTeca = new ArrayList<Cd>(2);
    }

    public ArrayList<Cd> getCdTeca() {
        return cdTeca;
    }

    public Cd getCdTeca(int i){
        return cdTeca.get(i);
    }

    public void aggiungiCD(Cd cd1){
        this.cdTeca.add(cd1);
    }

    public void aggiungiCD(){
        this.cdTeca.add(new Cd(null, null, 0, 0));
    }

    public void aggiungiCD(String titolo, Autore autore, int numeroBrani, int durata){
        this.cdTeca.add(new Cd(titolo, autore, numeroBrani, durata));
    }

    public double durataTotale(){
        double somma=0;
        for(Cd disco: this.cdTeca){
            somma += disco.getDurata();
        }
        return somma;
    }

    public int numeroBraniTotali(){
        int n=0;
        for(Cd disco:this.cdTeca){
            n+=disco.getNumeroBrani();
        }
        return n;
    }

    public double mediaDurataBrani(){
        return durataTotale() / numeroBraniTotali();
    }

    public Cd cdpiucorto() {
       Cd cdMinimo = cdTeca.get(0); 
    
        for (Cd disco : cdTeca) {
            if (disco.getDurata() < cdMinimo.getDurata()) {
                cdMinimo = disco; 
            }
        }
        return cdMinimo; 
    }
}