import java.time.LocalDate;

public class Docente extends DipendentiScuola{
    private double oreDocenza;

    public Docente(String nome, String sesso, LocalDate dataNascita, double stipendio, double oreDocenza) {
        super(nome, sesso, dataNascita, stipendio);
        this.oreDocenza = oreDocenza;
    }

    public double getOreDocenza() {
        return oreDocenza;
    }

    public void setOreDocenza(double oreDocenza) {
        this.oreDocenza = oreDocenza;
    }

    @Override
    public String toString() {
        return super.toString()+"Docente [oreDocenza=" + oreDocenza + "]";
    }
    
    

}