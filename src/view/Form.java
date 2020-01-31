package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Form {

    public void show(String nev, JPanel panel, Dimension dim) {
        JFrame frame = new JFrame(nev);
        frame.setContentPane(panel);
        frame.setResizable(true);
        frame.setPreferredSize(dim);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        };
        frame.addWindowListener(exitListener);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}