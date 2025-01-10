import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Treno treno = new Treno();
        ArrayList<Passeggero> passeggeri= new ArrayList<>();
            passeggeri.add(new Passeggero(2, "Mannarino", "Matteo", LocalDate.of(2007, 9, 13)));
            passeggeri.add(new Passeggero(2, "User", "usernome", LocalDate.of(2005, 4, 3)));
            passeggeri.add(new Passeggero(2, "User2", "Usernome2", LocalDate.of(2001, 1, 13)));

        try {
            treno.addVagone(new VagoneMerci("AB2", 2000, 1500, 3000, 2500));
            treno.addVagone(new VagonePasseggeri("BBB2", 2500, 2000, 3, passeggeri));
            treno.addVagone(new VagoneMerci("AC2", 2900, 1200, 2000, 2000));
        } catch (Exception e) {
            System.err.println("Error, found Exception: "+ e.getMessage());
        }

        try {
            System.out.println("Test getAllVagoni:"+ treno.getAllVagoni() + "\n\n");
            System.out.println("Test getLenghtTreno:" + treno.getLenghtTreno()+ "\n\n");
            System.out.println("Test getPesoTreno" + treno.getPesoTreno()+ "\n\n");
            System.out.println("Test getMaggiorenni" + treno.getMaggiorenni()+ "\n\n");
            System.out.println("Test toString:" + treno.toString());

        } catch (Exception e) {
            System.err.println("Error, found Exception: "+ e.getMessage());
        }

    }
}
