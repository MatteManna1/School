import java.time.LocalDate;
import java.time.Period;

public class Studente {
    private String utente;
    private String cognome;
    private String nome;
    private String email;
    private String idClasse;
    private LocalDate dataNascita;

    // Costruttore
    public Studente(String utente, String cognome, String nome, String email, String idClasse, String dataNascita) {
        this.utente = utente;
        this.cognome = cognome;
        this.nome = nome;
        this.email = email;
        this.idClasse = idClasse;
        this.dataNascita = LocalDate.parse(dataNascita); // Assumiamo il formato "yyyy-MM-dd"
    }

    public String getIdClasse() {
        return idClasse;
    }

    // Metodo per calcolare l'età dello studente
    public int calcolaEta() {
        LocalDate oggi = LocalDate.now();
        Period periodo = Period.between(dataNascita, oggi);
        return periodo.getYears();
    }

    // Metodo per verificare se lo studente è maggiorenne
    public boolean isMaggiorenne() {
        return calcolaEta() >= 18;
    }
    
    @Override
	public String toString() {
		return "Studente [utente=" + utente + ", cognome=" + cognome + ", nome=" + nome + ", email=" + email
				+ ", idClasse=" + idClasse + ", dataNascita=" + dataNascita + "]";
	}
    
    
}