package estudo.senai;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("continua array");

        ArrayList<String> listname = new ArrayList<String>();

        listname.add("Luíza");
        listname.add("Rolim");
        listname.add("guilherme");

        for (int i = 0; i < listname.size(); i++) {
            System.out.printf(" 0 %d° item da lista é %s\n", i+1, listname.get(i));
        }

        listname.add("Mateuzz");
        listname.add("Carlos");
        listname.add("Joel");
        listname.remove("guilherme");    //ou vc pode fazer por index ex
        listname.remove(3);

        System.out.println("Depois de adicionar informação");


        //sobstituição
        listname.set(listname.indexOf("Joel"), "Bordel");


        System.out.println("Antes de ordenar");
        //valor x (pode colocar oq vc quiser no lugar do x)
        for (String x : listname) {
            System.out.printf("o %d° item da lista é %s\n", listname.indexOf(x)+1, x);
        }

        Collections.sort(listname);

        System.out.println("depois de ordenar");
        for (String x : listname) {
            System.out.printf("o %d° item da lista é %s\n", listname.indexOf(x)+1, x);
        }

         //quando der -1 o bagui não existe
        System.out.printf("O indice do tresl é %d\n", listname.indexOf("tresl"));


    }
}
