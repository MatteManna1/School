public abstract class Vagone {
    private String matricola;
    private int lunghezzaInCentimetri;
    private double pesoAVuoto;

    public Vagone(String matricola, int lunghezzaInCentimetri, double pesoAVuoto) {
        this.matricola = matricola;
        this.lunghezzaInCentimetri = lunghezzaInCentimetri;
        this.pesoAVuoto = pesoAVuoto;
    }
    

    public Vagone() {
        this.matricola=null;
        this.lunghezzaInCentimetri=0;
        this.pesoAVuoto=0;
    }


    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public int getLunghezzaInCentimetri() {
        return lunghezzaInCentimetri;
    }

    public void setLunghezzaInCentimetri(int lunghezzaInCentimetri) {
        this.lunghezzaInCentimetri = lunghezzaInCentimetri;
    }

    public double getPesoAVuoto() {
        return pesoAVuoto;
    }

    public void setPesoAVuoto(double pesoAVuoto) {
        this.pesoAVuoto = pesoAVuoto;
    }

    @Override
    public String toString() {
        return "Vagone [matricola=" + matricola + ", lunghezzaInCentimetri=" + lunghezzaInCentimetri + ", pesoAVuoto="
                + pesoAVuoto + "]";
    }
}