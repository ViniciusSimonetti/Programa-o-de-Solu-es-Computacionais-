import javax.swing.*;
import java.awt.*;

public class Calculadora {

    public static void main(String[] args) {
        // Cria a janela da calculadora
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout principal
        frame.setLayout(new BorderLayout());

        // Display onde aparece o número
        JTextField display = new JTextField();
        display.setEditable(false); // Desabilita edição direta
        frame.add(display, BorderLayout.NORTH);

        // Painel com os botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));  // Grid de 4x4
        frame.add(panel, BorderLayout.CENTER);

        // Definindo os botões
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        // Adiciona os botões ao painel e atribui as ações de clique
        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
            // Atribuindo o listener para cada botão, passando a referência ao display
            button.addActionListener(new ButtonCalculadoraActions(display, text));
        }

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
