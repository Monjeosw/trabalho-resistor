
package graf2d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ListenerChangeImageHelp implements ActionListener {
    private int i;
    JPanel panel;
    JButton prox;
    
    JLabel imagem = new JLabel();
    ListenerChangeImageHelp(JLabel imagem,JButton prox,int i){
        
        this.prox = prox;
        this.imagem = imagem;
        this.panel = panel;
        this.i = i;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
      if(o ==this)
           i-- ;
      else if(o == this)
          i++ ;
      
                  
            ;

  
    }
   }

