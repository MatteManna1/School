import java.time.LocalDate;

public class Autore {
    private String nome;
    private String cognome;
    private LocalDate data;

    public Autore(String nome, String cognome, LocalDate data){
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean compareAutore(Autore name){
        return (name.getNome().equals(this.getNome()) && name.getCognome().equals(this.getCognome()) && name.getData().equals(this.getData()));
    }
    
    public String toString() {
        return "Autore [nome=" + nome + ", cognome=" + cognome + ", data=" + data + "]";
    }
}