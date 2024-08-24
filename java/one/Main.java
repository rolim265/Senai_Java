package one;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {



        // Cria uma instância do JFrame
        JFrame window = new JFrame("Rooling");

        // Define o comportamento ao fechar a janela
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o tamanho da janela
        window.setSize(new Dimension(1200, 750));

        // Define a cor de fundo da janela
        window.getContentPane().setBackground(Color.pink);

        ///centralizar
        window.setLocationRelativeTo(null);

        // Define o ícone para o JFrame
        window.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\main\\java\\img\\img.png")) ; // Corrigido para usar 'window'

        ///n mudar tamanho de tela
        window.setResizable(false);

        //layout
        window.setLayout(null);

        //estanciar butao
        JButton button = new JButton();

        //texto no butao
        button.setText("ajuda");

        //adicionar butoa
        window.add(button);

        //onde vai tar o butao
        button.setBounds(10, 10, 150,100);

        //mudar a cor do butao
        button.setBackground(new Color(0x874BDB));

        //mudar cor do texto do butao
        button.setForeground(Color.WHITE);

        //mudar fonte do texto od butao ou texto normal
        button.setFont(new Font("Arial", Font.PLAIN, 30));

        addButa(window);

        // Torna a janela visível
        window.setVisible(true);
    }
    public static void addButa(JFrame window){
        JButton buta = new JButton();

        //texto no butao
        buta.setText("miakhalifa");

        //adicionar butoa


        //onde vai tar o butao
        buta.setBounds(10, 150, 150,100);

        //mudar a cor do butao
        buta.setBackground(new Color(0x874BDB));

        //mudar cor do texto do butao
        buta.setForeground(Color.WHITE);

        //mudar fonte do texto od butao ou texto normal
        buta.setFont(new Font("Arial", Font.PLAIN, 30));

        window.add(buta);

    }

}
