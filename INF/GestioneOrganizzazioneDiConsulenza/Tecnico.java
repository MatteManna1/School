public abstract class Tecnico extends Personale {
    protected String areaCompetenza;
    protected boolean isInterno;

    public Tecnico(String codice, String cognome, String nome, int annoAssunzione, String areaCompetenza, boolean isInterno) {
        super(codice, cognome, nome, annoAssunzione);
        this.areaCompetenza = areaCompetenza;
        this.isInterno = isInterno;
    }

    public String getAreaCompetenza() {
        return areaCompetenza;
    }

    public void setAreaCompetenza(String areaCompetenza) {
        this.areaCompetenza = areaCompetenza;
    }

    public boolean isInterno() {
        return isInterno;
    }

    public void setInterno(boolean isInterno) {
        this.isInterno = isInterno;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Tecnico [areaCompetenza=" + areaCompetenza + ", isInterno=" + isInterno + "]";
    }
    
}