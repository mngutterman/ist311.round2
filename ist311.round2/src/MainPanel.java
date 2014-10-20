import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    Character test = new Character();
    Image myImage;
    public MainPanel(){
        myImage = test.characterImg;
        setSize(100,100);
    }
    
    public void paintComponent(Graphics g) 
	{
    	super.paintComponent(g); 
    	
    	g.drawImage(myImage, 0, 0, this);    	
        //g.fillRect(100,20,70,80);
        g.setColor(Color.yellow);
        //g.drawString("text on a Panel", 100,150);

    }

  
}