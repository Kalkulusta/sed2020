package view;

import javax.swing.*;
import java.awt.*;

public class Quiz extends Form {
    private JPanel panel1, radio_container;
    private JLabel quiz_title;
    private JTextPane code;
    private JFormattedTextField input;
    private JRadioButton radioButtonA, radioButtonB, radioButtonC, radioButtonD;
    private JLabel label_a, label_b, label_c, label_d;
    private JButton btnMehet;

    void show() {
        super.show("Quiz", panel1, new Dimension(750, 650));
    }
}
