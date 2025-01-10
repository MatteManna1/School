public class Punto{
    private double x1;
    private double y1;


    public Punto(double x, double y){
        this.x1=x;
        this.y1=y;
    }
    public Punto(){
        x1=0;
        y1=0;
    }
    public double getX() {
        return x1;
    }
    public void setX(double x1) {
        this.x1 = x1;
    }
    public double getY() {
        return y1;
    }
    public void setY(double y1) {
        this.y1 = y1;
    }
    public double distanza(Punto p) {
        return Math.sqrt(Math.pow(this.x1 - p.getX(), 2) + Math.pow(this.y1 - p.getY(), 2));
    }
    

}
