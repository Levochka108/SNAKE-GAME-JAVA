import javax.swing.*;

/**
 * @author Dmitrii Klochkov
 * Date:17.06.2023
 * Time:22:27
 */

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
