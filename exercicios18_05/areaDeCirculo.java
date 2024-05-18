//public class areaDeCirculo {
//    public static void main(String[] args) {
//
//        double raio;
//        double a;
//        final double b;
//        double area;
//        a = 100;
//        b = 3.14;
//        raio = 10;
//
//        area = a * b;
//
//        System.out.println("Area de um círculo");
//        System.out.println("Tendo como Raio do círculo " + raio + " cm o quadrado dele é" + a);
//        System.out.println("e sabendo que o valor do pi é " + b);
//        System.out.printf("concluímos que a Área deste círculo é de %.2f", area);
//
//
//
//    }
//}
import java.util.Locale;
import java.util.Scanner;

public class areaDeCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double raio;
        double a;
        final double b;
        double area;

        System.out.println("Digite o raio do círculo:");
        raio = scanner.nextDouble();

        a = Math.pow(raio, 2);
        b = Math.PI;

        area = a * b;

        System.out.println("Área de um círculo:");
        System.out.println("Tendo como raio do círculo " + raio + " cm, o quadrado dele é " + a);
        System.out.println("E sabendo que o valor de pi é " + b);
        System.out.printf("Concluímos que a área deste círculo é de %.2f", area);

        scanner.close();
    }
}