
package graf2d;

public class RecebeValorDigitado {
    private String valor;
    
    public RecebeValorDigitado(String valor) {
        this.valor = valor;
    }
    
    public int[] getIndexDigitado(){
        int [] indexDigitado = {-1,-1,-1,-1,-1};
        int i = 4;
        
        indexDigitado[0] = Character.getNumericValue(valor.charAt(0))-1 ;
        indexDigitado[1] = Character.getNumericValue(valor.charAt(1));
        indexDigitado[2] = Character.getNumericValue(valor.charAt(2));
        
        
        if(valor.charAt(3) !='0' ){
            indexDigitado[3] = 0;

        }
           
        else {
            indexDigitado[3] = 1;
            
            while(valor.charAt(i) == '0'){
                indexDigitado[3] += 1;
                i++;
            }
        }
        if(valor.charAt(i) =='5')
            indexDigitado[4] = 0;
        else 
           indexDigitado[4] = 1; 
        
        

       return indexDigitado;
    }
}
