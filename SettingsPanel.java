package ProjectTrial2;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
public class SettingsPanel extends JPanel{
    public SettingsPanel()
    {
        Border sendPanelBorder = BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK);
        this.setBounds(150, 15, 600, 540);
        this.setBackground(Color.white);
        this.setBorder(sendPanelBorder);

    }
}
