package ProjectTrial2;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class MainPanel extends JFrame{
    public LeftPanel leftPanel;
    public DashBoardPanel dashBoardPanel;
    public SendPanel sendPanel;
    public ReceivePanel receivePanel;
    public JLabel header;
    public JLabel footer;
    public MainPanel()
    {   
        this.setTitle("File Sharing App");
        this.setSize(750, 607);

        //Header and footer settings start
        header = new JLabel();
        footer = new JLabel();
        header.setBounds(0, 0, 750, 15);
        footer.setBounds(0, 555, 750, 15);
        header.setHorizontalAlignment(JLabel.CENTER);
        footer.setHorizontalAlignment(JLabel.CENTER);
        header.setBackground(new Color(0x4285F4));
        header.setOpaque(true);
        footer.setBackground(new Color(0x4285F4));
        footer.setOpaque(true);
        header.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 2, Color.black));
        footer.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 2, Color.black));

        //Header and footer setting stop

        //Panels Creation start
        leftPanel = new LeftPanel();
        dashBoardPanel = new DashBoardPanel();
        sendPanel = new SendPanel();
        receivePanel = new ReceivePanel();
        //Panels Creation Stop

        this.setLayout(null);
        this.getContentPane().add(header);
        this.getContentPane().add(footer);
        this.getContentPane().add(leftPanel);
        this.getContentPane().add(dashBoardPanel);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public static void main(String[] args)
    {
        MainPanel mainPanel  = new MainPanel();
    }
}
