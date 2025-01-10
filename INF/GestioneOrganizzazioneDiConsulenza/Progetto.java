import java.util.ArrayList;

class Progetto {
    private ArrayList<Personale> membri;

    public Progetto() {
        this.membri = new ArrayList<Personale>();
    }

    public void aggiungiMembro(Personale membro) {
        membri.add(membro);
    }
    public void rimuoviMembro(Personale membro){
        membri.remove(membro);
    }

    public double calcolaCostoComplessivo(int[] oreLavorate) throws Exception{
        if (membri == null || oreLavorate == null) {
            throw new IllegalArgumentException("Lista membri o array oreLavorate non può essere null");
        }
    
        if (membri.size() > oreLavorate.length) {
            throw new IllegalArgumentException("L'array oreLavorate deve avere almeno lo stesso numero di elementi di membri");
        }
    
        double costoTotale = 0;
        for (int i = 0; i < membri.size(); i++) {
            Personale membro = membri.get(i);
            if (membro == null) {
                throw new IllegalStateException("Un membro nella lista è null");
            }
            costoTotale += membro.calcolaCostoOrario() * oreLavorate[i];
        }
        return costoTotale;
    }
}

             //illegalStateException si usa quando c'è un elemento che potrebbe non essere nello stato giusto per eseguire l'operazione, 
             //in questo caso se membro == null, non si trova nello stato giusto per compiere l'operazione