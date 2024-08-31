package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    // Campo de texto para exibir os números e resultados
    private JTextField display;

    // Variáveis para armazenar os operandos e o resultado
    private double num1, num2, result;

    // Variável para armazenar o operador escolhido
    private char operator;

    // Construtor da classe CalculadoraGUI
    public Calculator() {
        // Configurações da janela principal
        setTitle("Calculadora");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criação e configuração do campo de texto (display)
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false); // Impede edição direta do display
        add(display, BorderLayout.NORTH); // Adiciona o display ao topo da janela

        // Painel para organizar os botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4)); // Layout de grade 5x4

        // Array de Strings para os textos dos botões
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "Del"
        };

        // Criação dos botões e adição ao painel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this); // Define a ação ao clicar no botão
            panel.add(button);
        }

        // Adiciona o painel de botões ao centro da janela
        add(panel);

        // Torna a janela visível
        setVisible(true);
    }

    // Método chamado quando um botão é clicado
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Obtém o texto do botão clicado

        // Se for um número ou ponto, adiciona ao display
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            display.setText(display.getText() + command);
        }
        // Se for "=", realiza a operação escolhida
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText()); // Converte o texto do display para número
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result)); // Exibe o resultado no display
            num1 = result; // Armazena o resultado para operações subsequentes
        }
        // Se for "C", limpa o display
        else if (command.equals("C")) {
            display.setText("");
        }
        // Se for "Del", apaga o último caractere do display
        else if (command.equals("Del")) {
            String currentText = display.getText();
            if (currentText.length() > 0) {
                display.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
        // Caso contrário, trata como um operador (+, -, *, /)
        else {
            num1 = Double.parseDouble(display.getText()); // Armazena o primeiro operando
            operator = command.charAt(0); // Armazena o operador
            display.setText(""); // Limpa o display para o próximo número
        }
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        new Calculator(); // Cria e exibe a interface gráfica da calculadora
    }
}