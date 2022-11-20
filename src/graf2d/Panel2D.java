
package graf2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Panel2D extends JPanel {
    Image figura;
    PanelInferior baixo;
    Graphics2D graphics2d;
    private Color color = Color.BLACK;
    
    private static Panel2D uniqueInstance = new Panel2D();
    
    private Panel2D(){
       
        this.setLayout(new BorderLayout());
        figura = new ImageIcon("resistor2.png").getImage();
        //baixo = new PanelInferior();
        //this.add(baixo,BorderLayout.CENTER);
        
       this.setPreferredSize(new Dimension(700,300));
       
    }
    
    public static Panel2D getInstance(){
        return uniqueInstance;
    }
    
    @Override
    public void paintComponent(Graphics g){
       graphics2d = (Graphics2D) g;
        
        graphics2d.drawImage(figura, 0, -200, null);
        graphics2d.setColor(getColor());
        graphics2d.fillRect(271, 118, 7, 61);
    }
    
    public Color getColor(){
        return color;
    }
    public void setColor (Color color){
        this.color = color;
       
        repaint(271,118,7,61);
        //repaint();
    }
    
  
}
