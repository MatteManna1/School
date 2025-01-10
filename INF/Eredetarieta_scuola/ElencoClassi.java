import java.util.ArrayList;
public class ElencoClassi {
    ArrayList<Classe> elencoClassi;
    

    public ElencoClassi() {
        this.elencoClassi = new ArrayList<>();
    }

    public ArrayList<Classe> getElencoClassi() {
        return elencoClassi;
    }

    public void setElencoClassi(ArrayList<Classe> elencoClassi) {
        this.elencoClassi = elencoClassi;
    }

    public void addClasse(Classe classe){
        if (!elencoClassi.contains(classe)){
            elencoClassi.add(classe);
        }
    }

    public Classe cercaClasse(int nome, char sezione, String indirizzo) {
        for (Classe classe : elencoClassi) { 
            if (classe.getNome() == nome && 
                classe.getSezione() == sezione && 
                classe.getIndirizzo().equals(indirizzo)) {
                return classe; 
            }
        }
        return null; 
    }

    
}
