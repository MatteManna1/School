import java.time.LocalDate;

public class Atleta{
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private double altezza;
    private double peso;

    public Atleta(String nome, String cognome, LocalDate dataDiNascita, double altezza, double peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.altezza = altezza;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Atleta [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", altezza="
                + altezza + ", peso=" + peso + "]";
    }
    
    

    
}