import java.util.ArrayList;

public class Classe {
    private String idClasse;
    private String anno;
    private String indirizzo;
    private ArrayList<Studente> studenti;

    // Costruttore
    public Classe(String idClasse, String anno, String indirizzo) {
        this.idClasse = idClasse;
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.studenti = new ArrayList<>();
    }

	// Aggiungi uno studente alla classe
    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public String getIdClasse() {
        return idClasse;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    @Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", anno=" + anno + ", indirizzo=" + indirizzo + ", studenti=" + studenti
				+ "]";
	}
    
}