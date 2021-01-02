package ProjectTrial2;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DashBoardPanel extends JPanel{
    public DashBoardPanel()
    {
        Border dashBoardBorder = BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK);
        this.setBounds(150, 15, 600, 540);
        this.setBackground(Color.white);
        this.setBorder(dashBoardBorder);
    }
    
}
