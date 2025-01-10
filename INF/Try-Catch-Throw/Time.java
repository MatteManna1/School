/**
 * @(#)Time.java
 * Creazione e gestione di un TIPO di Eccezione personalizzato
 *         class IllegalTimeException extends RuntimeException { ....
 * @author zAlberto
 * @version 1.00 2013/12/7
 */
public class Time {
    private int ore, minuti, secondi; 
    
    public Time () {
        ore = minuti = secondi = 0;
    }

    public Time(int ore, int minuti, int secondi) {
        setTime(ore, minuti, secondi);
    }

    public String toString () {
        return (ore + ":" + minuti + ":" + secondi);
    }

    public boolean setTime (int oo, int mm, int ss) {
        if (! checkTime(oo, mm, ss))
            throw new IllegalTimeException("ora minuti o secondi errati !");
            // PROVARE ALTERNATIVAMENTE CON
            // throw new Exception("ora minuti o secondi errati !");
        ore = oo;
        minuti = mm;
        secondi = ss;
        return true;
    }

    protected boolean checkTime (int oo, int mm, int ss) {
        return ( 0 <= oo && oo < 24 &&  // oo in [0,23]
                 0 <= mm && mm < 60 &&  // mm in [0,59]
                 0 <= ss && ss < 60 );  // ss in [0,59]
    }

    // inner class per gestire eccezione personalizzata
    class IllegalTimeException extends RuntimeException { 
        private static final long serialVersionUID = 1L;

        public IllegalTimeException() {
            super(); 
        }
    
        public IllegalTimeException(String msg) { 
            super(msg); 
        }
    }

    public static void main(String[] args) {
        Time t = new Time (); 

        try {
            t.setTime(25, 10, 45);
            System.out.println("Sono le ore " + t); 
        } 
        catch (IllegalTimeException e) { 
            System.out.println ("Errore:" + e); 
        }
    }
}