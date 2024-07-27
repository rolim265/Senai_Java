package aplication;
import entities.Trapezio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trapezio trap1 = new Trapezio();
        Trapezio trap2 = new Trapezio();


        System.out.println("Calculando a área Trapezio-1");

        System.out.println("Digite a base maior: ");
        trap1.baseMaior = scanner.nextDouble();
        System.out.println("Digite a base menor: ");
        trap1.baseMenor = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        trap1.altura = scanner.nextDouble();

        System.out.println("Calculando a área Trapezio-2");

        System.out.println("Digite a base maior: ");
        trap2.baseMaior = scanner.nextDouble();
        System.out.println("Digite a base menor: ");
        trap2.baseMenor = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        trap2.altura = scanner.nextDouble();


        if (trap1.area() > trap2.area()){
            System.out.printf("A área do Trapezio-1 é igual a %.2f e ela é maior do que o Trapezio-2", trap1.area());
        } else if (trap2.area() == trap1.area()){
            System.out.printf("A área do Trapezio-1 %.2f é igual a do Trapezio-2", trap1.area());
        } else {
            System.out.printf("A área do Trapezio-2 é igual a %.2f e ela é maior do que o Trapezio-1", trap2.area());
        }


    }
}