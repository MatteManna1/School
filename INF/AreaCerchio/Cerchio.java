public class Cerchio{
    private double r;

        public Cerchio(double r){
        this.r = r;
    }
    public void setR (double r){ 
        this.r=r;
    }
    public double getR(){
        return r;
    }
    public double circonferenza(){
        return 2*Math.PI*this.r;
    }
    public double area(){
        return Math.PI * (this.r*this.r);
    }
}