public class Main {
    public static void main(String[] args) {
        Lampadina lampadina = new Lampadina(0, 22);
        
        System.out.println("Lampadina allo stato iniziale: " + lampadina.statoLampadina());
        System.out.println("Lampadina dopo un click: " + lampadina.clickLampadina());
        System.out.println("Lampadina dopo due click: " + lampadina.clickLampadina()); 
    }
}
