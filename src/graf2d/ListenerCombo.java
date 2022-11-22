
package graf2d;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ListenerCombo implements ActionListener {
    private JLabel corCombo;
    private JComboBox combo;
    private Resistor panel = Resistor.getInstance();
    private final static int COR_VERDE [] = {0,128,0};
    private final static int COR_PRETO [] = {0,0,0};
    private final static int COR_VERMELHO [] = {250,0,0};
    private final static int COR_MARROM [] = {178,34,34};
    private final static int COR_LARANJA [] = {255,165,0};
    
    private int NUM_FAIXA;
    
    ListenerCombo(JLabel corCombo,JComboBox combo,int NUM_FAIXA){
        this.corCombo = corCombo;
        this.combo = combo;
        this.NUM_FAIXA = NUM_FAIXA;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        corCombo.setIcon(getCor((String)combo.getSelectedItem()));
        switch (NUM_FAIXA){
            case 1 -> {
                 panel.setColorFaixa1(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
            case 2 -> {
                panel.setColorFaixa2(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
            case 3 -> {
                panel.setColorFaixa3(changeColor(getChangeColor((String)combo.getSelectedItem())));
            }
        }
    }
    
    private Color changeColor(int cor[]){
        return new Color(cor[0],cor[1],cor[2]);
    }
    
    private int [] getChangeColor(String cor){
        int corConstante [] = null;
        switch (cor){
            case "PRETO" -> {
                corConstante = COR_PRETO;
            }
            case "MARROM"->{
                corConstante = COR_MARROM;
            }
            case "VERMELHO"->{
                corConstante = COR_VERMELHO;
            }
            case "LARANJA"->{
                corConstante = COR_LARANJA;
            }
            default -> {
                
            }
        }
        return corConstante;
   
    }
    
    private ImageIcon getCor(String cor){
        ImageIcon image = null;
        
        switch (cor){
            case "PRETO" -> {
                image = new ImageIcon("img/preto.png");
            }
            case "MARROM"->{
                image = new ImageIcon("img/marrom.png");
            }
            case "VERMELHO"->{
                image = new ImageIcon("img/vermelho.png");
            }
            case "LARANJA"->{
                image = new ImageIcon("img/laranja.jpg");
            }
            default -> {
                
            }
        }
            return image;
    }
   
  
}
