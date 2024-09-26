import javax.swing.JFrame;
import java.awt.*;

public class FortuneTellerViewer {

    public static void main(String[] args){
        JFrame frame = new JFrame("Fortune Teller");

        //Centering and sizing the fram
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int width = screenSize.width * (3/4);
        int height = screenSize.height * (3/4);
        frame.setSize(width, height);

        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        frame.setLocation(x, y);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}