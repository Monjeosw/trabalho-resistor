
package graf2d;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PanelInferior extends JPanel implements ActionListener  {
        private JLabel imagem ;   
        private JLabel imagem2 ;   
        private JLabel imagem3 ; 
        private JLabel imagem4 ; 
        private JLabel imagem5 ; 
        private JButton butao;
        private JTextField resultadoResistencia = new JTextField();
        private JComboBox comboFaixa1;
        private JComboBox comboFaixa2;
        private JComboBox comboFaixa3;
        private JComboBox comboFaixa4;
        private JComboBox comboFaixa5; 
        private Resistor panel = Resistor.getInstance();
        private final static int NUM_FAIXA1 = 1;
        private final static int NUM_FAIXA2 = 2;
        private final static int NUM_FAIXA3 = 3;
        private final static int NUM_FAIXA4 = 4;
        private final static int NUM_FAIXA5 = 5;
        
    
    PanelInferior(){
       
        imagem = new JLabel();
        imagem.setIcon( new ImageIcon ("img/marromProjeto.png"));
        imagem2 = new JLabel();
        imagem2.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        imagem3 = new JLabel();
        imagem3.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        imagem4 = new JLabel();
        imagem4.setIcon( new ImageIcon ("img/pretoProjeto.png"));
        imagem5 = new JLabel();
        imagem5.setIcon( new ImageIcon ("img/douradoProjeto.png"));
        
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(700,700));
        
        String [] fullColors = {"PRETO","MARROM","VERMELHO","LARANJA","AMARELO",
                                "VERDE","AZUL","VIOLETA","CINZA","BRANCO"};
        
        String [] colorFiaxa1 = {"MARROM","VERMELHO","LARANJA","AMARELO",
                                "VERDE","AZUL","VIOLETA","CINZA","BRANCO"};
        
        String [] colorFaixa5 = {"DOURADO","PRATA"};
        
        comboFaixa1 = new JComboBox(colorFiaxa1); // primeira faixa não pode ser preto.
        comboFaixa2= new JComboBox(fullColors);
        comboFaixa3= new JComboBox(fullColors);
        comboFaixa4= new JComboBox(fullColors);
        comboFaixa5= new JComboBox(colorFaixa5);
        
        
        GridBagConstraints gb;
        
        
       
        resultadoResistencia.setPreferredSize(new Dimension(250,40));
        resultadoResistencia.setFont(new Font("Consolas",Font.PLAIN,35));
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        //gb.ipadx = 25;
        this.add(resultadoResistencia,gb);
        
        butao = new JButton("Resultado");
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        butao.addActionListener(this);
        this.add(butao,gb);
        
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
        
        //QUINTA FAIXA.
        JLabel labalFaixa5 = new JLabel("5 faixa:");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 7;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(labalFaixa5,gb);
        
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
        
        //IMAGEM QUARTA FAIXA
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 7;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.ipady = 25;
        this.add(imagem5,gb);
       
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
        
        //COMBO QUINTA FAIXA.
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 7;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa5,gb);
        
        

        
        comboFaixa1.addActionListener(new ListenerCombo(imagem, comboFaixa1,NUM_FAIXA1,getAllIndex()));
        comboFaixa2.addActionListener(new ListenerCombo(imagem2, comboFaixa2,NUM_FAIXA2,getAllIndex()));
        comboFaixa3.addActionListener(new ListenerCombo(imagem3, comboFaixa3,NUM_FAIXA3,getAllIndex()));
        comboFaixa4.addActionListener(new ListenerCombo(imagem4, comboFaixa4,NUM_FAIXA4,getAllIndex()));
        comboFaixa5.addActionListener(new ListenerCombo(imagem5, comboFaixa5,NUM_FAIXA4,getAllIndex()));
        comboFaixa1.addActionListener(this);
        comboFaixa2.addActionListener(this);
      
    }
    
    
     
    private int [] getAllIndex(){
        int [] allIndex = new int [] {(comboFaixa1.getSelectedIndex()+1),comboFaixa2.getSelectedIndex(),comboFaixa3.getSelectedIndex(),
                                      comboFaixa4.getSelectedIndex() ,comboFaixa5.getSelectedIndex()} ;
        
        return allIndex;
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboFaixa1){
            String resposta =  Integer.toString(getAllIndex()[0]) + Integer.toString(getAllIndex()[1])  ;
            resultadoResistencia.setText(resposta);
            
        }
         if(e.getSource() == comboFaixa2){
            String resposta =  Integer.toString(getAllIndex()[0]) + Integer.toString(getAllIndex()[1])  ;
            resultadoResistencia.setText(resposta);
            
        }
        /*String resposta =  Integer.toString(getAllIndex()[0]) + Integer.toString(getAllIndex()[1])  ;
        resultadoResistencia.setText(resposta);*/
    //}
   }
    
   
    
}
    
  
