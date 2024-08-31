package calculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorLogic implements ActionListener {
    private JTextField display;
    private double num1, num2, result;
    private char operator;

    public CalculatorLogic(JTextField display) {
        this.display = display;
    }

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
}