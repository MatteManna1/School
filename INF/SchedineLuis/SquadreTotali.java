import java.util.ArrayList;

public class SquadreTotali {
    private ArrayList<Squadra> squadre;

    public SquadreTotali(ArrayList<Squadra> squadre) {
        this.squadre = new ArrayList<Squadra>();
    }

    public ArrayList<Squadra> getSquadre() {
        return squadre;
    }

    public void addSquadra(Squadra squadra) {
        squadre.add(squadra);
    }
}
