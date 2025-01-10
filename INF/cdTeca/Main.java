import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autore autore1 = new Autore("Matteo", "Mannarino", LocalDate.of(20067, 9, 13));
        Autore autore2 = new Autore("radu", "bostan", LocalDate.of(2006, 8, 18));

        Cd cd1 = new Cd("canzone1", autore1, 1, 5);
        Cd cd2 = new Cd("canzone2", autore2, 5, 50);

        CdTeca cdteca = new CdTeca();
        cdteca.aggiungiCD(cd1);
        cdteca.aggiungiCD(cd2);

        double differenzaDurata = cd2.compareDurata(cd1);
        boolean compareautore = autore2.compareAutore(autore1);
        
        System.out.println(cd1.toString());
        System.out.println(cd2.toString());

        System.out.println(differenzaDurata);
        System.out.println(compareautore);

        System.out.println("Durata totale dei CD: " + cdteca.durataTotale() + " minuti");
        System.out.println("Numero totale di brani: " + cdteca.numeroBraniTotali());
        System.out.println("Media durata brani: " + cdteca.mediaDurataBrani() + " minuti");

        Cd cdMinimo = cdteca.cdpiucorto();
        if (cdMinimo != null) {
            System.out.println("Il CD più corto è : " + cdMinimo.toString());
        } else {
            System.out.println("Nessun CD disponibile nella collezione.");
        }
            }
}