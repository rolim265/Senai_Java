import java.util.Scanner;
public class idade {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o ano atual:");
            int anoAtual = scanner.nextInt();
            System.out.println("Digite o ano que você nasceu:");
            int anoNascimento = scanner.nextInt();
            int idade = anoAtual - anoNascimento;
            System.out.println("Sua idade é: " + idade + " anos");

            scanner.close();
        }
    }

