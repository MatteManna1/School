import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class CalcolaEta {
  public static void main(String[] args) {
    LocalDate dataNascita  = LocalDate.of(2007, Month.SEPTEMBER, 13);
    LocalDate dataNascita2  = LocalDate.of(2001, Month.SEPTEMBER, 30);
    System.out.println(dataNascita.equals(dataNascita2));
    System.out.println(dataNascita);
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String s = dataNascita.format(formatter);
    System.out.println(s);
    
	  Period p = Period.between(dataNascita, LocalDate.now());
	  System.out.println("Differenza tra " + LocalDate.now().format(formatter) + " e " + s + 
		               " = Anni: " + p.getYears() + " Mesi: " + p.getMonths() + " Giorni: " + p.getDays() );
  }
}
