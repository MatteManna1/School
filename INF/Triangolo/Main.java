public class Main {
    public static void main(String[] args){
        Triangolo t = new Triangolo(6.5, 9.8);
        double perimetro=t.perimetro();
        double area=t.area();
        System.out.println("Triangolo1:");
        System.out.println("Perimetro--> "+perimetro);
        System.out.println("Area --> "+area);

        Triangolo t2= new Triangolo(18.5, 19.5);
        double perimetro2=t2.perimetro();
        double area2=t2.area();
        System.out.println("\nTriangolo2:");
        System.out.println("Perimetro--> "+perimetro2);
        System.out.println("Area --> "+area2);

    }
}
