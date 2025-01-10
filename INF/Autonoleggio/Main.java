

public class Main {
    public static void main(String[] args) {

    Veicolo v = new Veicolo("XXX777",  "Ferrari", 2);
    Veicolo v2 = new Veicolo("PPP555",  "Panda", 5);
    Autonoleggio x = new Autonoleggio();

    //test aggiungi
    x.aggiungi(v);
    x.aggiungi(v2);
    System.out.println("\nTest aggiungi: "+x + "\n");

    //test rimuovi da targa
    x.rimuoviT("PPP555");
    System.out.println("Test rimuovi da targa: "+x);

    //test rimuovi da codice
    x.rimuoviC(1);
    System.out.println("Test rimuovi da codice: "+x + "\n");

    //
    x.aggiungi(v);
    x.aggiungi(v2);
    System.out.println("Riaggiungo i due elementi nell'Arraylist: "+x + "\n");
    //

    //test ricerca informazioni data targa
    System.out.println("Test cerca informazioni data targa (non presente): "+x.cercaT("PPP554"));
    System.out.println("Test cerca informazioni data targa (presente): "+x.cercaT("PPP555")+"\n");

    //test ricerca informazioni dato codice
    System.out.println("Test cerca informazioni dato il codice (presente): "+x.cercaC(3));
    System.out.println("Test cerca informazioni dato il codice (non presente): "+x.cercaC(10)+"\n");

    //test ricerca tutti i veicoli dati i posti
    //
    x.aggiungi(v);
    //
    System.out.println("Ricerca veicoli dato il numero di posti: " + x.cercaP(2) + "\n");

    //inventario
    System.out.println("inventario: "+x.inventario()+"\n");



    
    
    
        
    }

    
}
