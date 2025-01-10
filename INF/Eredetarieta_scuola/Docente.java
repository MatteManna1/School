import java.util.ArrayList;

public class Docente extends Persona {
    private int stipendio;
    private ArrayList<Classe> classi;
    public Docente(String nome, String cognome, String codice_fiscale, int stipendio) {
        super(nome, cognome, codice_fiscale);
        this.stipendio = stipendio;
        this.classi = new ArrayList<>();
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public ArrayList<Classe> getClassi() {
        return classi;
    }

    public void setClassi(ArrayList<Classe> classi) {
        this.classi = classi;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Docente [stipendio=" + stipendio + "]";
    }

    public void addClasse(Classe classe){
        classi.add(classe);
    }
    
}
