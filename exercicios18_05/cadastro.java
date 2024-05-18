import java.awt.*;
import java.util.Random;
import java.util.Scanner;
public class cadastro {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Cadastro de Aluno");
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            byte idade = scanner.nextByte();
            scanner.nextLine();

            System.out.print("Digite seu gênero: ");
            String text = scanner.nextLine();
            char genero = text.toUpperCase().charAt(0);

            System.out.print("Digite seu curso: ");
            String curso = scanner.nextLine();

            String RA = String.valueOf(nome.charAt(0) + random.nextInt(1000));

            // Mostra as informações
            System.out.println("\nInformações cadastradas:");
            System.out.println("Nome completo: " + nome.toUpperCase());
            System.out.println("Quantidade de caracteres no nome: " + nome.length());
            System.out.println("Idade: " + idade);
            System.out.println("Gênero: " + genero);
            System.out.println("Curso: " + curso.toLowerCase());

            System.out.println("Seu RA é " + RA);
            scanner.close();
        }
    }


