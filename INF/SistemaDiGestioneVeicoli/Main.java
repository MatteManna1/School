public class Main {
    public static void main(String[] args) {
        CatalogoVeicoli catalogo = new CatalogoVeicoli();
        
        try {
            catalogo.addVeicolo(new Auto("AAAAA", "FIAT", "Panda", 5, 4, "Famigliare"));
            catalogo.addVeicolo(new Moto("BBBBBB", "Ducati", "Panigale", 2, 2, "Sportiva"));
            catalogo.addVeicolo(new Camion("CCCCCC", "Renault", "Boh", 3, 8, 25000));
            catalogo.addVeicolo(new Auto("DDDDDD", "Ferrari", "F10", 2, 4, "Sportiva"));
        } catch (VeicoloException e) {
            System.err.println("Errore nell'aggiunta del veicolo: " + e.getMessage());
        }

        try {
            System.out.println(catalogo + "\n\n");
        } catch (Exception e) {
            System.err.println("Errore nel visualizzare il catalogo: " + e.getMessage());
        }

        try {
            Veicolo veicoloDaRimuovere = catalogo.getVeicoloDalCatalogo("AAAAA");
            catalogo.removeVeicolo(veicoloDaRimuovere);
        } catch (VeicoloException e) {
            System.err.println("Errore nella rimozione del veicolo: " + e.getMessage());
        }

        try {
            for (Veicolo veicolo : catalogo.getVeicoli()) {
                veicolo.calcolaCostoAssicurazione();
                System.out.println(veicolo + "\n");
            }
        } catch (Exception e) {
            System.err.println("Errore nel calcolo dell'assicurazione: " + e.getMessage());
        }
    }
}