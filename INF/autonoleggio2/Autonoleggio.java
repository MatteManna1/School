import java.util.ArrayList;

public class Autonoleggio {
    private ArrayList<Veicolo> macchine;
    private int contatoreCodice=1;

    public Autonoleggio() {
        this.macchine = new ArrayList<Veicolo>();
    }

    @Override
    //L’override (sovrascrittura) è un meccanismo che consente a una sottoclasse di fornire una nuova implementazione di un metodo ereditato dalla superclasse. 
    //Serve per personalizzare il comportamento di un metodo.
    public String toString() {
        return "Autonoleggio [macchine=" + macchine + "]";
    }

    public void aggiungiVeicolo (Veicolo veicolo){
        for(Veicolo macchina: macchine){
            if(macchina.equals(veicolo)){
                System.err.println("Errore, veicolo: "+veicolo +  "già presente nell'autonoleggio");
                return;
            }
        }
        veicolo.setCodice(contatoreCodice);
        contatoreCodice++;
        macchine.add(veicolo);
    }
    public void rimuoviVeicolo (Veicolo veicolo){
        for(Veicolo macchina: macchine){
            if(macchina.equals(veicolo)){
                macchine.remove(veicolo);
                return;
            }
        }
        System.err.println("Errore, non è presente il veicolo: "+veicolo);

    }
    public String infoByTarga(String targa){
        for(Veicolo veicolo : macchine){
            if(veicolo.getTarga().equals(targa)){
                return veicolo.toString();
            }
        }
        return "Non è stato trovato nessun veicolo con la targa: "+ targa;

    }

    public String infoByCodice(int codice){
        for(Veicolo veicolo : macchine){
            if(veicolo.getCodice()==codice){
                return veicolo.toString();
            }
        }
        return "Non è stato trovato nessun veicolo con il codice: "+ codice;

    }

    public ArrayList<String> veicoliByPosti(int nposti){
        ArrayList<String> save= new ArrayList<>();
        for(Veicolo veicolo : macchine){
            if(veicolo.getNumero_posti()==nposti){
                save.add(veicolo.toString());
            }
        }
        if (save.isEmpty()){
            save.add("Non è stato trovato alcun veicolo con: "+nposti + " posti");
        }
            return save;
    }
    
    public ArrayList<String> inventario(){
        ArrayList<String> inventario = new ArrayList<>();
        ArrayList<String> marche = new ArrayList<>();

        for(Veicolo veicolo : macchine){
            if(!marche.contains(veicolo.getMarca())){
                marche.add(veicolo.getMarca());
            }
        }

        for(String marca: marche){
            int contatore=0;
            for(Veicolo veicolo : macchine){
                if(veicolo.getMarca().equals(marca)){
                    contatore++;
                }
            }
            inventario.add("Marca: " + marca + "; numero di veicoli: " +contatore);
        }
        return inventario;
    }

}