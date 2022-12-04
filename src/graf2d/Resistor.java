
package graf2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Resistor extends JPanel  {
    Image figura;
    Graphics2D faixa1;
    Graphics2D faixa2;
    Graphics2D faixa3;
    Graphics2D faixa4;
    Graphics2D faixa5;
    Graphics2D faixa;
    private Color colorFaixa1 = new Color(178,34,34);
    private Color colorFaixa2 = new Color(0,0,0);
    private Color colorFaixa3 = new Color(0,0,0);
    private Color colorFaixa4 = new Color(0,0,0);
    private Color colorFaixa5 = new Color(218,165,32);
    private static Resistor uniqueInstance = new Resistor();
    
    private Resistor(){
       
        this.setLayout(new BorderLayout());
        figura = new ImageIcon("img/resistorTeste3.png").getImage(); 
        this.setPreferredSize(new Dimension(700,100));
        this.setBackground(Color.YELLOW);
    }
    
    public static Resistor getInstance(){
        return uniqueInstance;
    }
    
    @Override
    public void paintComponent(Graphics g){
        faixa = (Graphics2D) g;
        faixa.drawImage(figura, -40, -394, null);
        
        
        faixa1 = (Graphics2D) g;
        faixa1.setColor(getColorFaixa1());
        faixa1.fillRect(265, 11, 8, 79);
        
        faixa2 =(Graphics2D) g;
        faixa2.setColor(getColorFaixa2());
        faixa2.fillRect(311, 18, 9, 66);
        
        faixa3 =(Graphics2D) g;
        faixa3.setColor(getColorFaixa3());
        faixa3.fillRect(340, 18, 9, 66);
        
        faixa4 =(Graphics2D) g;
        faixa4.setColor(getColorFaixa4());
        faixa4.fillRect(370, 18, 9, 66);
       
        faixa5 =(Graphics2D) g;
        faixa5.setColor(getColorFaixa5());
        faixa5.fillRect(454, 11,9, 79);
        
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

    public void setColorFaixa1 (Color getColorFaixa1){
        this.colorFaixa1 = getColorFaixa1;
        repaint(265, 11, 8, 79);
        
    }
    
    
    public void setColorFaixa2 (Color colorFaixa2){
        this.colorFaixa2 = colorFaixa2;
        repaint(311, 18, 9, 66);
        
       
    }
    
    public void setColorFaixa3 (Color colorFaixa3){
        this.colorFaixa3 = colorFaixa3;
        repaint(340, 18, 9, 66);
    }
    
    public void setColorFaixa4 (Color colorFaixa4){
        this.colorFaixa4 = colorFaixa4;
        repaint(370, 18, 9, 66);
    }
    
    public void setColorFaixa5 (Color colorFaixa5){
        this.colorFaixa5 = colorFaixa5;
        repaint(454, 11,9, 79);
    }
    
  
}
