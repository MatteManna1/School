class Auto implements Rumoroso, Motorizzato {
    private String marca;
    private String modello;

    public Auto(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public void emettiRumore() {
        System.out.println("L'auto emette un rumore del motore!");
    }

    @Override
    public void accendiMotore() {
        System.out.println("Motore acceso!");
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modello=" + modello + "]";
    }
}