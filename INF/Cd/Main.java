public class Main {
    public static void main(String[] args){
        Cd eminem = new Cd("the Eminem Show", "Eminem", 20, 77.30);
        Cd eminem1 = new Cd("the Death of Slim Shady", "Eminem", 19, 64.28);

        System.out.println(eminem.toString());
        System.out.println(eminem1.toString());

        if(eminem.compareDuration(eminem1) > 0){
            System.out.println("'" + eminem.getTitle() + "'" + " dura più di " + "'" + eminem1.getTitle() + "'");
        }
        else if(eminem.compareDuration(eminem1) < 0){
            System.out.println("'" + eminem.getTitle() + "'" + " dura meno di " + "'" + eminem1.getTitle() + "'");
        }
        else{
            System.out.println("i due cd hanno stessa durata");
        }
    }
}