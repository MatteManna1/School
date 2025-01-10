import java.util.ArrayList;

public class CatalogoVeicoli {
    private ArrayList<Veicolo> catalogo;

    public CatalogoVeicoli() {
        this.catalogo = new ArrayList<Veicolo>();
    }

    public ArrayList<Veicolo> getCatalogo() {
        return catalogo;
    }
    public void setCatalogo(ArrayList<Veicolo> catalogo) {
        this.catalogo = catalogo;
    }

    public void addVeicolo(Veicolo veicolo) throws VeicoloException {
        if (catalogo.contains(veicolo)) {
            throw new VeicoloException("Veicolo " + veicolo + " già presente nel catalogo.");
        } else {
            catalogo.add(veicolo);
        }
    }

    public void removeVeicolo(Veicolo veicolo) throws VeicoloException {
        if (!catalogo.contains(veicolo)) {
            throw new VeicoloException("Veicolo " + veicolo + " non trovato nel catalogo.");
        }
        catalogo.remove(veicolo);
    }

    public ArrayList<Veicolo> getVeicoli() {
        return catalogo;
    }

    public Veicolo getVeicoloDalCatalogo(String targa) throws VeicoloException {
        for (Veicolo veicolo : catalogo) {
            if (veicolo.getTarga().equals(targa)) {
                return veicolo;
            }
        }
        throw new VeicoloException("Veicolo con targa " + targa + " non trovato nel catalogo.");
    }

    @Override
    public String toString() {
        return "CatalogoVeicoli [catalogo=" + catalogo + "]";
    }
}