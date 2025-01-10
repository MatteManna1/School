public class Cd {
    private String titolo;
    private Autore autore;
    private int numeroBrani;
    private int durata;

    public Cd(String titolo, Autore autore, int numeroBrani, int durata){
        this.titolo=titolo;
        this.autore=autore;
        this.numeroBrani=numeroBrani;
        this.durata=durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    public String toString() {
        return "Cd [titolo=" + titolo + ", autore=" + autore + ", numeroBrani=" + numeroBrani + ", durata=" + durata + "]";
    }
    public String compareDurata(int durata1){
        if(this.durata>durata1){
            return "La prima durata è maggiore della seconda";
        } else {
            return "La prima durata è minore della seconda";
        }
    }
}

