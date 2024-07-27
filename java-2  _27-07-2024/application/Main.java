package application;

import entities.Calculos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a conta: 1. Retângulo 2. Triângulo 3. Quadrado 4. Losango 5. Círculo");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                // Retângulo
                System.out.print("Digite o comprimento do retângulo: ");
                double comprimento = sc.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double largura = sc.nextDouble();

                System.out.println("Área: " + Calculos.areaRetangulo(comprimento, largura));
                System.out.println("Perímetro: " + Calculos.perimetroRetangulo(comprimento, largura));
                break;

            case 2:
                // Triângulo
                System.out.print("Digite a base do triângulo: ");
                double base = sc.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = sc.nextDouble();
                System.out.print("Digite o comprimento do primeiro lado do triângulo: ");
                double lado1 = sc.nextDouble();
                System.out.print("Digite o comprimento do segundo lado do triângulo: ");
                double lado2 = sc.nextDouble();

                System.out.println("Área: " + Calculos.areaTriangulo(base, altura));
                System.out.println("Perímetro: " + Calculos.perimetroTriangulo(lado1, lado2, base));
                break;

            case 3:
                // Quadrado
                System.out.print("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();

                System.out.println("Área: " + Calculos.areaQuadrado(lado));
                System.out.println("Perímetro: " + Calculos.perimetroQuadrado(lado));
                break;

            case 4:
                // Losango
                System.out.print("Digite o comprimento da primeira diagonal do losango: ");
                double diagonal1 = sc.nextDouble();
                System.out.print("Digite o comprimento da segunda diagonal do losango: ");
                double diagonal2 = sc.nextDouble();
                System.out.print("Digite o comprimento do lado do losango: ");
                double ladoLosango = sc.nextDouble();

                System.out.println("Área: " + Calculos.areaLosango(diagonal1, diagonal2));
                System.out.println("Perímetro: " + Calculos.perimetroLosango(ladoLosango));
                break;

            case 5:
                // Círculo
                System.out.print("Digite o raio do círculo: ");
                double raio = sc.nextDouble();

                System.out.println("Área: " + Calculos.areaCirculo(raio));
                System.out.println("Perímetro: " + Calculos.perimetroCirculo(raio));
                break;

            default:
                System.out.println("Escolha inválida");
                break;
        }

        sc.close();
    }
}
