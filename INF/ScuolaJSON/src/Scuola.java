import com.google.gson.*; // Importa la libreria Gson per il parsing del JSON
import java.io.FileReader; // Importa la classe per leggere file
import java.io.IOException; // Importa la classe per la gestione delle eccezioni
import java.util.*; // Importa la libreria per le collezioni, inclusi ArrayList

public class Scuola {
    private ArrayList<Classe> classi; // Lista che contiene tutte le classi della scuola

    // Costruttore della classe Scuola
    public Scuola() {
        this.classi = new ArrayList<>(); // Inizializza l'ArrayList per contenere le classi
    }

    // Metodo per aggiungere una classe alla scuola
    public void aggiungiClasse(Classe classe) {
        this.classi.add(classe); // Aggiunge la classe all'ArrayList
    }

    // Metodo per aggiungere uno studente a una classe specifica
    public void aggiungiStudenteAClasse(String idClasse, Studente studente) {
        // Cicla su tutte le classi per trovare quella con l'idClasse corrispondente
        for (Classe classe : classi) {
            if (classe.getIdClasse().equals(idClasse)) {
                classe.aggiungiStudente(studente); // Aggiunge lo studente alla classe trovata
                return; // Esce dal metodo se la classe è trovata
            }
        }
        // Se non trova la classe, stampa un messaggio di errore
        System.out.println("Classe non trovata: " + idClasse);
    }

    // Metodo per caricare le classi dal file JSON
    public void caricaClassi(String filePath) {
        Gson gson = new Gson(); // Crea un oggetto Gson per il parsing del JSON
        try (FileReader reader = new FileReader(filePath)) { // Apre il file JSON
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class); // Converte il contenuto del file in un array JSON
            // Cicla attraverso ogni elemento dell'array JSON e crea una classe
            for (JsonElement element : jsonArray) {
                JsonObject jsonClass = element.getAsJsonObject(); // Ottiene l'oggetto JSON per la classe
                String idClasse = jsonClass.get("idClasse").getAsString(); // Estrae l'id della classe
                String anno = jsonClass.get("anno").getAsString(); // Estrae l'anno
                String indirizzo = jsonClass.get("indirizzo").getAsString(); // Estrae l'indirizzo
                Classe classe = new Classe(idClasse, anno, indirizzo); // Crea un oggetto Classe
                aggiungiClasse(classe); // Aggiunge la classe alla scuola
            }
        } catch (IOException e) {
            e.printStackTrace(); // Gestisce eventuali errori di input/output
        }
    }

    // Metodo per caricare gli studenti dal file JSON
    public void caricaStudenti(String filePath) {
        Gson gson = new Gson(); // Crea un oggetto Gson per il parsing del JSON
        try (FileReader reader = new FileReader(filePath)) { // Apre il file JSON
        	//filePath = percorso del file JSON. Il percorso del file viene passato alla funzione come filePath,
        	//una stringa che contiene il percorso completo del file sul disco.
        	
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class); // Converte il contenuto del file in un array JSON
            //reader: Questo oggetto viene passato al metodo per permettere a Gson di leggere il contenuto del file.
            //JsonArray.class: Questo è il tipo di destinazione in cui desideriamo che Gson converta il contenuto del file.
            
            // Cicla attraverso ogni elemento dell'array JSON e crea uno studente
            for (JsonElement element : jsonArray) {
                JsonObject jsonStudente = element.getAsJsonObject(); // Ottiene l'oggetto JSON per lo studente
                String utente = jsonStudente.get("utente").getAsString(); // Estrae il nome utente
                String cognome = jsonStudente.get("cognome").getAsString(); // Estrae il cognome
                String nome = jsonStudente.get("nome").getAsString(); // Estrae il nome
                String email = jsonStudente.get("email").getAsString(); // Estrae l'email
                String idClasse = jsonStudente.get("idClasse").getAsString(); // Estrae l'id della classe
                String dataNascita = jsonStudente.get("dataNascita").getAsString(); // Estrae la data di nascita
                Studente studente = new Studente(utente, cognome, nome, email, idClasse, dataNascita); // Crea un oggetto Studente
                aggiungiStudenteAClasse(idClasse, studente); // Aggiunge lo studente alla classe corrispondente
            }
        } catch (IOException e) {
            e.printStackTrace(); // Gestisce eventuali errori di input/output
        }
    }

    // Metodo per stampare tutte le classi e i relativi studenti
    public String stampaClassi() {
    	String stampa = "";
        for (Classe classe : classi) { // Cicla su tutte le classi
        	stampa += classe + "\n";
            for (Studente studente : classe.getStudenti()) { // Cicla sugli studenti della classe
               // System.out.println("  " + studente); // Stampa i dettagli di ogni studente
                stampa += " " + studente + "\n";
            }
        }
        return stampa;
    }

    // Metodo per stampare la percentuale di maggiorenni per ogni classe
    public String stampaPercentualeMaggiorenni() {
    	String stampa = "";
        for (Classe classe : classi) { // Cicla su tutte le classi
            double maggiorenni = 0; // Conta il numero di maggiorenni
            for (Studente studente : classe.getStudenti()) { // Cicla sugli studenti della classe
                if (studente.isMaggiorenne()) { // Verifica se lo studente è maggiorenne
                    maggiorenni++;
                }
            }
            double percentuale = (maggiorenni / classe.getStudenti().size()) * 100; // Calcola la percentuale di maggiorenni
            // Stampa la percentuale per la classe
            stampa +="Classe" + classe.getIdClasse()+": " + percentuale + "% maggiorenni\n";
        }
        return stampa;
    }

	@Override
	public String toString() {
		return "Scuola [classi=" + classi + "]";
	}
    
}