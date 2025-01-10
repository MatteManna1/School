import java.util.ArrayList;

public class VagonePasseggeri extends Vagone{
    private int nPasseggeri;
    private ArrayList<Passeggero> elencoPasseggeri= new ArrayList<Passeggero>();
   

    public VagonePasseggeri(String matricola, int lunghezzaInCentimetri, double pesoAVuoto, int nPasseggeri, ArrayList<Passeggero> elencPasseggeri) throws Exception{
        super(matricola, lunghezzaInCentimetri, pesoAVuoto);
        if (nPasseggeri<=60 || nPasseggeri<0){ //errore nei controlli dell'if
        //if (nPasseggeri<=60 && nPasseggeri>0) <--corretto
            this.nPasseggeri=nPasseggeri;
        } else {
            throw new Exception("nPasseggeri non valido");
        }

        this.elencoPasseggeri=elencPasseggeri;
    }

    public VagonePasseggeri() {
        super();
        this.nPasseggeri=0;
        this.elencoPasseggeri=null;
    }

    public int getnPasseggeri() {
        return nPasseggeri;
    }

    public void setnPasseggeri(int nPasseggeri) {
        this.nPasseggeri = nPasseggeri;
    }

    public ArrayList<Passeggero> getElencoPasseggeri() {
        return elencoPasseggeri;
    }

    public void setElencoPasseggeri(ArrayList<Passeggero> elencoPasseggeri) {
        this.elencoPasseggeri = elencoPasseggeri;
    }

    @Override
    public String toString() {
        return super.toString() + "VagonePasseggeri [nPasseggeri=" + nPasseggeri + ", elencoPasseggeri=" + elencoPasseggeri + "]";
    }
    
    
}
