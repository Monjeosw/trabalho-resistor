
package graf2d;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;


public class PanelFaixas extends JPanel{
    
    public PanelFaixas(String numFiaxa) {
       super();
       JLabel faixa = new JLabel(numFiaxa);
       faixa.setForeground(new Color(230,230,250));
       faixa.setFont(new Font("Arial",Font.ITALIC,30));
       
       this.add(faixa);
       this.setBackground(new Color(150,133,143));
       //75,0,130
       this.setBorder(new BevelBorder(BevelBorder.RAISED,Color.white,Color.black));
    }
    
}
