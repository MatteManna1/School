package INF.Appartamenti;
public class Ville extends Abitazioni{
     private int nPiani;
     private double superficieGiardino;
     private boolean pool;

    public Ville(int nStanze, double superficie, String indirizzo, String citta, int nPiani, double superficieGiardino,
            boolean pool) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.pool = pool;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(double superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return super.toString()+"Ville [nPiani=" + nPiani + ", superficieGiardino=" + superficieGiardino + ", pool=" + pool + "]";
    }
    
    public double calcolaSuperficieTotale(){
        return getSuperficie()+superficieGiardino;
    }

     
}
