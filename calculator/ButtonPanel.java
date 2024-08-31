package calculator;


import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel(CalculatorLogic calculatorLogic) {
        setLayout(new GridLayout(5, 4)); // Layout de grade 5x4

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
            button.addActionListener(calculatorLogic); // Define a ação ao clicar no botão
            add(button);
        }
    }
}