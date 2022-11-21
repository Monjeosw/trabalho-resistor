
package graf2d;
import java.awt.BorderLayout;
import javax.swing.JFrame;



public class Frame2D extends JFrame {
   
    Frame2D(){
        PanelInferior inferior = new PanelInferior();
        //this.setLayout(new BorderLayout());
             
        Panel2D panel = Panel2D.getInstance();
        this.add(panel,BorderLayout.NORTH);
        this.add(inferior,BorderLayout.SOUTH);
  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        //this.setSize(800,800);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
    


