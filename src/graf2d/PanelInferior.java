
package graf2d;



import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelInferior extends JPanel  {
        JLabel imagem ;   
        JLabel imagem2 ;   
        ImageIcon cor;
        JComboBox combo;
        JComboBox combo2;
        Panel2D panel = Panel2D.getInstance();
    PanelInferior(){
        
        cor = new ImageIcon ("preto.png");
        imagem = new JLabel();
        imagem.setIcon(cor);
        this.setLayout(new GridBagLayout());
        //this.setPreferredSize(new Dimension(700,500));
        
        String [] color = {"preto","marrom","vermelho"};
        
               
        combo = new JComboBox(color);
        combo2= new JComboBox(color);
        
        combo.setVisible(true);
         combo2.setVisible(true);
        GridBagConstraints gb;
        
        //PRIMEIRA FAIXA.
        JLabel label = new JLabel("1 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 0;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(label,gb);
        
        
        //COR PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 4;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(imagem,gb);
        
       
        //COMBO PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 7;        
        gb.gridy = 0;
        gb.gridwidth =4 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagem.setIcon(getCor((String)combo.getSelectedItem()));
                panel.changeComponentColor(Color.BLACK);
            }
        });
        
        this.add(combo,gb);
     
        
        //COR SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 4;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(imagem,gb);
        
        //COMBO SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 7;        
        gb.gridy = 1;
        gb.gridwidth =4;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        //combo2.addActionListener(this);
        this.add(combo2,gb);
      
    }
    
   
    private ImageIcon getCor(String cor){
        ImageIcon image = null;
        
        switch (cor){
            case "preto" -> {
                image = new ImageIcon("preto.png");
            }
            case "marrom"->{
                image = new ImageIcon("marrom.png");
            }
            default -> {
                
            }
        }
            return image;
    }
        
   
     

   
    
}
