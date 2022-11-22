
package graf2d;



import java.awt.Color;
import java.awt.Dimension;
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
        private JLabel imagem ;   
        private JLabel imagem2 ;   
        private final ImageIcon cor;
        private JComboBox combo;
        private JComboBox combo2;
        private Resistor panel = Resistor.getInstance();
        private final static int COR_VERDE [] = {0,128,0};
        private final static int COR_PRETO [] = {0,0,0};
        private final static int COR_VERMELHO [] = {250,0,0};
        private final static int COR_MARROM [] = {178,34,34};
        private final static int NUM_FAIXA1 = 1;
        private final static int NUM_FAIXA2 = 2;
        
        
    PanelInferior(){
        
        cor = new ImageIcon ("img/marrom.png");
        imagem = new JLabel();
        imagem.setIcon(cor);
        imagem2 = new JLabel();
        imagem2.setIcon(cor);
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(700,400));
        
        String [] color = {"preto","marrom","vermelho"};
        String [] colorFiaxa1 = {"marrom","vermelho"};
        combo = new JComboBox(colorFiaxa1); // primeira faixa não pode ser preto.
        combo2= new JComboBox(color);
        
        combo.setVisible(true);
         combo2.setVisible(true);
        GridBagConstraints gb;
        
        JLabel resultadoResistencia = new JLabel("RESULTADO:");
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        //gb.ipadx = 25;
        this.add(resultadoResistencia,gb);
        
        //PRIMEIRA FAIXA.
        JLabel label = new JLabel("1 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(label,gb);
        
        
        //COR PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 1;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(imagem,gb);
        
       
        //COMBO PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(combo,gb);
        
        //SEGUNDA FAIXA.
        JLabel labalFaixa2 = new JLabel("2 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 3;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(labalFaixa2,gb);
      
        //COMBO SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 3;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(combo2,gb);
        
        //IMAGEM SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 3;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.ipady = 25;
        this.add(imagem2,gb);
        
        
        
        combo.addActionListener(new ListenerCombo(imagem, combo,NUM_FAIXA1));
        combo2.addActionListener(new ListenerCombo(imagem2, combo2,NUM_FAIXA2));
      
    }
}
    
  
