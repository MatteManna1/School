import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
            ArrayList<Giocatore> squadra = new ArrayList<>();
            ArrayList<Giocatore> squadra2 = new ArrayList<>();

            Giocatore giocatore1 = new Giocatore("Alex", "Straistaru", LocalDate.of(2007, 10, 31), 1.75, 65, 1, "centrocampista", "destro");
            Giocatore giocatore2 = new Giocatore("Alessio", "Leoncini", LocalDate.of(2007, 5, 12), 1.63, 60, 2, "difensore", "destro");
            Giocatore giocatore3 = new Giocatore("Calabrese", "Gargano", LocalDate.of(2007, 1, 1), 1.85, 70, 3, "portiere", "sinistro");
            Giocatore giocatore4 = new Giocatore("Matteo", "Mannarino", LocalDate.of(2007, 9, 13), 1.74, 55, 4, "fascia", "sinistro");
            Giocatore giocatore5 = new Giocatore("Riccardo", "Pogliacomi", LocalDate.of(2007, 7, 3), 1.80, 60, 5, "centrocampista", "destro");
            Giocatore giocatore6 = new Giocatore("William", "Njoki", LocalDate.of(2007, 12, 25), 1.70, 63, 6, "punta centrale", "destro");
            Giocatore giocatore7 = new Giocatore("Albion", "Shabani", LocalDate.of(2007, 3, 18), 1.75, 64, 7, "kebabbaro", "sinistro");
            Giocatore giocatore8 = new Giocatore("Davide", "Policelli", LocalDate.of(2007, 12, 4), 1.74, 60, 8, "terzino", "destro");
            Giocatore giocatore9 = new Giocatore("Luca", "Furlani", LocalDate.of(2007, 7, 9), 1.75, 60, 9, "terzino", "destro");
            Giocatore giocatore10 = new Giocatore("Michea", "Dall'aglio", LocalDate.of(2007, 2, 15), 1.76, 64, 10, "portiere", "destro");

            squadra.add(giocatore1);
            squadra.add(giocatore2);
            squadra.add(giocatore3);
            squadra.add(giocatore4);
            squadra.add(giocatore5);
            squadra2.add(giocatore6);
            squadra2.add(giocatore7);
            squadra2.add(giocatore8);
            squadra2.add(giocatore9);
            squadra2.add(giocatore10);
        
            
            System.out.println("Simulazione dei goal...");
            for (int i = 0; i < 10; i++) { 
                    giocatore1.addGoal(squadra, squadra2); 
            }
    
            // Mostra i risultati della squadra 1
            System.out.println("Squadra 1:");
            for (Giocatore giocatore : squadra) {
                System.out.println(giocatore.getNome() + " " + giocatore.getCognome() + " - Goal: " + giocatore.getGoal());
            }
    
            // Mostra i risultati della squadra 2
            System.out.println("Squadra 2:");
                for (Giocatore giocatore : squadra2) {
                System.out.println(giocatore.getNome() + " " + giocatore.getCognome() + " - Goal: " + giocatore.getGoal());
            }
            System.out.println("il/i giocatore/i che ha/hanno fatto più goal sono: "+giocatore1.mostGoal(squadra, squadra2));
       }
       

   }
 