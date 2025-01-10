public class Rettangolo {
    private Punto p1; // angolo in alto a sinistra
    private Punto p4; // angolo in basso a destra

    // Costruttore vuoto
    public Rettangolo() {
        this.p1 = new Punto(0, 0);
        this.p4 = new Punto(0, 0);
    }

    // Costruttore con coordinate
    public Rettangolo(int x1, int y1, int x4, int y4) {
        this.p1 = new Punto(x1, y1);
        this.p4 = new Punto(x4, y4);
    }

    // Costruttore con punti già istanziati
    public Rettangolo(Punto p1, Punto p4) {
        this.p1 = p1;
        this.p4 = p4;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    public Punto getP4() {
        return p4;
    }

    public void setP4(Punto p4) {
        this.p4 = p4;
    }

    public double area() {
        double base = Math.abs(p4.getX() - p1.getX());
        double altezza = Math.abs(p4.getY() - p1.getY());
        return base * altezza;
    }
    public double perimetro(){
        double base = Math.abs(p4.getX() - p1.getX());
        double altezza = Math.abs(p4.getY() - p1.getY());
        return (2*base + 2*altezza);
    }
    public double diagonale(){
        double base=Math.abs(p4.getX() - p1.getX());
        double altezza = Math.abs(p4.getY() - p1.getY());
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altezza, 2));

    }
    public String toString() {
        return "Rettangolo [p1=" + p1 + ", p4=" + p4 + "]";
    }
}
