package entities;

public class Calculos {

    // Cálculos do Retângulo
    public static double areaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double perimetroRetangulo(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }

    // Cálculos do Triângulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double perimetroTriangulo(double lado1, double lado2, double base) {
        return lado1 + lado2 + base;
    }

    // Cálculos do Quadrado
    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double perimetroQuadrado(double lado) {
        return 4 * lado;
    }

    // Cálculos do Losango
    public static double areaLosango(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    public static double perimetroLosango(double lado) {
        return 4 * lado;
    }

    // Cálculos do Círculo
    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }
}
