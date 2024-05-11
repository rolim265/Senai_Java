package tipos.primitivos;

import java.util.Scanner;

    public class Operadores {
        public static void main(String[]args){
//        codigo principal
            Scanner scanner = new Scanner(System.in);

            System.out.println("Soma");
            System.out.print("Digite um número a: ");
            int a = scanner.nextInt();

            System.out.print("Digite um número b: ");
            int b = scanner.nextInt();

//        a seguir falamos q a soma vire uma variavel e receba inteiro

            int soma;


//        agora a variavel tem que receber a conta 'seu valor'


            soma = a + b;

            System.out.println("resultado foi: " + soma);


        }
    }

