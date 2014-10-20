import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    Character Player;
    Image Background;
    Enemy car;
    
    public GamePanel(){
        Player = new Character();
        car = new Enemy();
        Player.ChangeImage("images/Foghorn_Leghorn.png", 100, 100);
        Background = Toolkit.getDefaultToolkit().getImage("images/frogger.jpeg").getScaledInstance(720, 640, Image.SCALE_DEFAULT);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon(Background));
        add(background);
        background.setLayout(new FlowLayout());
        JLabel playerPiece = new JLabel(new ImageIcon(Player.characterImg));
        JLabel enemyPiece = new JLabel(new ImageIcon(car.characterImg));
        
        
        
        
        background.add(playerPiece);
        background.add(enemyPiece);
    }
    

   
  

}