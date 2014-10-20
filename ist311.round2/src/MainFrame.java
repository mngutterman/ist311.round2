
import javax.swing.JFrame;


public class MainFrame extends JFrame {
    GamePanel panel = new GamePanel();
     
  public MainFrame(){
      add(panel);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(720, 640);
      setVisible(true);
 
      
  }
  
   
    
  }