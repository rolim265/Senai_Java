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
        button.setBounds(10, 10, 100,50);

        // Torna a janela visível
        window.setVisible(true);

    }
}
