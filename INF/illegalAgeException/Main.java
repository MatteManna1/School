public class Main {
    public static void main(String[] args) {

        Maggiorenne user = new Maggiorenne("Matteo", 17);
        Maggiorenne user2 = new Maggiorenne("Mannarino", 18);

        try {
            System.out.println(user.verifica());
        } catch (illegalAgeException e){
            System.out.println ("Errore:"+ e.getMessage()); 

        }
        try {
            System.out.println(user2.verifica());
        } catch (illegalAgeException e){
            System.out.println ("Errore:"+ e.getMessage()); 

        }
    }
}
