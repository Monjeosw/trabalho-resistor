
package graf2d;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FrameHelp  extends JFrame implements ActionListener{
    private int i =0;
    private JLabel imagem = new JLabel();
    JButton prox;
    JButton ant;
    FrameHelp(){
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JPanel panelBotoes = new JPanel(new FlowLayout());
        
        imagem.setIcon( new ImageIcon ("img/help1.png"));
        panel.add(imagem);
        panel.setPreferredSize(new Dimension(700,700));
        prox = new JButton("NEXT");
        ant = new JButton("BACK");
        prox.addActionListener(this);
        ant.addActionListener(this);
        
        panelBotoes.add(ant);
        panelBotoes.add(prox);
       
        
        this.add(panelBotoes,BorderLayout.SOUTH);
        this.add(panel,BorderLayout.CENTER);
       
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();
        //this.setSize(700, 800);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {         
        if(e.getSource() ==prox)
            i = (i+1>4)?4:++i;

        else 
            i = (i-1<0)?0:--i;
        
       if(i==0)
            imagem.setIcon( new ImageIcon ("img/help1.png"));
      
        if(i==1)
            imagem.setIcon( new ImageIcon ("img/help3.png"));
                    
        if(i==2)
            imagem.setIcon( new ImageIcon ("img/help4.png"));

                    
        if(i==3)
            imagem.setIcon( new ImageIcon ("img/help5.png"));
                    
        if(i==4)
            imagem.setIcon( new ImageIcon ("img/help6.png"));
    }
    
}
