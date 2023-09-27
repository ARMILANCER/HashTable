package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int cont=0;

        for(int i=1;i<=100;i++){
            table.put(i,new Random().nextInt(1,101));
        }

        for(int i=1;i<=100;i+=2){
            cont++;
            System.out.println("Valore"+table.get(i));
        }
        System.out.println("Numero di valori dispari" + cont);
     }
}
