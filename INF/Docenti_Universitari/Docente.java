public class Docente extends Persona {
    private String materia;
    private static int contatore=0;
    private int codice;

    public Docente(String nome, String cognome, String indirizzo, int eta, String materia) {
        super(nome, cognome, indirizzo, eta);
        this.materia = materia;
        this.codice = contatore;
        contatore++;
    }
    

    public Docente() {
        super(null, null, null, 0);
        this.materia=null;
        this.codice = contatore;
        contatore++;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCodice() {
        return codice;
    }


    public void setCodice(int codice) {
        this.codice = codice;
    }


    @Override
    public String toString() {
        return super.toString() + "Docente [materia=" + materia + ", codice=" + codice + "]";
    }

    


}
