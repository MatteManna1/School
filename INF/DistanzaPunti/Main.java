public class Main{
    public static void main(String[] args){
        Punto p1=new Punto(4,5);
        Punto p2=new Punto(2,3);

        double distanza=p1.distanza(p2);
        System.out.println("La distanza è: "+distanza);


    }
}