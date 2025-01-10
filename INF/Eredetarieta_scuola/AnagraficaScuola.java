import java.util.ArrayList;

public class AnagraficaScuola {
    private ArrayList <Persona> anagrafica;

    public AnagraficaScuola() {
        this.anagrafica = new ArrayList<>();
    }

    public void addPersona(Persona persona){
        anagrafica.add(persona);
    }

    @Override
    public String toString() {
        return "AnagraficaScuola [anagrafica=" + anagrafica + "]";
    }

    public double getSommaStipendi(){
        double somma=0;
        for (Persona persona : anagrafica) {
            /* 
            try{
                somma += ((Docente)persona).getStipendio();            
            } catch (Exception e){

            }
            */
            if(persona instanceof Docente){ //se la persona estratta dall'array è un istanza di Docente esegue la somma
                somma += ((Docente)persona).getStipendio();   
            }
        }
        return somma;
    }

        
    public ArrayList<Docente> getCdc(Classe classe) {
        ArrayList<Docente> docenti = new ArrayList<>();
        
        for (Persona persona : anagrafica) {
            if (persona instanceof Docente) { 
                Docente docente = (Docente) persona;
                for (Classe c : docente.getClassi()) { 
                    if (c.equals(classe)) {
                        docenti.add(docente); 
                    }
                }
            }
        }
        
        return docenti; 
    }
    

    
    
}
