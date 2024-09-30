import javax.swing.*;
import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

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

    Random rnd = new Random();
    int prevFortune = -1;

    ArrayList<String> fortunes = new ArrayList<>();

    public FortuneTellerFrame() {

        createCenterFrame();

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTopPanel() {
        topPnl = new JPanel();

        icon = new ImageIcon("src/fortuneteller.jpg");
        Image ftImage = icon.getImage();
        Image ftIconImage = ftImage.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        icon.setImage(ftIconImage);

        titlelbl = new JLabel("Fortune Teller", icon, JLabel.CENTER);

        //Code to center text to the icon
        titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
        titlelbl.setVerticalAlignment(JLabel.BOTTOM);

        //Setting font
        titlelbl.setFont(new Font("Arial", Font.BOLD, 48));

        topPnl.add(titlelbl);
        mainPnl.add(topPnl, BorderLayout.NORTH);
    }

    private void createMiddlePanel() {
        middlePnl = new JPanel();
        displayTA = new JTextArea(10, 100);
        displayTA.setEditable(false);
        displayTA.setLineWrap(true);
        displayTA.setWrapStyleWord(true);
        displayTA.setFont(new Font("Sans-Serif", Font.ITALIC, 12));

        scroll = new JScrollPane(displayTA);
        middlePnl.add(scroll);
        mainPnl.add(middlePnl, BorderLayout.CENTER);
    }

    private void createBottomPanel() {
        bottomPnl = new JPanel();
        bottomPnl.setLayout(new GridLayout(1, 2));

        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.setFont(new Font("Time New Roman", Font.PLAIN, 18));
        fortuneBtn.addActionListener(e -> {
            String fortune = getFortune();
            displayTA.setText(fortune);
        });

        quitBtn = new JButton("Quit");
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        bottomPnl.add(fortuneBtn);
        bottomPnl.add(quitBtn);

        mainPnl.add(bottomPnl, BorderLayout.SOUTH);
    }

    private void createCenterFrame(){
        //screen dimensions
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        //center frame
        setSize(screenWidth * 3 / 4, screenHeight * 3 / 4);
        setLocation(screenWidth / 8, screenHeight / 8);
    }

    private String getFortune() {
        ArrayList<String> fortunes = new ArrayList<>();

        int fortune;

        fortunes.add("Whatever your wish is... it's a no from me dog!");
        fortunes.add("When you wish upon a shooting star... just pray that you don't fart");
        fortunes.add("You're gonna have a bright day... just hope it doesn't rain");
        fortunes.add("Something's behind you, RUN!");
        fortunes.add("If you eat something and nobody is around to see it... it has no calories");
        fortunes.add("Ignore the previous fortune!");
        fortunes.add("Life sucks... and then you die!");
        fortunes.add("Be faster than the other person the bear is chasing!");
        fortunes.add("Congrats, you can read!");
        fortunes.add("There is money in your future... but it isn't yours!");
        fortunes.add("Never gonna give you up, never gonna let you down, never gonna run around and hurt you!");
        fortunes.add("When life gives you lemons, hit someone with those lemons... you'll feel better!");




    }
}
