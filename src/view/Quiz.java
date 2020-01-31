package view;

import javax.swing.*;
import java.awt.*;

public class Quiz extends Form {
    private JPanel panel1, radio_container;
    private JLabel quiz_title, question;
    private JTextPane code;
    private JFormattedTextField input;
    private JRadioButton radio1, radio2, radio3, radio4;
    private JLabel label1, label2, label3, label4;
    private JButton btnMehet;

    public Quiz(int quiz_tipus) {
        if (quiz_tipus == 1)
            radio_container.setVisible(false);
        else
            input.setVisible(false);
    }

    void show() {
        super.show("Quiz", panel1, new Dimension(750, 650));
    }
}
