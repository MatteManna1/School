public class Portamonete {
    private int monete50Cent;
    private int monete1Euro;
    private int monete2Euro;

    // Costruttore con tutte le monete a 0
    public Portamonete() {
        this.monete50Cent = 0;
        this.monete1Euro = 0;
        this.monete2Euro = 0;
    }

    public Portamonete(int monete50Cent, int monete1Euro, int monete2Euro) {
        this.monete50Cent = monete50Cent;
        this.monete1Euro = monete1Euro;
        this.monete2Euro = monete2Euro;
    }

    // Metodo per inserire una singola moneta
    public void inserisci(double valore) {
        if (valore == 0.5) {
            monete50Cent++;
        } else if (valore == 1.0) {
            monete1Euro++;
        } else if (valore == 2.0) {
            monete2Euro++;
        } else {
            throw new IllegalArgumentException("Valore non ammesso.");
        }
    }

    public void inserisci(double valore, int n) {
        if (valore == 0.5) {
            monete50Cent += n;
        } else if (valore == 1.0) {
            monete1Euro += n;
        } else if (valore == 2.0) {
            monete2Euro += n;
        } else {
            throw new IllegalArgumentException("Valore non ammesso.");
        }
    }

    //denaro totale
    public double denaro() {
        return (monete50Cent * 0.5) + (monete1Euro * 1.0) + (monete2Euro * 2.0);
    }

    public String denaroPerTipo() {
        return "Monete da 50 cent: " + monete50Cent + "\n" +
               "Monete da 1 euro: " + monete1Euro + "\n" +
               "Monete da 2 euro: " + monete2Euro + "\n";
    }
}