import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Autore Me = new Autore("Matteo", "Mannarino", LocalDate.of(2007, Month.SEPTEMBER, 13));
        Autore Leoncini = new Autore("Alessio", "Leoncini", LocalDate.of(2007, Month.NOVEMBER, 15));
        Cd nduja = new Cd("Calabria", Me, 12, 60 );
        Cd lasagna = new Cd("Lasagna", Leoncini, 16, 45 );

        System.out.println(Me.toString());
        System.out.println(Leoncini.toString());
        System.out.println(nduja.toString());
        System.out.println(lasagna.toString());

        System.out.println(nduja.compareDurata(lasagna.getDurata()));
        System.out.println(Me.compareAutore(Leoncini));
    }
    
}
