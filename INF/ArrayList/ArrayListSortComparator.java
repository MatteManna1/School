/**
 * @(#)ArrayListComparable.java
 * Uso dell interfaccia Comparator per ordinare ArrayList di oggetti
 * 
 * @author zalberto
 * @version 1.00 2009/11/7
 */
import java.util.*; 

public class ArrayListSortComparator { 
    public static void main (String[] args) { 
        ArrayList<Studente> lista = new ArrayList<Studente>();
        lista.add(new Studente(111, "zorro", "roma")); 
        lista.add(new Studente(131, "alberto", "milano")); 
        lista.add(new Studente(121, "mario", "parma")); 
  
        System.out.println("Non ordinato");
        for (Studente s: lista) 
            System.out.println(s); 

        // Primo modo
        Collections.sort(lista, new OrdinaPerNome());
        System.out.println("\nOrdinato per nome");
        for (Studente s: lista)
            System.out.println(s);
        
        // Secondo modo equivalente
        lista.sort(new OrdinaPerMatricola());
        System.out.println("\nOrdinato per matricola");
        for (Studente s: lista)
            System.out.println(s);
    }
}

class Studente { 
    int matricola; 
    String nome, indirizzo; 
  
    public Studente(int matricola, String nome, String indirizzo) { 
        this.matricola = matricola; 
        this.nome = nome; 
        this.indirizzo = indirizzo; 
    }

    public String toString() { 
        return this.matricola + " " + this.nome + " " + this.indirizzo; 
    }
}

class OrdinaPerNome implements Comparator<Studente> { 
    public int compare(Studente a, Studente b) { 
        return a.nome.compareTo(b.nome);
    }
}

class OrdinaPerMatricola implements Comparator<Studente> { 
    public int compare(Studente a, Studente b) { 
        return a.matricola - b.matricola;
    }
}