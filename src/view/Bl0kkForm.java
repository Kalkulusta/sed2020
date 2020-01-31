package view;


import javax.swing.*;
import java.awt.*;

public class Bl0kkForm {
    private JPanel panel_bl0kk;

    private Bl0kkForm() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("nemtudom");
        frame.setContentPane(new Bl0kkForm().panel_bl0kk);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setPreferredSize(new Dimension(500, 280));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}