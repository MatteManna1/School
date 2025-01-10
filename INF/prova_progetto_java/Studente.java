import java.time.LocalDate;

public class Studente {
    private String nome;    
    private String cognome;
    private String classe;
    private LocalDate dataNascita;  //tipo di dato che si usa per le date

    public Studente(){      //il metodo costruttore non ha per esempio String di fianco
        nome = "";
        cognome = "";
    } 
    public Studente(String nome, String cognome, String classe, LocalDate dataNascita){ //metodo costruttore
        this.nome = nome; //il this è il reference locale all'oggetto; se c'è ambiguità è buona prassi usare il this
        this.cognome = cognome;
        this.classe = classe;
        this.dataNascita = dataNascita;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public LocalDate getDataNascita() {
        return dataNascita;
    }
    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
    public String toString(){
        return "nome " + nome + "\tcognome " + cognome + "\tclasse " + classe + "\tdata "+ dataNascita;
    }
    public boolean isOmonimo(Studente s){
        
        return this.nome.equals(s.getNome()) && this.cognome.equals(s.getCognome());    //si può anche senza get in questo caso
    }
}
