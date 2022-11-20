
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
    
   
    Panel2D(){
        this.setLayout(new BorderLayout());
        figura = new ImageIcon("resistor2.png").getImage();
        baixo = new PanelInferior();
        this.add(baixo,BorderLayout.CENTER);
        
       this.setPreferredSize(new Dimension(700,800));
        
        
        
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D gD = (Graphics2D) g;
        
        gD.drawImage(figura, 0, -200, null);
        
        
          
            gD.setPaint(Color.pink);
        
        gD.fillRect(271, 118, 7, 61);
    }
    
    /*public JPanel opcao(){
        
    }*/
   
}
