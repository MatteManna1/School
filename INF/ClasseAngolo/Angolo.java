public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(int g, int p, int s){ //costruttore
        this.gradi=g;
        this.primi=p;
        this.secondi=s;
    }

    public int getGradi() {
        return gradi;
    }
    
    public void setGradi(int gradi) {
        this.gradi = gradi;
    }
    
    public int getPrimi() {
        return primi;
    }
    
    public void setPrimi(int primi) {
        this.primi = primi;
    }
    
    public int getSecondi() {
        return secondi;
    }
    
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public void visualizzaAngolo(){
        System.out.println(gradi + " gradi " + primi + " primi " + secondi + " secondi");
    }
    public void aggiungiGradi(int n){
        this.gradi+=n;
    }
    public void aggiungiPrimi(int n){
        this.primi+=n;
        if(this.primi>=60){
            this.gradi+=this.primi/60;
            this.primi=this.primi%60;
        }
    }
    public void aggiungiSecondi(int n){
        this.secondi += n;
        if (this.secondi >= 60) {
            int extraPrimi = this.secondi / 60;
            this.secondi = this.secondi % 60;
            aggiungiPrimi(extraPrimi);  
        }
    }
    public int angoloSecondi(){
         return (this.gradi * 3600) + (this.primi * 60) + this.secondi;
    }
    public void secondiAngolo(int n){
        this.gradi=n/3600;
        n=n%3600;
        this.primi=n/60;
        this.secondi=n%60;
    }
    public int differenzaSecondi(Angolo a){
        return Math.abs(this.angoloSecondi() - a.angoloSecondi());
    }
    public Angolo sommaAngoli(Angolo a) {
        int totaleSecondi = this.angoloSecondi() + a.angoloSecondi();
        int gradi = totaleSecondi / 3600;
        totaleSecondi %= 3600; 
        int primi = totaleSecondi / 60; 
        int secondi = totaleSecondi % 60;
    
        return new Angolo(gradi, primi, secondi); //ritorno un nuovo oggetto
    }


}
