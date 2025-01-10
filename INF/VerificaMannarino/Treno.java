import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Treno {
    private ArrayList<Vagone> treno;

    public Treno() {
        this.treno = new ArrayList<Vagone>();
    }

    public ArrayList<Vagone> getTreno() {
        return treno;
    }

    public void setTreno(ArrayList<Vagone> treno) {
        this.treno = treno;
    }

    public void addVagone(Vagone vagone) throws Exception{
        if (!treno.contains(vagone)){
            treno.add(vagone);
        } else {
            throw new Exception("Vagone già presente nel treno");
        }
    }
    
    public void removeVagone(Vagone vagone) throws Exception{
        if (treno.contains(vagone)){
        treno.remove(vagone);
        } else {
            throw new Exception("Vagone non presente nel treno");
        }
    }

    public ArrayList<Vagone> getAllVagoni(){ //avevo giù il metodo getTreno
        return treno;
    }
    public int getLenghtTreno(){
        int lenght=0;
        for(Vagone vagone: treno){
            lenght+=vagone.getLunghezzaInCentimetri();
        }
        return lenght;
    }

    public double getPesoTreno(){
        double pesoTotale=0;
        for (Vagone vagone : treno) {
            if(vagone instanceof VagoneMerci){
                pesoTotale+=((VagoneMerci)vagone).getCaricoAttuale();
            } else if (vagone instanceof VagonePasseggeri){
                pesoTotale+=(((VagonePasseggeri)vagone).getnPasseggeri()*70) + vagone.getPesoAVuoto();
            }
        }
        return pesoTotale;
    }
    public ArrayList<Passeggero> getMaggiorenni(){
        ArrayList<Passeggero> maggiorenni = new ArrayList<Passeggero>();
        LocalDate oggi = LocalDate.now();

        for (Vagone vagone: treno) {
            if(vagone instanceof VagonePasseggeri){
                ArrayList <Passeggero> elencoPasseggeri;
                elencoPasseggeri=((VagonePasseggeri)vagone).getElencoPasseggeri();
                
                for(Passeggero passeggero : elencoPasseggeri){
                     Period period = Period.between(oggi, passeggero.getDataDiNascita()); //errore nell'ordine degli elementi di .between
                    //Period period = Period.between(passeggero.getDataDiNascita(), oggi); <--corretto
                    if (period.getYears()>=18){
                        maggiorenni.add(passeggero);
                    }
                }
            }
        }
        return maggiorenni;
    }

    @Override
    public String toString() {
        return "Treno [treno=" + treno + "]";
    }
    
}
