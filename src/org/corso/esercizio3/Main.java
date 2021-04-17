package org.corso.esercizio3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Set<Libro>> libreria = new HashMap<>();
        Set<Libro> avventura = new HashSet<>();
        Set<Libro> romantico = new HashSet<>();
        Set<Libro> storico = new HashSet<>();

        avventura.add(new Libro("Avventura","Robinson Crusoe"));
        romantico.add(new Libro("Romantico","libro romantico 1"));
        storico.add(new Libro("Storico","La caduta dell'aquila"));
        avventura.add(new Libro("Avventura","Libro d'avventura1"));
        romantico.add(new Libro("Romantico","libro romantico 2"));
        storico.add(new Libro("Storico","HISTORY"));

        libreria.put("Avventura", avventura);
        libreria.put("Romantico", romantico);
        libreria.put("Storico", storico);

        for(String l : libreria.keySet()){
            for(Libro l1 : libreria.get(l)){
                System.out.println(l1.getTitolo() + " - " + l1.getGenere());
            }
            
        }
    }
}
