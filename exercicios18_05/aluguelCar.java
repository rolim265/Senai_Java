import java.sql.SQLOutput;
import java.util.Scanner;
public class aluguelCar {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       double dias;
       double km;
       double aluguel;
       double totald;
       double totalk;

        System.out.println("Faça o cálculo do aluguel de seu carro a ser pago!!!");
        System.out.println("Quantos dias você esteve com o carro?");
        dias = scanner.nextInt();

        System.out.println("Quantos KM você andou com o carro???");
        km = scanner.nextInt();

        totald = dias * 86.75;
        totalk = km * 1.23;
        aluguel = totald + totalk;

        System.out.println("no total sera " + aluguel + "R$");
    }

}
