
package graf2d;

public class RecebeValorDigitado {
    private String valor;
    
    public RecebeValorDigitado(String valor) {
        this.valor = valor;
    }
    
    private boolean verificaNumeros(){
        boolean resposta = true;
        
        for (int i=0; i<valor.length()-1; i++) 
            if(!Character.isDigit( valor.charAt(i)))
                resposta =false;

        return resposta;
    }
    
    public int[] getIndexDigitado(){
        int [] indexDigitado = {-1,-1,-1,-1,-1};
        int i = 3;
        
        if(verificaNumeros());
            indexDigitado[0] = Character.getNumericValue(valor.charAt(0))-1 ;
            indexDigitado[1] = Character.getNumericValue(valor.charAt(1));
            indexDigitado[2] = Character.getNumericValue(valor.charAt(2));
        
            if(valor.charAt(3) != '0' ){
                 indexDigitado[3] = 0;
            }
            else {
                indexDigitado[3] = 1;
                i++;
                while(valor.charAt(i) == '0' && indexDigitado[0]!=-1 && i<valor.length()-1){
                    indexDigitado[3] += 1;
                    i++;
                }
                if(indexDigitado[3]>9)
                    indexDigitado[3] = -1;
            
            }
        
            if(valor.charAt(i) =='5' && i==valor.length()- 1)
                indexDigitado[4] = 0;
            
            else if(valor.charAt(i) =='1' && valor.charAt(i+1) =='0')
                indexDigitado[4] = 1; 
            
            else {
                 indexDigitado[0] =-1;
            } 
        
            
       return indexDigitado;
    }
}
