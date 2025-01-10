public class Lampadina {
    private int nclick;
    private int maxclick;
    
    public Lampadina(int nclick, int maxclick) {
        this.nclick = nclick;
        this.maxclick = maxclick;
    }
    public int getNclick() {
        return nclick;
    }

    public void setNclick(int nclick) {
        this.nclick = nclick;
    }
    
    public int getMaxclick() {
        return maxclick;
    }
    public void setMaxclick(int maxclick) {
        this.maxclick = maxclick;
    }
    public String statoLampadina(){
        if(this.nclick>=this.maxclick){
            return ("Stato lampadina --> Rotto");
        } else if(this.nclick % 2 == 0){
                return ("Stato lampadina --> Spento");
        } else {
                return ("Stato lampadina --> Acceso");
            }
    }
    public String clickLampadina(){
        this.nclick++;
        return statoLampadina();
    }
    
}
