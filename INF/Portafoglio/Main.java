public class Main {
    public static void main(String[] args) {
        // Test della classe Portamonete
        Portamonete portamonete = new Portamonete();
        portamonete.inserisci(0.5);
        portamonete.inserisci(1.0, 3);

        System.out.println("Test classe Portamonete:");
        System.out.println(portamonete.denaroPerTipo());
        System.out.println("Totale denaro: " + portamonete.denaro() + " euro\n");

        // Test della classe Portafoglio
        Portafoglio portafoglio = new Portafoglio();
        portafoglio.inserisci(0.5, 4);
        portafoglio.inserisci(1, 2);
        portafoglio.inserisci(2.0, 3);
        portafoglio.inserisci(5.0, 4);
        portafoglio.inserisci(10.0, 5);
        portafoglio.inserisci(20.0, 6);

        System.out.println("Test classe Portafoglio:");
        System.out.println(portafoglio.denaroPerTipo());
        System.out.println("Totale denaro nel portafoglio: " + portafoglio.denaro() + " euro");

    }
}