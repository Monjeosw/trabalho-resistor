
package graf2d;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelInferior extends JPanel  {
        private JLabel imagem ;   
        private JLabel imagem2 ;   
        private JLabel imagem3 ; 
        private JLabel imagem4 ; 
        private JComboBox comboFaixa1;
        private JComboBox comboFaixa2;
        private JComboBox comboFaixa3;
        private JComboBox comboFaixa4;
        private Resistor panel = Resistor.getInstance();
        private final static int NUM_FAIXA1 = 1;
        private final static int NUM_FAIXA2 = 2;
        private final static int NUM_FAIXA3 = 3;
        
    PanelInferior(){
       
        imagem = new JLabel();
        imagem.setIcon( new ImageIcon ("img/marromProjeto.png"));
        imagem2 = new JLabel();
        imagem2.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        imagem3 = new JLabel();
        imagem3.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        imagem4 = new JLabel();
        imagem4.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(700,700));
        
        String [] fullColors = {"PRETO","MARROM","VERMELHO","LARANJA","AMARELO",
                                "VERDE","AZUL","VIOLETA","CINZA","BRANCO"};
        
        String [] colorFiaxa1 = {"MARROM","VERMELHO","LARANJA","AMARELO",
                                "VERDE","AZUL","VIOLETA","CINZA","BRANCO"};
        
        comboFaixa1 = new JComboBox(colorFiaxa1); // primeira faixa não pode ser preto.
        comboFaixa2= new JComboBox(fullColors);
        comboFaixa3= new JComboBox(fullColors);
        comboFaixa4= new JComboBox(fullColors);
        
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
        JPanel panelLabel = new JPanel();
        JLabel label = new JLabel("1 faixa:");
        label.setFont(new Font("Arial",Font.ITALIC,30)); // mudançca de tamanho e de fonte.
        panelLabel.add(label);
        panelLabel.setBackground(Color.yellow);
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(panelLabel,gb);
        
        //SEGUNDA FAIXA.
        JLabel labalFaixa2 = new JLabel("2 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 3;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(labalFaixa2,gb);
        
        //TERCEIRA FAIXA.
        JLabel labalFaixa3 = new JLabel("3 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 5;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(labalFaixa3,gb);
        
        //QUARTA FAIXA.
        JLabel labalFaixa4 = new JLabel("4 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 6;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(labalFaixa4,gb);
        
        //IMAGEM PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 1;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(imagem,gb);
        
        //IMAGEM SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 3;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.ipady = 25;
        this.add(imagem2,gb);
        
        //IMAGEM TERCEIRA FAIXA
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 5;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.ipady = 25;
        this.add(imagem3,gb);
        
        
        //IMAGEM QUARTA FAIXA
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 6;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.ipady = 25;
        this.add(imagem4,gb);
       
        //COMBO PRIMEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa1,gb);
        
        
      
        //COMBO SEGUNDA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 3;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa2,gb);
        
      
        
        //COMBO TERCEIRA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 5;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa3,gb);
        
        //COMBO QUARTA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 6;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa4,gb);
        
        
        
        
        
        
        
        
        
        
        
        comboFaixa1.addActionListener(new ListenerCombo(imagem, comboFaixa1,NUM_FAIXA1));
        comboFaixa2.addActionListener(new ListenerCombo(imagem2, comboFaixa2,NUM_FAIXA2));
        comboFaixa3.addActionListener(new ListenerCombo(imagem3, comboFaixa3,NUM_FAIXA3));
      
    }
}
    
  
