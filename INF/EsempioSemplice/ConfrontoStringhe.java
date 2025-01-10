public class ConfrontoStringhe
{
    public static void main(String[] args)
    {
    	String a = new String ("pippo"); //a è un oggetto mentre String è una classe
		String b = new String ("pippo");
		
		System.out.println(a == "pippo"); 		// errore = false
		System.out.println(a == b); 			// errore = false
		
		System.out.println(a.equals("pippo")); // corretto = true
		System.out.println(a.equals(b)); 		// corretto = true

		String c = "pluto"; 
		String d = "pluto";
		System.out.println(c == d);
		
		System.out.println(a.compareTo("pluto")); // negativo "pippo" < "pluto"
		System.out.println(a.compareTo("beta"));  // positivo "pippo" > "beta"
		System.out.println(a.compareTo("pippo")); // 0 "pippo" e "pippo" uguali
		 
    }
}
//riga 5 e 6 creiamo 2 oggetti in 2 aree di memoria diverse con 2 reference diverse
//riga 14 e 15 sono sempre due oggetti in aree di memoria diverse ma dato che c'è il new c'è lo stesso reference di c in d 
