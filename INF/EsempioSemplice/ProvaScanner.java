import java.util.Scanner;
public class ProvaScanner {

	public static void main(String[] args) {
		
		// INPUT CONSOLE (1)
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Input di un intero: ");
		int i = sc.nextInt();

		System.out.print("input di un double: ");
		double d = sc.nextDouble(); //inserimento con la virgola e non con il punto
		
		/* Quando si deve acquisire un Stringa dopo un int
		 * � necessario eseguire nextLine() per interrompere
		 * il buffer di acquisizione e predisporre pre la nuova stringa
		 * altrimenti il terminatore del int, rimasto in buffer
		 * terminerebbe immediatamente l'input della stringa
		 **/
		sc.nextLine();
		
		System.out.print("Input di una stringa: ");
		String st = sc.nextLine();
		
		System.out.print("Valori inseriti: " + i + " + d +  " + st);
		sc.close();
	}
}
