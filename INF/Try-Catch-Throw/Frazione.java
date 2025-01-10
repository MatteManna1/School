/**
 * @(#)Frazione.java
 * La keyword 'throw' viene utilizzata per creare un errore personalizzato.
 * L'istruzione 'throw' solleva un eccezione del tipo volutamente istanziato es:
 *        throw new ArithmeticException("Errore: il denominatore non puo' essere 0");
 * Esistono molti tipi di eccezioni disponibili in Java es: ArithmeticException, ClassNotFoundException, 
 *   ArrayIndexOutOfBoundsException, IllegalArgumentException, SecurityException, ecc.
 * 
 * Il tipo di eccezione viene spesso utilizzato insieme a un metodo personalizzato, come negli esempi sotto.
 * 
 * Eccezioni Checked e Unchecked
 * Ci sono eccezioni che obbligano alla gestione con try catch tipo Checked e altre non obbligano
 * I metodi che sollevano un'eccezione Checked devono essere firmati con la keyword 'throws'
 * La motivazione dell'esistenza di exception non controllate (unchecked) è dovuta all'esigenza 
 * di evitare di sovraccaricare il codice quando sussistono condizioni di impossibilità di generazione 
 * di un'eccezione.
 * 
 * @author zAlberto
 * @version 1.00 2013/12/7
 */

public class Frazione {
    private int numeratore;
    private int denominatore; 
 
     /**
      * Calcola il valore decimale della frazione.
      * Se il denominatore è == 0 il metodo solleva l'eccezione ArithmeticException (unchecked).
      **/
     public float toFloat() throws ArithmeticException  {  // throws non obbligatorio
    	float ris; 
    	if (denominatore == 0)
    		throw new ArithmeticException("Errore: il denominatore non puo' essere 0");
    	else
    		ris = numeratore / (float)denominatore;
    	return ris;
    }

    /**
      * Calcola il valore decimale della frazione.
      * Il codice che invocherà il metodo sarà obbligato a controllare l'eccezione con try catch
      * Se il denominatore è == 0 il metodo solleva l'eccezione Exception (checked).
      **/
      public float toFloat2() throws Exception  {  // throws obbligatorio
    	float ris; 
    	if (denominatore == 0)
    		throw new ArithmeticException("Errore: il denominatore non puo' essere 0");
    	else
    		ris = numeratore / (float)denominatore;
    	return ris;
    }
    
    /**
     * Costruttore senza parametri che inizializza a 0 gli attributi
    */
    public Frazione() {
    	this.numeratore = 0;
    	this.denominatore = 0;
    }
    
    /**
     * Costruttore con parametri che inizializzano gli attributi
    */
    public Frazione(int num, int den) {
    	this.numeratore = num;
    	this.denominatore = den;
    }
    
    /**
     * inizializza numeratore
     */
    public void setNumeratore(int num) {
    	this.numeratore = num;
    }
    
    /**
     * inizializza denominatore
     */
    public void setDenominatore(int den) {
    	this.denominatore = den;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
    	Frazione frazione = new Frazione();
    
    	/* Il Metodo toFloat2() è firmato con "throws Exception"
    	 * siamo dunque obbligati a gestire l'eccezione
    	 **/
    	try {
    		System.out.println("la frazione vale:" + frazione.toFloat2());
    	}
    	catch (Exception err) {
    		System.out.println(err.toString());
    	}
    	
    	frazione.setNumeratore(5);
    	frazione.setDenominatore(3);
    	
    	// Non è obbligatorio anche se AUSPICABILE gestire l'eccezione con try catch
        System.out.println("la frazione vale:" + frazione.toFloat());
    }
}