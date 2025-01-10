import java.time.LocalDate;

public abstract class DipendentiScuola {
    private String nome;
    private String sesso;
    private LocalDate dataNascita;
    private double stipendio;

    public DipendentiScuola(String nome, String sesso, LocalDate dataNascita, double stipendio) {
        this.nome = nome;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "DipendentiScuola [nome=" + nome + ", sesso=" + sesso + ", dataNascita=" + dataNascita + ", stipendio="
                + stipendio + "]";
    }
    
    

    
    
}