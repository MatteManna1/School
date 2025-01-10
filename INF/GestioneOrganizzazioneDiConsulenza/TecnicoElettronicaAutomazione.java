public class TecnicoElettronicaAutomazione extends Tecnico {
    public TecnicoElettronicaAutomazione(String codice, String cognome, String nome, int annoAssunzione, boolean isInterno) {
        super(codice, cognome, nome, annoAssunzione, "Elettronica-Automazione", isInterno);
    }

    @Override
    public double calcolaCostoOrario() {
        double costoBase = 50;
        if (isInterno) {
            costoBase += (oggi.getYear() - annoAssunzione);
        }
        return costoBase;
    }

    @Override
    public String toString() {
        return super.toString()+"TecnicoElettronicaAutomazione []";
    }
    
}