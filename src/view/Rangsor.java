package view;

import javax.swing.*;
import java.awt.*;

public class Rangsor extends Form {

    private JPanel panel_rangsor;
    private JList<String> rangsor;

    DefaultListModel<String> dlm;

    private void createUIComponents() {
        dlm = new DefaultListModel<>();

        rangsor = new JList<>(dlm);
        rangsor.setModel(dlm);
        rangsor.ensureIndexIsVisible(dlm.getSize());
        rangsor.setCellRenderer(new SzinesSor());
        rangsor.updateUI();
    }

    void show() {
        super.show("Ranglista", panel_rangsor, new Dimension(750, 650));
    }

}