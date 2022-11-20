
package graf2d;



import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelInferior extends JPanel implements ActionListener {
        JLabel imagem ;   
        JLabel imagem2 ;   
        ImageIcon cor;
        JComboBox combo;
        JComboBox combo2;
    
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
        combo.addActionListener(this);
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
        combo2.addActionListener(this);
        this.add(combo2,gb);
      
    }
    
    
    
    /*public void actionPerformed(ActionEvent e, int a){
        if(e.getSource()==combo){
            System.out.println(combo.getSelectedItem());
            switch (combo.getSelectedIndex()){
                case 0 :{
                   cor = new ImageIcon ("preto.png"); 
                   imagem.setIcon(cor);
                }
                case 1:{
                    cor = new ImageIcon ("marrom.png");
                    imagem.setIcon(cor);
                }
            }
        }
        else if (e.getSource()==combo2){
             //System.out.println("2"+combo2.getSelectedItem());
             int x = combo2.getSelectedIndex(); //Usar o index para utlizar os valores.
             System.out.println(x);
        }
    }*/
    
    public int opcao(){
        return combo.getSelectedIndex();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     

   
    
}
