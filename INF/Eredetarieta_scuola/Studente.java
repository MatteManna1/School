public class Studente extends Persona {
    private Classe classe;

    public Studente(String nome, String cognome, String codice_fiscale, Classe classe) {
        super(nome, cognome, codice_fiscale);
        this.classe = classe;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return super.toString()+",Studente[classe=" + classe + "]";
    }

    
    

}
