import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la velocità iniziale:");
        int velocitaIniziale = scanner.nextInt();
        Speed velocita = new Speed(velocitaIniziale);
        while(true){
            System.out.println("Inserisci 'a' per accelerare o 'f' per frenare:");
            String azione = scanner.next(); // Legge l'input dell'utente

            if (azione.equals("a")) {
                velocita.Accelera();
                System.out.println("Stai accelerando. Velocità attuale: " + velocita.getVelocita() + " km/h");
            } else if (azione.equals("f")) {
                velocita.Frena();
                System.out.println("Stai frenando. Velocità attuale: " + velocita.getVelocita() + " km/h");
            } else if(azione.equals("q")){
                break;
            } else {
                System.out.println("Azione non valida.");
            }
        }
        scanner.close(); 
    }
}
