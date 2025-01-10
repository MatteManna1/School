import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Docente> professori = new ArrayList<Docente>();
        professori.add(new Docente("Maurizio", "Mercuri", "via giovanni francesco II", 40, "Informatica"));
        professori.add(new Docente("Ramon", "Ugolotti", "via marco polo ", 45, "Sistemi"));

        Universita universita = new Universita(professori);
        System.out.println(professori.toString());
        System.out.println("Test età minima: " + universita.etaMinima());
        System.out.println("Test trova giovani" + universita.trovaGiovani());
    }
}