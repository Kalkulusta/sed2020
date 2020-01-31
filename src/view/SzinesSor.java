package view;

import javax.swing.*;
import java.awt.*;

public class SzinesSor extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean kivalasztva, boolean fokusz) {
        Component c = super.getListCellRendererComponent(list, value, index, kivalasztva, fokusz);
        if (index % 2 == 0)
            c.setBackground(Color.white);
        else
            c.setBackground(Color.lightGray);

        return c;
    }
}
