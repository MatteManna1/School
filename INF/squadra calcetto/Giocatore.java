import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Giocatore extends Atleta{
    private int numero_maglia;
    private String ruolo;
    private String piede_preferito;
    private int goal;

    public Giocatore(String nome, String cognome, LocalDate dataDiNascita, double altezza, double peso,
            int numero_maglia, String ruolo, String piede_preferito) {
        super(nome, cognome, dataDiNascita, altezza, peso);
        this.numero_maglia = numero_maglia;
        this.ruolo = ruolo;
        this.piede_preferito = piede_preferito;
        this.goal = 0;
    }

    public int getNumero_maglia() {
        return numero_maglia;
    }

    public void setNumero_maglia(int numero_maglia) {
        this.numero_maglia = numero_maglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getPiede_preferito() {
        return piede_preferito;
    }

    public void setPiede_preferito(String piede_preferito) {
        this.piede_preferito = piede_preferito;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int generaIndex(){
        Random random = new Random();
        int n = random.nextInt(5);
        return n;
    } 
    public int chooseSquadra(){
        Random random = new Random();
        int n = random.nextInt(2)+1;
        return n;
    } 
    
    public void addGoal(ArrayList<Giocatore> squadra, ArrayList<Giocatore> squadra2) {
        ArrayList<Giocatore> squadraScelta;
        int scelta = chooseSquadra();
    
        if (scelta == 1) {
            squadraScelta = squadra;
        } else {
            squadraScelta = squadra2;
        }
    
        if (!squadraScelta.isEmpty()) {
            int nGiocatore = generaIndex();
            Giocatore giocatore = squadraScelta.get(nGiocatore);
            giocatore.setGoal(giocatore.getGoal() + 1);
        }
    }
        // Funzione che restituisce i giocatori con il maggior numero di goal
    public ArrayList<Giocatore> mostGoal(ArrayList<Giocatore> squadra, ArrayList<Giocatore> squadra2) {
        ArrayList<Giocatore> topGiocatori = new ArrayList<>();
        int maxGoals = 0;
    
        // Cerca il massimo numero di goal nelle due squadre
        for (Giocatore giocatore : squadra) {
            if (giocatore.getGoal() > maxGoals) {
                maxGoals = giocatore.getGoal();
            }
        }
    
        for (Giocatore giocatore : squadra2) {
            if (giocatore.getGoal() > maxGoals) {
                maxGoals = giocatore.getGoal();
            }
        }
            // Aggiungi i giocatori con il massimo numero di goal all'ArrayList
            for (Giocatore giocatore : squadra) {
            if (giocatore.getGoal() == maxGoals) {
                topGiocatori.add(giocatore);
            }
       }
    
        for (Giocatore giocatore : squadra2) {
            if (giocatore.getGoal() == maxGoals) {
                topGiocatori.add(giocatore);
            }
        }
    
            return topGiocatori;
        }   
    
    @Override
    public String toString() {
        return super.toString()+ "Giocatore [numero_maglia=" + numero_maglia + ", ruolo=" + ruolo + ", piede_preferito=" + piede_preferito
                + ", goal=" + goal + "]";
    }  
}
