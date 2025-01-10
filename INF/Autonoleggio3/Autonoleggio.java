import java.util.ArrayList;

public class Autonoleggio {
    private ArrayList <Veicolo> autonoleggio;

    public Autonoleggio() {
        this.autonoleggio = new ArrayList<Veicolo>();
    }

    public ArrayList<Veicolo> getAutonoleggio() {
        return autonoleggio;
    }

    public void setAutonoleggio(ArrayList<Veicolo> autonoleggio) {
        this.autonoleggio = autonoleggio;
    }

    public void addVeicolo(Veicolo veicolo){
        autonoleggio.add(veicolo);
    }
    public void removeVeicolo(Veicolo veicolo){
        autonoleggio.remove(veicolo);
    }
    public Veicolo getVeicoloByTarga(String targa) throws Exception{
        for (Veicolo veicol : autonoleggio) {
            if (veicol.getTarga().equals(targa)){
                return veicol;
            } 
        }
        throw new Exception("Targa not found");
    }

    public double costoAutovetture(double kmPercorsi, double litriUtilizzati) throws Exception{
        if(kmPercorsi<0 || litriUtilizzati<0){
            throw new Exception("Te mia gità raza d'un cojon");
        }
        return 50+(kmPercorsi/25)+2*litriUtilizzati;
    }

    public double costoFurgone(double kmPercorsi, double litriUtilizzati) throws Exception{
        if(kmPercorsi<0 || litriUtilizzati<0){
            throw new Exception("Te mia gità raza d'un cojon");
        }
        
        if(kmPercorsi<=100){
            return 70+2*litriUtilizzati;
        }
        return 70+((kmPercorsi-100)/30) + 2*litriUtilizzati;
    }

    @Override
    public String toString() {
        return "Autonoleggio [autonoleggio=" + autonoleggio + "]";
    }
    
}
