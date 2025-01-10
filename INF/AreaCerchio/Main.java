public class Main {
    public static void main (String[] args){
        Cerchio c = new Cerchio(5.5);

        double circonferenza;
        double area;
        circonferenza=c.circonferenza();
        area=c.area();
        System.out.println("Circonferenza -->"+ circonferenza);
        System.out.println("Area -->"+ area);

        Cerchio c2=new Cerchio(7.0);

        double circonferenza2;
        double area2;
        circonferenza2=c2.circonferenza();
        area2=c2.area();
        System.out.println("Circonferenza -->"+ circonferenza2);
        System.out.println("Area -->"+ area2);

    }
}
