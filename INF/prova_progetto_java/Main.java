import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente(); //sintassi per istanziare la classe studente ed ottenere l'oggetto chiamando il costruttore Studente() (oggetto=s1 classe=studente)
        s1.setNome("Matteo");
        s1.setCognome("Mannarino");
        s1.setClasse("4c informatica");
        s1.setDataNascita(LocalDate.parse("2007-09-13"));
        System.out.println(s1.toString()); //con println stampa e va a capo

        Studente s2 = new Studente("pluto", "pluto", "4c2", LocalDate.parse("2007-04-01"));
        System.out.println(s2);

        System.out.println(s1.isOmonimo(s2));   //stiamo per confrontare s1 e s2
    }
}
