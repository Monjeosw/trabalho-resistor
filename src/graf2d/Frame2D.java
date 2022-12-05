
package graf2d;
import java.awt.BorderLayout;
import javax.swing.JFrame;



public class Frame2D extends JFrame {
   
    Frame2D(){
        this.setLayout(new BorderLayout());
        
        PanelInferior inferior = new PanelInferior();
        Resistor panel = Resistor.getInstance();
        
        this.add(panel,BorderLayout.NORTH);
        this.add(inferior,BorderLayout.SOUTH);
  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        //this.setSize(800,800);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
    


