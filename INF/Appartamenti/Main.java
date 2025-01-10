package INF.Appartamenti;
public class Main {
    public static void main(String[] args) {
        Ville villa = new Ville(12, 2000, "via brombeis 5", "Napoli", 3, 250, true);
        Appartamenti appartamento = new Appartamenti(3, 200, "via papaV 5", "Tropea", "terra", false, 0);

        System.out.println(villa.toString());
        System.out.println("\n"+appartamento.toString());

        System.out.println("\nSuperficie totale villa:"+ villa.calcolaSuperficieTotale());
        System.out.println("Superficie totale appartamento" + appartamento.calcolaSuperficieTotale());
    }
}
