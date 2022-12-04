package graf2d;


public class ChangeTextField {
    private  int [] allIndex;
    
     ChangeTextField(int [] allIndex){
        this.allIndex = allIndex;
    }
    
    public String retornaResposta(){
        int num = ((allIndex[0]+1)*100)+(allIndex[1]*10)+allIndex[2];
        int porcentagem = (allIndex[4]==0)?5:10;
        int mult = 1;
        String multilplicao = null;
        String resposta = null;
        
        if(allIndex[3] !=0){
            while(mult <=allIndex[3]){
                mult++;
            }
            
            if(mult>7){
                if(mult==8){
                 multilplicao = "M";
                 num*=10;
                }
                else if(mult==9){
                 multilplicao = "M";
                 num*=Math.pow(10, 2);
                }
                else if(mult==10) {
                 multilplicao = "M";
                 num*=Math.pow(10, 3);
                }
                else if (mult>10){
                    num = 0;
                }
                resposta =  Integer.toString(num)+ multilplicao + "+-" + Integer.toString(porcentagem)+ '%' ;
                
            }
            else{
               num *= Math.pow(10, mult-1);
               resposta =  Integer.toString(num) + "+-" + Integer.toString(porcentagem)+ '%';
            }
            
        }else
            resposta =  Integer.toString(num) + "+-" + Integer.toString(porcentagem)+ '%';
            
       
 
        return resposta;
    }
}
