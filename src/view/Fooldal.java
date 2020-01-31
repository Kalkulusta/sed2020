package view;

import javax.swing.*;
import java.awt.*;

public class Fooldal {
    private JPanel panel_bl0kk;
    private JButton buttonQuiz;
    private JButton btnRanglista;

    private Fooldal() {

        btnRanglista.addActionListener(action -> {
            new Rangsor().show();
        });

        buttonQuiz.addActionListener(action -> {
            new Quiz().show();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nemtudom");
        frame.setContentPane(new Fooldal().panel_bl0kk);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setPreferredSize(new Dimension(500, 280));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}