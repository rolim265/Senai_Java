package tipos.primitivos;

public class Exercicio {

    public static void main(String[] args) {
        String gameRPG = "Hogwarts Legacy";
        double priceRPG = 107.8;
        String gameIndie = "Hollow Knight";
        double priceIndie = 46.99;
        int age = 35;
        int code = 2367;
        char gender = 'M';
        double media = (priceRPG + priceIndie) / 2.0;
        System.out.println("Produtos:");
        System.out.println(gameRPG + ", está custando R$" + priceRPG);
        System.out.println(gameIndie + ", está custando R$" + priceIndie);
        System.out.printf("O comprador tinha %d anos, código %d e genero: %s%n", Integer.valueOf(age), Integer.valueOf(code), gender);
        System.out.printf("A média de preço dos produtos é igual a %.2f", media);
    }
}
