package org.corso.esercizio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Macchina {
    private String modello;
    private int anno;
    private String motore;
   
    
    
    public String getMotore() {
        return motore;
    }
    public void setMotore(String motore) {
        this.motore = motore;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public Macchina(String modello, int anno, String motore) {
        this.modello = modello;
        this.anno = anno;
        this.motore = motore;
    }

    public Macchina() {

    }
    
    public void stampa(){
        List<Macchina> macchine = new ArrayList<>();
        macchine.add(new Macchina("fiat",2001));
        macchine.add(new Macchina("ferrari",2001));
        macchine.add(new Macchina("tesla",2005));
        macchine.add(new Macchina("suzuki",2005));
        macchine.add(new Macchina("opel",2005));

      /*  Macchina macchina1 = new Macchina("fiat",2001);
        Macchina macchina2 = new Macchina("ferrari",2001);
        Macchina macchina3 = new Macchina("tesla",2005);
        Macchina macchina4 = new Macchina("suzuki",2005);
        Macchina macchina5 = new Macchina("opel",2005); */
        for(Macchina item : macchine){
            System.out.println(item.getAnno());
        }


       

     /*   macchine.remove();
        for(Macchina item :  macchine){
           
            System.out.println(item.getAnno());
        }
      /*  macchine.remove(1);
        for (Integer item : macchine) {
            System.out.println(item);
        }
        macchine.remove(0);
        for (Integer item : macchine) {
            System.out.println(item);
        }*/
    }
    
    public void stampaLista(){

        Iterator<Macchina> iteraMacchina = macchine.iterator();
        while(iteraMacchina.hasNext()){
           Macchina item = iteraMacchina.next();
            if(item.getAnno() == 2001 ){
                iteraMacchina.remove();
               
            }
            
        }
        for(Macchina item : macchine){
            System.out.println("Anno : " + item.getAnno());
        }

    }
    public void stampaCilindrata(){
        List<Macchina> macchine = new ArrayList<>();
        macchine.add(new Macchina("fiat",2001,"500"));
        macchine.add(new Macchina("ferrari",2001,"1400"));
        macchine.add(new Macchina("tesla",2005,"500"));
        macchine.add(new Macchina("suzuki",2005,"1400"));
        macchine.add(new Macchina("opel",2005,"500"));

        for(Macchina item : macchine){
            System.out.println(item.getModello());
            System.out.println("Macchine e cilindrata : " + item.getModello());
        }
        Iterator<Macchina> iteraMacchina = macchine.iterator();
        while(iteraMacchina.hasNext()){
           Macchina item = iteraMacchina.next();
            if(item.getAnno() == 2001 ){
                iteraMacchina.remove();
               
            }
            
        }
        for(Macchina item : macchine){
            System.out.println("Cilindrata : " + item.getMotore());
        }

    }

}
