
package graf2d;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FrameHelp extends JFrame {
    
    FrameHelp(){
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JLabel imagem = new JLabel();
        imagem.setIcon( new ImageIcon ("img/help3.png"));
        panel.add(imagem);
        JButton prox = new JButton("NEXT");
        
        
        this.add(panel,BorderLayout.CENTER);
        this.add(prox,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();
        //this.setSize(700, 800);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
