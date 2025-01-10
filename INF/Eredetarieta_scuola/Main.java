public class Main {
    public static void main(String[] args) {

        ElencoClassi elencoClassi= new ElencoClassi();
        elencoClassi.addClasse(new Classe(3, 'A', "informatica"));
        elencoClassi.addClasse(new Classe(4, 'B', "chimica"));
        elencoClassi.addClasse(new Classe(5, 'C', "meccanica"));

        // docenti
        Docente docente1 = new Docente("Mario", "Rossi", "MRARSS", 2000);
        Docente docente2 = new Docente("Giulia", "Bianchi", "GBNGLL", 2500);

        //studenti
        Studente studente1 = null;
        Studente studente2 = null;
        try {
            studente1 = new Studente("Alessandro", "Verdi", "AVDFGFB", elencoClassi.cercaClasse(3, 'A', "informatica"));    
            studente2 = new Studente("Sofia", "Gialli", "SGLLFI8", elencoClassi.cercaClasse(4, 'B', "chimica")); 
        } catch (Exception e){
            System.out.println("Error IndexOutOfBounce");
        }

        // anagrafica
        AnagraficaScuola anagraficaScuola = new AnagraficaScuola();

        // Aggiungi classi ai docenti
        try {
            docente1.addClasse(elencoClassi.cercaClasse(3, 'A', "informatica"));
            docente1.addClasse(elencoClassi.cercaClasse(4, 'B', "chimica"));
            docente2.addClasse(elencoClassi.cercaClasse(3, 'A', "informatica"));
            docente2.addClasse(elencoClassi.cercaClasse(5, 'C', "meccanica"));
        } catch (Exception e){
            System.err.println("Error");
        }


        //aggiungo gli oggetti all'anagrafica
        try{
            anagraficaScuola.addPersona(docente1);
            anagraficaScuola.addPersona(docente2);
            anagraficaScuola.addPersona(studente1);
            anagraficaScuola.addPersona(studente2);
        } catch (Exception e){
            System.err.println("Error");
        }

        try {
            //test toString()
            System.out.println("Test toString Studente: " + studente1.toString()+ "\n");
            System.out.println("Test toString Docente: " + docente1.toString()+ "\n");

            // Test getSommaStipendi()
            System.out.println("Somma degli stipendi dei docenti: " + anagraficaScuola.getSommaStipendi()+ "\n");
            
            // Test getCdc()
            System.out.println("Test getCdc:"+ anagraficaScuola.getCdc(elencoClassi.cercaClasse(3, 'A', "informatica")));
        } catch (Exception e){
            System.err.println("Error");
        }


    }
}
