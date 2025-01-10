import java.util.ArrayList;

public class Schedina {
    private Squadra squadra1;
    private Squadra squadra2;
    private ArrayList<PartitePrecedenti> partitePrecedentiSquadra1 = new ArrayList<>();
    private ArrayList<PartitePrecedenti> partitePrecedentiSquadra2 = new ArrayList<>();

    public void setSquadra1(Squadra squadra1) {
        this.squadra1 = squadra1;
    }

    public void setSquadra2(Squadra squadra2) {
        this.squadra2 = squadra2;
    }

    // Aggiungi il metodo per aggiungere le partite precedenti
    public void aggiungiPartitePrecedenti(PartitePrecedenti partita) {
        if (partita.getSquadra1().equals(squadra1)) {
            partitePrecedentiSquadra1.add(partita);
        } else if (partita.getSquadra1().equals(squadra2)) {
            partitePrecedentiSquadra2.add(partita);
        }
    }

    // Metodo per calcolare la probabilità di goal per squadra
    public double probabilitaGoalPerSquadra(Squadra squadra) {
        int totaleGoal = 0;
        int partiteGiocate = 0;

        // Determina quale lista di partite usare in base alla squadra
        ArrayList<PartitePrecedenti> partite = (squadra.equals(squadra1)) ? partitePrecedentiSquadra1 : partitePrecedentiSquadra2;

        // Calcola la media dei goal nelle ultime 5 partite della squadra
        for (PartitePrecedenti partita : partite) {
            totaleGoal += partita.getGoal1();
            partiteGiocate++;
            if (partiteGiocate == 5) break;
        }

        return partiteGiocate > 0 ? (double) totaleGoal / partiteGiocate : 0;
    }

    // Metodo per calcolare le vittorie della squadra A (squadra1)
    public double CalcoloVittoriaSquadraA() {
        int vittorie = 0;
        for (PartitePrecedenti partita : partitePrecedentiSquadra1) {
            if (partita.isVintaSquadra1()) {
                vittorie++;
            }
        }
        return (double) vittorie / 5; // Vittorie SquadraA / 5
    }

    // Metodo per calcolare il pareggio tra le due squadre
    public double CalcoloPareggio() {
        int pareggiSquadra1 = 0;
        int pareggiSquadra2 = 0;

        // Calcola il numero di pareggi per entrambe le squadre
        for (PartitePrecedenti partita : partitePrecedentiSquadra1) {
            if (partita.getGoal1() == partita.getGoal2()) {
                pareggiSquadra1++;
            }
        }
        for (PartitePrecedenti partita : partitePrecedentiSquadra2) {
            if (partita.getGoal1() == partita.getGoal2()) {
                pareggiSquadra2++;
            }
        }

        // Calcolo la media dei pareggi
        return (double) (pareggiSquadra1 + pareggiSquadra2) / 10; // Somma dei pareggi delle due squadre / 10
    }

    // Metodo per calcolare le vittorie della squadra B (squadra2)
    public double CalcoloVittoriaSquadraB() {
        int vittorie = 0;
        // Cambia il ciclo per iterare sulle partite della squadra2 (Manchester United)
        for (PartitePrecedenti partita : partitePrecedentiSquadra2) {
            if (partita.isVintaSquadra1()) {  // La squadra2 vince se non è la squadra1 a vincere
                vittorie++;
            }
        }
        return (double) vittorie / 5; // Vittorie SquadraB / 5
    }


    // Aggiungi le partite precedenti per ciascuna squadra
    public void aggiungiPartitaPrecedenteSquadra1(PartitePrecedenti partita) {
        partitePrecedentiSquadra1.add(partita);
    }

    public void aggiungiPartitaPrecedenteSquadra2(PartitePrecedenti partita) {
        partitePrecedentiSquadra2.add(partita);
    }

    // Metodo per calcolare la probabilità in percentuale che una squadra segni un numero medio di goal
    public String calcolaProbabilitaMediaGoal(Squadra squadra) {
        int totaleGoal = 0;
        int partiteGiocate = 0;
        int partiteConMediaGoal = 0;

        // Determina quale lista di partite usare in base alla squadra
        ArrayList<PartitePrecedenti> partite = new ArrayList<PartitePrecedenti>();
        if (squadra.equals(squadra1)) {
            partite = partitePrecedentiSquadra1;
        } else if (squadra.equals(squadra2)) {
            partite = partitePrecedentiSquadra2;
        }

        // Calcola la somma totale dei goal e il numero di partite (fino a 5)
        for (PartitePrecedenti partita : partite) {
            totaleGoal += partita.getGoal1(); // Somma i goal realizzati dalla squadra
            partiteGiocate++;
            if (partiteGiocate == 5){
                break;
            }
        }

        // Calcola la media dei goal nelle ultime 5 partite
        double mediaGoal;
        if (partiteGiocate > 0) {
            mediaGoal = (double) totaleGoal / partiteGiocate;
        } else {
            mediaGoal = 0;
        }
        

        // Conta le partite in cui i goal segnati sono uguali alla media arrotondata
        for (PartitePrecedenti partita : partite) {
            if (Math.round(partita.getGoal1()) == Math.round(mediaGoal)) {
                partiteConMediaGoal++;
            }
        }

        // Calcola la probabilità come percentuale
        double probabilita = 0;
        if (partiteGiocate > 0) {
            probabilita = ((double) partiteConMediaGoal / partiteGiocate) * 100;
        }
        return "La probabilità che la squadra " + squadra.getNome() + " faccia " +  mediaGoal + " goal è " + probabilita + "%";
    }

    public String calcoloProbabilitaMediaCorner(Squadra squadra) {
        int sommaCorner = 0;
        int partiteGiocate = 0;
    
        // Metto nell'arrayList le partite della squadra
        ArrayList<PartitePrecedenti> partite = new ArrayList<>();
        if (squadra.equals(squadra1)) {
            partite = partitePrecedentiSquadra1;
        } else if (squadra.equals(squadra2)) {
            partite = partitePrecedentiSquadra2;
        }
    
        // Calcola la somma dei corner e il numero di partite giocate
        for (PartitePrecedenti partita : partite) {
            sommaCorner += partita.getCornerSquadra1();
            partiteGiocate++;
            if (partiteGiocate == 5) {
                break;
            }
        }
    
        // Calcola la media dei corner
        double mediaCorner;
        if (partiteGiocate > 0) {
            mediaCorner = (double) sommaCorner / partiteGiocate;
        } else {
            mediaCorner = 0;
        }
    
        // Conta le partite in cui i corner sono >= alla media
        int partiteConAlmenoMediaCorner = 0;
        for (PartitePrecedenti partita : partite) {
            if (partita.getCornerSquadra1() >= mediaCorner) {
                partiteConAlmenoMediaCorner++;
            }
        }
    
        // Calcola la probabilità in percentuale
        double probabilita = 0;
        if (partiteGiocate > 0) {
            probabilita = ((double) partiteConAlmenoMediaCorner / partiteGiocate) * 100;
        }
    
        return "La probabilità che la squadra " + squadra.getNome() + 
               " faccia almeno " + String.format("%.2f", mediaCorner) + 
               " corner è " + String.format("%.2f", probabilita) + "%";
    }
    


}

