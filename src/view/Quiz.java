package view;

import javax.swing.*;
import java.awt.*;

public class Quiz extends Form {
    private JPanel panel1, radio_container;
    private JLabel quiz_title;
    private JTextPane code;
    private JFormattedTextField input;
    private JRadioButton radioButtonA, radioButtonB, radioButtonC, radioButtonD;
    private JButton button1;

    void show() {
        super.show("Quiz", panel1, new Dimension(750, 650));
    }
}
