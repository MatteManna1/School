public class Portafoglio extends Portamonete {
    private int banconote5Euro;
    private int banconote10Euro;
    private int banconote20Euro;

    // Costruttore con tutte le banconote a 0
    public Portafoglio() {
        super();
        this.banconote5Euro = 0;
        this.banconote10Euro = 0;
        this.banconote20Euro = 0;
    }

    public Portafoglio(int monete50Cent, int monete1Euro, int monete2Euro, int banconote5Euro, int banconote10Euro, int banconote20Euro) {
        super(monete50Cent, monete1Euro, monete2Euro);
        this.banconote5Euro = banconote5Euro;
        this.banconote10Euro = banconote10Euro;
        this.banconote20Euro = banconote20Euro;
    }

    @Override
    public void inserisci(double valore) {
        if (valore == 5.0) {
            banconote5Euro++;
        } else if (valore == 10.0) {
            banconote10Euro++;
        } else if (valore == 20.0) {
            banconote20Euro++;
        } else {
            super.inserisci(valore);
        }
    }

    @Override
    public void inserisci(double valore, int n) {
        if (valore == 5.0) {
            banconote5Euro += n;
        } else if (valore == 10.0) {
            banconote10Euro += n;
        } else if (valore == 20.0) {
            banconote20Euro += n;
        } else {
            super.inserisci(valore, n);
        }
    }

    //denaro totale (monete + banconote)
    @Override
    public double denaro() {
        return super.denaro() + (banconote5Euro * 5.0) + (banconote10Euro * 10.0) + (banconote20Euro * 20.0);
    }
    @Override
    public String denaroPerTipo() {
        return super.denaroPerTipo() + "Banconote da 5 euro: " + banconote5Euro + "\n" +
               "Banconote da 10 euro: " + banconote10Euro + "\n" +
               "Banconote da 20 euro: " + banconote20Euro + "\n";
    }
}