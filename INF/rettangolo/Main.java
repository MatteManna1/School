public class Main {
    public static void main(String[] args) {
        //prova costruttore con punti già istanziati
        System.out.println();
        System.out.println("Utilizzo il costruttore con punti già istanziati");
        Punto p1=new Punto(1, 5); //angolo in alto a sinistra
        Punto p4=new Punto(7, 1); //angolo in basso a destra

        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P4: (" + p4.getX() + ", " + p4.getY() + ")");

        Rettangolo rettangolo= new Rettangolo(p1, p4);
        double area = rettangolo.area();
        System.out.println("Area del rettangolo: " + area);
        double perimetro = rettangolo.perimetro();
        System.out.println("Perimetro del rettangolo: " + perimetro);
        double diagonale = rettangolo.diagonale();
        System.out.println("Diagonale del rettangolo: " + diagonale);
        System.out.println();

        //prova costruttore vuoto
        System.out.println("Utilizzo il costruttore vuoto: ");
        Rettangolo rettangolo2 = new Rettangolo();
        double area2=rettangolo2.area();
        System.out.println("Area del rettangolo: " +  area2) ;
        double perimetro2 = rettangolo2.perimetro();
        System.out.println("Perimetro del rettangolo: " + perimetro2);
        double diagonale2 = rettangolo2.diagonale();
        System.out.println("Diagonale del rettangolo: " + diagonale2);
        System.out.println();

        //prova costruttore con coordinate
        int x1=1;
        int y1=5;
        int x2=7;
        int y2=1;
        System.out.println("Utilizzo il costruttore che prende come parametri le coordinate: ");
        System.out.println("X1 = " + x1);
        System.out.println("y1 = " + y1);
        System.out.println("X2 = " + x2);
        System.out.println("Y2 = " + y2);

        Rettangolo rettangolo3= new Rettangolo(x1, y1, x2, y2);
        double area3=rettangolo3.area();
        System.out.println("Area del rettangolo: " +  area3);

        double perimetro3 = rettangolo3.perimetro();
        System.out.println("Perimetro del rettangolo: " + perimetro3);

        double diagonale3 = rettangolo3.diagonale();
        System.out.println("Diagonale del rettangolo: " + diagonale3);
        System.out.println();

    }
}
