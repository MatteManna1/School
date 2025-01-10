public class Main {
    public static void main(String[] args) {
        // Creazione di angoli
        Angolo angolo1 = new Angolo(1, 30, 20); // 1° 30' 20''
        Angolo angolo2 = new Angolo(0, 45, 50); // 0° 45' 50''

        // Visualizzazione degli angoli
        System.out.println("Visualizzazione Angolo 1:");
        angolo1.visualizzaAngolo();

        System.out.println("Visualizzazione Angolo 2:");
        angolo2.visualizzaAngolo();

        // Aggiunta di gradi, primi e secondi a angolo1
        System.out.println("\nAggiunta di 10 gradi a Angolo 1:");
        angolo1.aggiungiGradi(10);
        angolo1.visualizzaAngolo();

        System.out.println("\nAggiunta di 50 primi a Angolo 1:");
        angolo1.aggiungiPrimi(50);
        angolo1.visualizzaAngolo();

        System.out.println("\nAggiunta di 90 secondi a Angolo 1:");
        angolo1.aggiungiSecondi(90);
        angolo1.visualizzaAngolo();


        // Calcolo degli angoli in secondi
        System.out.println("\nAngolo 1 in secondi: " + angolo1.angoloSecondi());
        System.out.println("Angolo 2 in secondi: " + angolo2.angoloSecondi());

        // Calcolo della differenza in secondi
        int differenza = angolo1.differenzaSecondi(angolo2);
        System.out.println("\nDifferenza in secondi tra Angolo 1 e Angolo 2: " + differenza + " secondi");

        // Calcolo della somma di due angoli
        Angolo angoloSomma = angolo1.sommaAngoli(angolo2);  //uso la funzione sommaAngoli() su angolo1 con parametro angolo2
        System.out.println("\nSomma di Angolo 1 e Angolo 2:");
        angoloSomma.visualizzaAngolo();     
    }
}
