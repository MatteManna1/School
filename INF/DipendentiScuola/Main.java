import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
            Docente docente = new Docente("Docente", "Maschio", LocalDate.of(2008, 1, 29), 2000, 25);
            Impiegato impiegato = new Impiegato("Impiegato", "Maschio", LocalDate.of(2006, 8, 8), 1500, 5);
            impiegato.aggiungiStraordinari(5);
            System.out.println(docente.toString()+ "\n");
            System.out.println(impiegato.toString());

        
    }
}
