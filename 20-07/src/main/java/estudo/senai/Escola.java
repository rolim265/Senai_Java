package estudo.senai;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.nextLine();

        String[] arrayListStringsBeforeConvertion = entry.split(" ");
        ArrayList<String> arrayListStrings = new ArrayList<>();

        for (int i = 0; i < arrayListStringsBeforeConvertion.length; i++){
            arrayListStrings.add(String.valueOf(arrayListStringsBeforeConvertion[i]));
        }

        ArrayList<Double> arrayListDoubles = new ArrayList<>();
        for (int i = 0; i < arrayListStrings.size(); i++){
            arrayListDoubles.add(Double.parseDouble(arrayListStrings.get(i)));
        }
        int numerosDigitados = arrayListDoubles.size();
        double soma = 0;
        for (int i = 0; i < numerosDigitados; i++){
            soma += arrayListDoubles.get(i);
        }
        double media = soma/numerosDigitados;
        double maior = Collections.max(arrayListDoubles);
        double menor = Collections.min(arrayListDoubles);
        arrayListDoubles.remove(menor);
        int posicacao = arrayListDoubles.indexOf(maior);

        Collections.sort(arrayListDoubles, Collections.reverseOrder());


        System.out.println(media);
        System.out.println(soma);
        System.out.println(numerosDigitados);
        System.out.println(maior);
        System.out.println(menor);
        System.out.println("excluido");
        System.out.println(posicacao);
        System.out.println("Ordem crescente: ");
        for (int i = 0; i < arrayListDoubles.size(); i++){
            System.out.printf("%.5f ", arrayListDoubles.get(i));
        }
        scanner.close();
    }
}