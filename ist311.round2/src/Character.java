
import java.awt.Image;
import java.awt.Toolkit;


public class Character {
    
    int xPos;
    int yPos;
    Image characterImg;
    
    public Character(){
        
            
    }
    
    public void setXpos(int x){
        xPos= x;
    }
    
    public void setYpos(int y){
        yPos= y;
    }
    
    public int getXpos(){
        return xPos;
    }
    
    public int getYpos(){
        return yPos;
    }
    
    public Image getImage(){
        return characterImg;
    }
    
    public void ChangeImage(String newImage, int height, int width){
        characterImg= Toolkit.getDefaultToolkit().getImage(newImage).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        
    }
    
}
