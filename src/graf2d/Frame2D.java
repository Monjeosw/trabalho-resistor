
package graf2d;
import java.awt.BorderLayout;
import javax.swing.JFrame;



public class Frame2D extends JFrame {
   
    Frame2D(){
        //PanelInferior inferior = new PanelInferior();
        //this.setLayout(new BorderLayout());
             
        Panel2D panel = new Panel2D();
        this.add(panel);
        //this.add(inferior,BorderLayout.CENTER);
       
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        //this.setSize(800,800);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }
}
    


