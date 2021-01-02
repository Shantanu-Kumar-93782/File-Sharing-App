package ProjectTrial2;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class LeftPanel extends JPanel{
    public JButton dashBoardButton;
    public JButton sendPanelButton;
    public JButton receivePanelButton;
    public JButton settingsPanelButton;
    public Font buttonsfont = new Font("Comic Sans MS", Font.BOLD, 15);
    public LeftPanel()
    {

        dashBoardButton = new JButton();
        dashBoardButton.setFocusPainted(false);
        JLabel dashboard = new JLabel("   DashBoard");
        dashboard.setFont(buttonsfont);
        dashboard.setBorder(BorderFactory.createEmptyBorder());
        dashBoardButton.add(dashboard);
        dashBoardButton.setBackground(Color.WHITE);
        dashBoardButton.setBorder(BorderFactory.createEmptyBorder());
        dashBoardButton.setBounds(2, 2, 150, 75);


        sendPanelButton = new JButton();
        sendPanelButton.setFocusPainted(false);
        JLabel send = new JLabel("   Send Data");
        send.setFont(buttonsfont);
        send.setForeground(Color.white);
        send.setBorder(BorderFactory.createEmptyBorder());
        sendPanelButton.add(send);
        sendPanelButton.setBackground(Color.darkGray);
        sendPanelButton.setBorder(BorderFactory.createEmptyBorder());
        sendPanelButton.setBounds(2, 77, 150, 75);

        receivePanelButton = new JButton();
        receivePanelButton.setFocusPainted(false);
        JLabel receive = new JLabel("   Receive Data");
        receive.setFont(buttonsfont);
        receive.setForeground(Color.white);
        receive.setBorder(BorderFactory.createEmptyBorder());
        receivePanelButton.add(receive);
        receivePanelButton.setBackground(Color.darkGray);
        receivePanelButton.setBorder(BorderFactory.createEmptyBorder());
        receivePanelButton.setBounds(2, 152, 150, 75);

        settingsPanelButton = new JButton();
        receivePanelButton.setFocusPainted(false);
        JLabel settings = new JLabel("   Settings");
        settings.setFont(buttonsfont);
        settings.setForeground(Color.white);
        settings.setBorder(BorderFactory.createEmptyBorder());
        settingsPanelButton.add(settings);
        settingsPanelButton.setBackground(Color.darkGray);
        settingsPanelButton.setBorder(BorderFactory.createEmptyBorder());
        settingsPanelButton.setBounds(2, 227, 150, 75);

        
        Border leftPanelBorder = BorderFactory.createMatteBorder(2, 2, 2, 0, Color.black);
        this.setBounds(0, 15, 150, 540);
        this.setBackground(Color.darkGray);
        this.setBorder(leftPanelBorder);
        this.setLayout(null);
        this.add(dashBoardButton);
        this.add(sendPanelButton);
        this.add(receivePanelButton);
        this.add(settingsPanelButton);
    }
    
}
