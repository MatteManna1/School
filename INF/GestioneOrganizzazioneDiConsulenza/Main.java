public class Main {
    public static void main(String[] args) {
        Progetto progetto = new Progetto();

        progetto.aggiungiMembro(new Dirigente("001", "Rossi", "Mario", 2000));
        progetto.aggiungiMembro(new Funzionario("002", "Bianchi", "Luca", 2015));
        progetto.aggiungiMembro(new TecnicoInformaticaTelecomunicazioni("003", "Verdi", "Anna", 2010, true));
        progetto.aggiungiMembro(new TecnicoElettronicaAutomazione("004", "Neri", "Marco", 2020, false));

        int oreLavorate [] = {10, 20, 15, 25}; // Ore per ciascun membro
        try {
            System.out.println("Il costo complessivo del progetto è:"+progetto.calcolaCostoComplessivo(oreLavorate));
        } catch (Exception e) {
            System.err.println("Exception found: ");
        }
    }
}