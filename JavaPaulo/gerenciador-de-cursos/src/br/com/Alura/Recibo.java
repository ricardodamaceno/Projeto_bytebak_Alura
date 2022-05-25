package br.com.Alura;

import java.util.Set;
import java.util.TreeSet;

public class Recibo implements Comparable<Recibo> {
	
	public Recibo(String alguma) {
		
	}

       public static void main(String [] args) {
    	   
    	   Recibo rec1 = new Recibo("A");
    	   Recibo rec2 = new Recibo("B");
    	   Recibo rec3 = new Recibo("C");
    	   
             Set<Recibo> recibos = new TreeSet<Recibo>();
             recibos.add(rec1);
             recibos.add(rec2);
             recibos.add(rec3);

             for (Recibo teste : recibos) {
                    System.out.println(teste);
             }
       }
       
       

	@Override
	public int compareTo(Recibo o) {

		return 1;
		
	}
	
}
