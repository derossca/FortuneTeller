import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    JPanel mainPnl;
    JPanel topPnl;
    JPanel middlePnl;
    JPanel bottomPnl;

    JTextArea displayTA;
    JScrollPane scroll;

    JLabel titlelbl;
    ImageIcon icon;

    JButton fortuneBtn;
    JButton quitBtn;

    public FortuneTellerFrame() {

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
        createTopPanel();
        mainPnl.add(topPnl, BorderLayout.NORTH);
        createMiddlePanel();
        mainPnl.add(middlePnl, BorderLayout.CENTER);
        createBottomPanel();
        mainPnl.add(bottomPnl, BorderLayout.SOUTH);

        add(mainPnl);
        setTitle("Fortune Teller");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTopPanel() {

    }

    private void createMiddlePanel() {
        middlePnl = new JPanel();
        displayTA = new JTextArea(10, 100);
        scroll = new JScrollPane(displayTA);
        middlePnl.add(scroll);
    }

    private void createBottomPanel() {
        fortuneBtn = new JButton("Read My Fortune!");
        quitBtn = new JButton("Quit");
    }
}
