
package graf2d;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;


public class PanelInferior extends JPanel implements ActionListener   {
        private JLabel imagem ;   
        private JLabel imagem2 ;   
        private JLabel imagem3 ; 
        private JLabel imagem4 ; 
        private JLabel imagem5 ; 
        private JButton botao;
        private JTextField resultadoResistencia = new JTextField("00000");
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
        this.setBackground(new Color(109,121,147));
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
       //JTextField.
        resultadoResistencia.setPreferredSize(new Dimension(300,40));
        resultadoResistencia.setFont(new Font("Consolas",Font.PLAIN,35));
        gb = new GridBagConstraints();
        gb.gridx = 1;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        this.add(resultadoResistencia,gb);
        
        //Botao.
        botao = new JButton("Resultado");
        botao.setFont(new Font("Consolas",Font.PLAIN,30));
        botao.setBackground(new Color(190,236,227));
        botao.setBorder(new BevelBorder(BevelBorder.RAISED,Color.white,Color.black));
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 0;
        gb.gridwidth =2 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        botao.addActionListener(this);
        this.add(botao,gb);
        
        //PRIMEIRA FAIXA label.
        PanelFaixas faixa1 = new PanelFaixas("1 FAIXA :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa1,gb);
        
        //SEGUNDA FAIXA LABEL.
        PanelFaixas faixa2 = new PanelFaixas("2 FAIXA :");;
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 3;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa2,gb);
        
        //TERCEIRA FAIXA LABEL.
        PanelFaixas faixa3 = new PanelFaixas("3 FAIXA :");;
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 5;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa3,gb);
        
        //QUARTA FAIXA LABEL.
        PanelFaixas faixa4 = new PanelFaixas("4 FAIXA :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 6;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa4,gb);
        
        //QUINTA FAIXA LABEL.
        PanelFaixas faixa5 = new PanelFaixas("5 FAIXA :");
        gb = new GridBagConstraints();
        gb.gridx = 0;        
        gb.gridy = 7;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.ipadx = 25;
        this.add(faixa5,gb);
        
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
        new SetCombo(comboFaixa1);
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 1;
        gb.gridwidth =1 ;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa1,gb);
        

        //COMBO SEGUNDA FAIXA.
        new SetCombo(comboFaixa2);
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 3;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa2,gb);
        
        //COMBO TERCEIRA FAIXA.
        new SetCombo(comboFaixa3);;
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 5;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa3,gb);
        
        //COMBO QUARTA FAIXA.
        new SetCombo(comboFaixa4);
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 6;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa4,gb);
        
        //COMBO QUINTA FAIXA.
        new SetCombo(comboFaixa5);
        gb = new GridBagConstraints();
        gb.gridx = 3;        
        gb.gridy = 7;
        gb.gridwidth =1;
        gb.gridheight = 1;
        gb.insets = new Insets(0,30,0,0);
        this.add(comboFaixa5,gb);
        
        

        
        comboFaixa1.addActionListener(new ListenerCombo(imagem, comboFaixa1,NUM_FAIXA1));
        comboFaixa2.addActionListener(new ListenerCombo(imagem2, comboFaixa2,NUM_FAIXA2));
        comboFaixa3.addActionListener(new ListenerCombo(imagem3, comboFaixa3,NUM_FAIXA3));
        comboFaixa4.addActionListener(new ListenerCombo(imagem4, comboFaixa4,NUM_FAIXA4));
        comboFaixa5.addActionListener(new ListenerCombo(imagem5, comboFaixa5,NUM_FAIXA5));
        comboFaixa1.addActionListener(this);
        comboFaixa2.addActionListener(this);
        comboFaixa3.addActionListener(this);
        comboFaixa4.addActionListener(this);
        comboFaixa5.addActionListener(this);
      
    }
    
    
     
    private int [] getAllIndex(){
        int [] allIndex = new int [] {(comboFaixa1.getSelectedIndex()),comboFaixa2.getSelectedIndex(),comboFaixa3.getSelectedIndex(),
                                      comboFaixa4.getSelectedIndex() ,comboFaixa5.getSelectedIndex()} ;
        
        return allIndex;
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboFaixa1){
            resultadoResistencia.setText(new ChangeTextField(getAllIndex()).retornaResposta());
            
        }
        if(e.getSource() == comboFaixa2){
           resultadoResistencia.setText(new ChangeTextField(getAllIndex()).retornaResposta());
            
        }
         if(e.getSource() == comboFaixa3){
           resultadoResistencia.setText(new ChangeTextField(getAllIndex()).retornaResposta());
            
        }
          if(e.getSource() == comboFaixa4){
           resultadoResistencia.setText(new ChangeTextField(getAllIndex()).retornaResposta());
            
        }
        if(e.getSource() == comboFaixa5){
           resultadoResistencia.setText(new ChangeTextField(getAllIndex()).retornaResposta());
            
        }
        
        if(e.getSource() == botao){
            int [] a;
            a = new RecebeValorDigitado(resultadoResistencia.getText()).getIndexDigitado();
            
            if(a[3] == -1 || a[0] == -1 ){
                resultadoResistencia.setText("Erro");
            }
            
            else{
            
            comboFaixa1.setSelectedIndex(a[0]);
            comboFaixa2.setSelectedIndex(a[1]);
            comboFaixa3.setSelectedIndex(a[2]);
            comboFaixa4.setSelectedIndex(a[3]);
            comboFaixa5.setSelectedIndex(a[4]);
            }
        }
        

   }
}
   
    
    
  
