public class PartitePrecedenti {
    private String nomePartita;
    private int goal1;
    private int goal2;
    private Squadra squadra1;
    private Squadra squadra2;
    private boolean vintaSquadra1;
    private int cornerSquadra1;
    private int cornerSquadra2;

    public PartitePrecedenti(String nomePartita, int goal1, int goal2, Squadra squadra1, Squadra squadra2, boolean vintaSquadra1, int cornerSquadra1, int cornerSquadra2) {
        this.nomePartita = nomePartita;
        this.goal1 = goal1;
        this.goal2 = goal2;
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.vintaSquadra1 = vintaSquadra1;
        this.cornerSquadra1 = cornerSquadra1;
        this.cornerSquadra2 = cornerSquadra2;
    }

    public String getNomePartita() {
        return nomePartita;
    }

    public int getGoal1() {
        return goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    public Squadra getSquadra1() {
        return squadra1;
    }

    public Squadra getSquadra2() {
        return squadra2;
    }

    public boolean isVintaSquadra1() {
        return vintaSquadra1;
    }

    public int getCornerSquadra1() {
        return cornerSquadra1;
    }

    public void setCornerSquadra1(int cornerSquadra1) {
        this.cornerSquadra1 = cornerSquadra1;
    }

    public int getCornerSquadra2() {
        return cornerSquadra2;
    }

    public void setCornerSquadra2(int cornerSquadra2) {
        this.cornerSquadra2 = cornerSquadra2;
    }
    
}
