public class Auto extends Veicolo {
    private int numero_porte;

    public Auto(int anno, String modello, int velocita_max, int numero_porte) {
        super(anno, modello, velocita_max);
        this.numero_porte = numero_porte;
    }

    public int getNumero_porte() {
        return numero_porte;
    }

    public void setNumero_porte(int numero_porte) {
        this.numero_porte = numero_porte;
    }
    @Override
    public String toString() {  //si puo anche fare senza super. 
        return (super.toString() + ", numero_porte="+numero_porte);
    }
    

}
