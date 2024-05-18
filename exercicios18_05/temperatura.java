import java.util.Scanner;
public class temperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double fahnhereit;
        double kelvin;
        double reaumur;
        double rankine;


        System.out.println("Converção de temperaturas");
        System.out.println("Digite a temperatura que você gostaria de converter: ");
        int a = scanner.nextInt();

        fahnhereit = (a * 9 / 5) + 32;

        kelvin = a + 273;

        reaumur = a * 4 / 5;

        rankine =  (a + 273.15) * 9 / 5;

        System.out.println("Conversão dos " + a + " Graus celsius em Fahnhereit é " + fahnhereit);
        System.out.println("Conversão dos " + a + " Graus celsius em Kelvin é " + kelvin);
        System.out.println("Conversão dos " + a + " Graus celsius em Reaumur é " + reaumur);
        System.out.println("Conversão dos " + a + " Graus celsius em Rankine é " + rankine);

        scanner.close();
    }
}
