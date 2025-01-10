public class Squadra {
    private String nome;
    private int vittorie;
    private int pareggi;
    private int sconfitte;

    public Squadra(String nome, int vittorie, int pareggi, int sconfitte) {
        this.nome = nome;
        this.vittorie = vittorie;
        this.pareggi = pareggi;
        this.sconfitte = sconfitte;
    }

    public Squadra() {
        // Costruttore di default
    }

    public String getNome() {
        return nome;
    }

    public int getVittorie() {
        return vittorie;
    }

    public int getPareggi() {
        return pareggi;
    }

    public int getSconfitte() {
        return sconfitte;
    }
}
