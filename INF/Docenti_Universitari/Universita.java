import java.util.ArrayList;

public class Universita {
    private ArrayList<Docente> professori;

    public Universita(ArrayList<Docente> professori) {
        this.professori = professori; 
    }

    public ArrayList<Docente> getProfessori() {
        return professori;
    }

    public void setProfessori(ArrayList<Docente> professori) {
        this.professori = professori;
    }

    public void addDocenti(Docente docente) {
        if (!professori.contains(docente)) {
            professori.add(docente);
        }
    }

    public String etaMinima() {
        Docente save = new Docente();
        save.setEta(999999);
        for (Docente docente : professori) {
            if (docente.getEta() < save.getEta()) {
                save = docente;
            }
        }
        return save.getCognome();
    }

    public ArrayList<Docente> trovaGiovani() {
        ArrayList<Docente> etaMin = new ArrayList<>();
        if (professori.isEmpty()) {
            return etaMin; 
        }

        int etaMinima = 999999;
        for (Docente docente : professori) {
            if (docente.getEta() < etaMinima) {
                etaMinima = docente.getEta(); 
                etaMin.clear(); 
                etaMin.add(docente);
            } else if (docente.getEta() == etaMinima) {
                etaMin.add(docente); 
            }
        }
    
        return etaMin;
    }

    @Override
    public String toString() {
        return "Universita [professori=" + professori + "]";
    }
}