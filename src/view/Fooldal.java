package view;

import javax.swing.*;
import java.awt.*;

public class Fooldal {
    private JPanel panel_bl0kk;
    private JButton btnRanglista, btnBeiros, btnEgyvalaszos, btnTobbvalaszos;

    private Fooldal() {

        btnRanglista.addActionListener(action -> {
            new Rangsor().show();
        });

        btnBeiros.addActionListener(action -> {
            new Quiz(1).show();
        });

        btnEgyvalaszos.addActionListener(action -> {
            new Quiz(2).show();
        });

        btnTobbvalaszos.addActionListener(action -> {
            new Quiz(3).show();
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