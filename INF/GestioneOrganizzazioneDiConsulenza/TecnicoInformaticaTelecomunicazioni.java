public class TecnicoInformaticaTelecomunicazioni extends Tecnico {
    public TecnicoInformaticaTelecomunicazioni(String codice, String cognome, String nome, int annoAssunzione, boolean isInterno) {
        super(codice, cognome, nome, annoAssunzione, "Informatica-Telecomunicazioni", isInterno);
    }
    @Override
    public double calcolaCostoOrario() {
        double costoBase = 40;
        if (isInterno) {
            costoBase += (oggi.getYear() - annoAssunzione);
        }
        return costoBase;
    }
    @Override
    public String toString() {
        return super.toString()+"TecnicoInformaticaTelecomunicazioni []";
    }
    
}