public class Main {
    public static void main(String[] args) {
        Scuola scuola = new Scuola();

        // Carica classi e studenti dai file JSON
        scuola.caricaClassi("classi.json");
        scuola.caricaStudenti("studenti.json");

        // Stampa tutte le classi e gli studenti
        System.out.println("Tutte le classi e gli studenti:\n" + scuola.stampaClassi());

        // Stampa la percentuale di maggiorenni per ogni classe
        System.out.println("\nPercentuale di maggiorenni:\n" + scuola.stampaPercentualeMaggiorenni());
    }
}