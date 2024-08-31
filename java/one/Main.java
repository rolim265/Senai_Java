package one;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Cria a janela principal com configurações padrão
        JFrame window = createWindow();

        // Adiciona o primeiro botão à janela com o texto "ajuda" na posição (10, 10)
        addButton(window, "ajuda", 10, 10);

        // Adiciona o segundo botão à janela com o texto "miakhalifa" na posição (10, 150)
        addButton(window, "miakhalifa", 10, 150);

        // Torna a janela visível para o usuário
        window.setVisible(true);
    }

    /**
     * Cria e configura a janela principal da aplicação.
     * @return a instância configurada de JFrame.
     */
    private static JFrame createWindow() {
        // Cria uma nova instância de JFrame com o título "Rooling"
        JFrame window = new JFrame("Rooling");

        // Define o comportamento ao fechar a janela para terminar a aplicação
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o tamanho da janela como 1200 pixels de largura e 750 pixels de altura
        window.setSize(new Dimension(1200, 750));

        // Define a cor de fundo da janela como rosa
        window.getContentPane().setBackground(Color.pink);

        // Centraliza a janela na tela do usuário
        window.setLocationRelativeTo(null);

        // Define o ícone da janela, usando a imagem especificada no caminho fornecido
        window.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\main\\java\\img\\img.png"));

        // Impede que o usuário redimensione a janela
        window.setResizable(false);

        // Define o layout da janela como nulo para posicionamento absoluto dos componentes
        window.setLayout(null);

        return window; // Retorna a instância configurada de JFrame
    }

    /**
     * Adiciona um botão à janela com as configurações especificadas.
     * @param window a janela onde o botão será adicionado.
     * @param text o texto a ser exibido no botão.
     * @param x a posição horizontal do botão na janela.
     * @param y a posição vertical do botão na janela.
     */
    private static void addButton(JFrame window, String text, int x, int y) {
        // Cria uma nova instância de JButton
        JButton button = new JButton();

        // Define o texto exibido no botão
        button.setText(text);

        // Define a posição e o tamanho do botão: 150x100 pixels na posição (x, y)
        button.setBounds(x, y, 150, 100);

        // Define a cor de fundo do botão
        button.setBackground(new Color(0x874BDB));

        // Define a cor do texto do botão
        button.setForeground(Color.WHITE);

        // Define a fonte e o tamanho do texto no botão
        button.setFont(new Font("Arial", Font.PLAIN, 30));

        // Adiciona o botão à janela
        window.add(button);
    }
}
