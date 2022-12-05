
package graf2d;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Frame2D extends JFrame {
   
    Frame2D(){
        this.setLayout(new BorderLayout());
        
        PanelInferior inferior = new PanelInferior();
        Resistor panel = Resistor.getInstance();
        
        JButton help = new JButton("help");
        help.addActionListener(new ListenerHelp());
        
        
        this.add(help,BorderLayout.SOUTH);
        this.add(panel,BorderLayout.NORTH);
        this.add(inferior,BorderLayout.CENTER);
        
  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
    


