import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Autonoleggio autonoleggio = new Autonoleggio();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            // Menu
            System.out.println("\n--- Menu dell'Autonoleggio ---");
            System.out.println("1. Aggiungi veicolo");
            System.out.println("2. Rimuovi veicolo");
            System.out.println("3. Visualizza veicoli per targa");
            System.out.println("4. Visualizza veicoli per codice");
            System.out.println("5. Visualizza veicoli per numero di posti");
            System.out.println("6. Visualizza inventario");
            System.out.println("7. Visualizza tutti i veicoli");
            System.out.println("8. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();  // Consuma il newline lasciato da nextInt()

            switch (scelta) {
                case 1: //aggiungi veicolo
                    System.out.println("Inserisci la targa del veicolo: ");
                    String targa = scanner.nextLine();
                    System.out.println("Inserisci la marca del veicolo: ");
                    String marca = scanner.nextLine();
                    System.out.println("Inserisci il modello del veicolo: ");
                    String modello = scanner.nextLine();
                    System.out.println("Inserisci il numero di posti del veicolo: ");
                    int numeroPosti = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline

                    Veicolo newVeicolo = new Veicolo(targa, marca, modello, numeroPosti, 0);  
                    autonoleggio.aggiungiVeicolo(newVeicolo);
                    System.out.println("Veicolo aggiunto con successo.");
                    break;

                case 2: // Rimuovi veicolo
                    System.out.println("Inserisci la targa del veicolo: ");
                    String targaR = scanner.nextLine();
                    System.out.println("Inserisci la marca del veicolo: ");
                    String marcaR = scanner.nextLine();
                    System.out.println("Inserisci il modello del veicolo: ");
                    String modelloR = scanner.nextLine();
                    System.out.println("Inserisci il numero di posti del veicolo: ");
                    int numeroPostiR = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline

                    Veicolo veicoloDaRimuovere = new Veicolo(targaR, marcaR, modelloR, numeroPostiR, 0);
                    autonoleggio.rimuoviVeicolo(veicoloDaRimuovere);
                    System.out.println("Ecco la lista dei veicoli aggiornata: " + autonoleggio.toString());
                    break;

                case 3: // Visualizza veicoli per targa
                    System.out.println("Inserisci la targa del veicolo da cercare: ");
                    String targaDaCercare = scanner.nextLine();
                    System.out.println(autonoleggio.infoByTarga(targaDaCercare));
                    break;

                case 4: // Visualizza veicoli per codice
                    System.out.println("Inserisci il codice del veicolo da cercare: ");
                    int codiceDaCercare = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline
                    System.out.println(autonoleggio.infoByCodice(codiceDaCercare));
                    break;

                case 5: // Visualizza veicoli per numero di posti
                    System.out.println("Inserisci il numero di posti: ");
                    int numeroPostiDaCercare = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline
                    System.out.println(autonoleggio.veicoliByPosti(numeroPostiDaCercare));
                    break;

                case 6: // Visualizza inventario
                    System.out.println(autonoleggio.inventario());
                    break;

                case 7: // Visualizza tutti i veicoli
                        System.out.println(autonoleggio.toString());
                    break;

                case 8: //exit
                    System.out.println("Arrivederci!");
                    continua = false;
                break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        }

        scanner.close();
    }
}

        /* 

         Veicolo veicolo1 =new Veicolo("AAA000", "Fiat", "Panda", 5, 0);
         Veicolo veicolo2 =new Veicolo("BBB111", "Fiat", "500", 5, 0);
         Veicolo veicolo3 =new Veicolo("CCC222", "Porche", "911", 2, 0);
         Autonoleggio autonoleggio = new Autonoleggio();

         autonoleggio.aggiungiVeicolo(veicolo1);
         autonoleggio.aggiungiVeicolo(veicolo2);
         autonoleggio.aggiungiVeicolo(veicolo3);

         System.out.println("Test aggiunta veicoli" + autonoleggio.toString() + "\n");

         autonoleggio.rimuoviVeicolo(veicolo1);
         System.out.println("Test rimozione veicoli"+ autonoleggio.toString()+ "\n");

         //riaggiungo il veicolo tolto
         autonoleggio.aggiungiVeicolo(veicolo1);
         //
        
        System.out.println("Test info by targa: "+ autonoleggio.infoByTarga("AAA000"));
        System.out.println("Test info by targa (targa inesistente): "+ autonoleggio.infoByTarga("ciabatta")+ "\n");

        System.out.println("Test info by codice: "+ autonoleggio.infoByCodice(2));
        System.out.println("Test info by codice (codice inesistente): "+ autonoleggio.infoByCodice(100)+ "\n");

        System.out.println("Test veicoli by posti: "+autonoleggio.veicoliByPosti(5));
        System.out.println("Test veicoli by posti (nposti sbagliato): "+autonoleggio.veicoliByPosti(12)+ "\n");

        System.out.println("Test inventario:\n"+ autonoleggio.inventario());
        */
