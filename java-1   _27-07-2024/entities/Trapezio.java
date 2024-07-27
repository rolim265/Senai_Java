package entities;

public class Trapezio {

    public double baseMenor, baseMaior, altura;

    public double area() {

        return (baseMaior + baseMenor) * altura / 2;

    }

}
