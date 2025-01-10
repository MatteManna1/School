import java.util.ArrayList;

public class Autonoleggio {
    ArrayList<Veicolo> veicoli= new ArrayList<Veicolo>(2);
    private int c=1;
    

    public Autonoleggio() {
        
    }

    public void aggiungi(Veicolo vi){
        veicoli.add(vi);
        vi.setCodice(c);
        c++;

    }

    @Override
    public String toString() {
        return "Autonoleggio[veicoli=" + veicoli + "]";
    }

    public ArrayList<Veicolo> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(ArrayList<Veicolo> veicoli) {
        this.veicoli = veicoli;
    }

    public void rimuoviT(String x){
        int c=0;
        int y=0;
        for(Veicolo v: veicoli){
            if(v.getTarga().equals(x)){
                y=c;
            }
            c++;
        }
        veicoli.remove(y);

    }

    public void rimuoviC(int x){
        int c=0;
        int y=0;
        for(Veicolo v: veicoli){
            if(v.getCodice()==x){
                y=c;
            }
            c++;
        }
        veicoli.remove(y);

    }
    public String cercaT(String x){
        for(Veicolo v: veicoli){
            if(v.getTarga().equals(x)){
                return v.toString();
            }
        }
        return ("Non è stato trovato nessun veicolo con la targa: "+x);
    }
    public String cercaC(int x){
        for(Veicolo v: veicoli){
            if(v.getCodice()==x){
                return v.toString();
            }
        }
        return ("Non è stato trovato alcun veicolo con il codice: "+x);
    }
    public ArrayList<Veicolo> cercaP(int x){
        ArrayList<Veicolo> save = new ArrayList<Veicolo>(1);
        for(Veicolo v: veicoli){
            if(v.getNumero_posti()==x){
                save.add(v);
            }
        }
        return save;
    }
    public ArrayList<String> inventario() {
        ArrayList<String> save = new ArrayList<>();
        
        for (Veicolo v : veicoli) {
            String marchio = v.getModello();
            boolean trovato = false;
    
            for (int i = 0; i < save.size(); i++) {
                String entry = save.get(i);
                String[] parts = entry.split(": "); //divido la stringa entry in due parti usando split
                String nomeMarchio = parts[0]; //parts[0]: contiene il nome del marchio
                int count = Integer.parseInt(parts[1]); //parts[1]: contiene il conteggio come stringa
    
                if (nomeMarchio.equals(marchio)) {
                    save.set(i, nomeMarchio + ": " + (count + 1)); //.set(i, nuovoValore) metodo della lista ArrayList che permette di sostituire l’elemento alla posizione i con nuovoValore.
                    trovato = true;
                    break;
                }
            }
            if (!trovato) {
                save.add(marchio + ": 1");
            }
        }
        
        return save;
    }
            
    
}