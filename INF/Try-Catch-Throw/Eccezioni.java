import java.util.ArrayList;

/**
 * @(#)Eccezioni.java
 * Molte istruzioni possono causare il sollevamento di eccezioni nell'esecuzione del programma
 * che, se non gestite, ne provoca l'interruzione
 * I classici esempi di cause di eccezioni potrebbero essere:
 *   - divisione per 0
 *   - nullPointer tipo array non istanziati
 *   - ArrayIndexOfBound: accesso a indice inesistente
 *   - conversione dati non consentita
 * le keyword try catch permettono di gestire il sollevamento di potenziali eccezioni: 
 * se un istruzione del blocco try provoca l'eccezione il programma non va in crash ma il controllo
 * salta all'esecuzione dell istruzioni del blocco catch
 * @author zAlberto
 * @version 1.00 2013/12/7
 */
public class Eccezioni {
	public static void main(String[] args) {
    	int n1, n2;
    	String s;
    	double d;
    
    	n1 = 10;
    	n2 = 0;
    	
    	// Se n2 = 0 la divisione causa errore runtime con blocco applicazione
    	//n3 = n1 / n2;
    	
    	// Se n2 = 0 l'errore viene gestito con l'esecuzione del blocco catch
    	try {
    		System.out.println(n1 / n2);
    	}
    	catch (Exception err) {  // volutamente controllata con l'eccezione generica Exception
    		System.out.println("Errore diviso:\n" + err.toString());
    	}
		
		// 2 MODI DIVERSI PER CONVERTIRE STRINGA IN NUMERO

    	// Se s contiene un valore non trasformabile nel tipo numerico l'applicazione si blocca con eccezione NumberFormatException
    	s = "10.12 w";
    	// Double.valueOf(s) -> ValueOf Converte s in Double e implicitamente poi in double
    	//d = Double.parseDouble(s);  // parseDouble converte direttamente in tipo primitivo double
    	
    	// Se s contiene un valore non trasformabile nel tipo numerico l'applicazione NON si blocca ma viene eseguito blocco catch
    	try {
    		d = Double.valueOf(s);  // solleva eccezione NumberFormatException
    	}
    	catch (NumberFormatException err) {
    		System.out.println("Errore conversione:\n" + err.toString());
		}

		try {
    		d = Double.parseDouble(s); // solleva eccezione NumberFormatException e NullPointerException
    	}
    	catch (NumberFormatException err) {
    		System.out.println("Errore conversione:\n" + err.toString());
		}

		ArrayList<String> lista = null;
		try {
			lista.add(s);
		}
		catch (NullPointerException err) {
    		System.out.println("Errore oggetto null:\n" + err.toString());
		}

		int array[] = {1, 2, 3, 4, 5};
		try {
			int i = array[6];
		}
		catch (IndexOutOfBoundsException err) {
    		System.out.println("Errore accesso array:\n" + err.toString());
		}
    }
}