
package graf2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Resistor extends JPanel  {
    Image figura;
    Graphics2D faixa1;
    Graphics2D faixa2;
    Graphics2D faixa3;
    Graphics2D faixa4;
    Graphics2D faixa5;
    private Color colorFaixa1 = new Color(178,34,34);
    private Color colorFaixa2 = new Color(0,0,0);
    private Color colorFaixa3 = new Color(0,0,0);
    private Color colorFaixa4 = new Color(0,0,0);
    private Color colorFaixa5 = new Color(218,165,32);
    private static Resistor uniqueInstance = new Resistor();
    
    private Resistor(){
       
        this.setLayout(new BorderLayout());
        figura = new ImageIcon("img/resistor2.png").getImage(); 
        this.setPreferredSize(new Dimension(700,100));
        this.setBackground(Color.YELLOW);
    }
    
    public static Resistor getInstance(){
        return uniqueInstance;
    }
    
    @Override
    public void paintComponent(Graphics g){
        faixa1 = (Graphics2D) g;
        faixa1.drawImage(figura, 0, -300, null);
        faixa1.setColor(getColorFaixa1());
        faixa1.fillRect(271, 19, 7, 62);
        
        faixa2 =(Graphics2D) g;
        faixa2.setColor(getColorFaixa2());
        faixa2.fillRect(313, 24, 8, 52);
        
        faixa3 =(Graphics2D) g;
        faixa3.setColor(getColorFaixa3());
        faixa3.fillRect(338, 24, 8, 52);
        
        faixa4 =(Graphics2D) g;
        faixa4.setColor(getColorFaixa4());
        faixa4.fillRect(365, 24, 8, 52);
       
        faixa5 =(Graphics2D) g;
        faixa5.setColor(getColorFaixa5());
        faixa5.fillRect(439, 19, 8, 62);
        
    }
    
    public Color getColorFaixa1(){
        return colorFaixa1;
    }
    
     public Color getColorFaixa2(){
        return colorFaixa2;
    }
    
    public Color getColorFaixa3(){
        return colorFaixa3;
    }
    
     public Color getColorFaixa4(){
        return colorFaixa4;
    }
    
      public Color getColorFaixa5(){
        return colorFaixa5;
    }

    public void setColorFaixa1 (Color color){
        this.colorFaixa1 = color;
        repaint(271,19,7,62);
        //repaint();
    }
    
    
    public void setColorFaixa2 (Color colorFaixa2){
        this.colorFaixa2 = colorFaixa2;
        repaint(313,24,8,52);
       
    }
    
    public void setColorFaixa3 (Color colorFaixa3){
        this.colorFaixa3 = colorFaixa3;
        repaint(338,24,8,52);
    }
    
    public void setColorFaixa4 (Color colorFaixa4){
        this.colorFaixa4 = colorFaixa4;
        repaint(365,24,8,52);
    }
    
    public void setColorFaixa5 (Color colorFaixa5){
        this.colorFaixa5 = colorFaixa5;
        repaint(439,19,8,52);
    }
    
  
}
