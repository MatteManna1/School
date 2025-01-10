public class Triangolo{
    private double cateto1;
    private double cateto2;

    public Triangolo(double cateto1, double cateto2){
        this.cateto1=cateto1;
        this.cateto2=cateto2;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }
    public double getCateto1() {
        return cateto1;
    }
    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    public double getCateto2() {
        return cateto2;
    }

    public double ipotenusa(){
        return Math.sqrt(cateto1 * cateto1 + cateto2*cateto2);
    }
    public double area(){
        return (cateto1*cateto2)/2;
    }
    public double perimetro(){
        return cateto1+cateto2+this.ipotenusa();
    }


}