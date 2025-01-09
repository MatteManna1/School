public class area_circonferenza {
    private float raggio;

    public static void main (String[] args){
        float raggio=4;

        double circonferenza=2*Math.PI*raggio;
        double area=raggio*raggio*Math.PI;

    System.out.printf("Circonferenza=%.2f\nArea=%.2f\n", circonferenza, area);
    }
}
