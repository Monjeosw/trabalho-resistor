
package graf2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Resistor extends JPanel {
    Image figura;
    Graphics2D faixa1;
    Graphics2D faixa2;
    private Color colorFaixa1 = Color.BLACK;
    private Color colorFaixa2 = Color.BLACK;
    
    private static Resistor uniqueInstance = new Resistor();
    
    private Resistor(){
       
        this.setLayout(new BorderLayout());
        figura = new ImageIcon("resistor2.png").getImage();
        //baixo = new PanelInferior();
        //this.add(baixo,BorderLayout.CENTER);
        
       this.setPreferredSize(new Dimension(700,200));
       
    }
    
    public static Resistor getInstance(){
        return uniqueInstance;
    }
    
    @Override
    public void paintComponent(Graphics g){
        faixa1 = (Graphics2D) g;
        faixa1.drawImage(figura, 0, -200, null);
        faixa1.setColor(getColorFaixa1());
        faixa1.fillRect(271, 118, 7, 61);
        
        
        faixa2 =(Graphics2D) g;
        faixa2.setColor(getColorFaixa2());
        faixa2.fillRect(313, 124, 7, 52);
    }
    
    public Color getColorFaixa1(){
        return colorFaixa1;
    }
    
    public void setColorFaixa1 (Color color){
        this.colorFaixa1 = color;
        repaint(271,118,7,61);
        //repaint();
    }
    
     public Color getColorFaixa2(){
        return colorFaixa2;
    }
    public void setColorFaixa2 (Color colorFaixa2){
        this.colorFaixa2 = colorFaixa2;
        repaint(350,118,7,61);
       
    }
    
  
}
