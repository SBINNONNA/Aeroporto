package model; // cambia questo con il tuo package, se serve

import javax.swing.*;

public class Myform {
    // Questi componenti vengono generati automaticamente da IntelliJ
    private JPanel rootPanel;
    private JTextField inputField;
    private JButton salutaButton;
    private JLabel outputLabel;

    public Myform() {
        // Azione del pulsante
        salutaButton.addActionListener(e -> {
            String nome = inputField.getText();
            if (!nome.isEmpty()) {
                outputLabel.setText("Ciao, " + nome + "!");
            } else {
                outputLabel.setText("Inserisci un nome.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Esempio GUI");
            frame.setContentPane(new Myform().rootPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
