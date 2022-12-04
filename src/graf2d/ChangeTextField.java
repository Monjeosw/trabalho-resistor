package graf2d;


public class ChangeTextField {
    private  int [] allIndex;
    
     ChangeTextField(int [] allIndex){
        this.allIndex = allIndex;
    }
    
    public String retornaResposta(){
        int num = ((allIndex[0]+1)*100)+(allIndex[1]*10)+allIndex[2];
        int porcentagem = (allIndex[4]==0)?5:10;
        
        if(allIndex[3] !=0){
            int mult = 1;
            while(mult <=allIndex[3]){
                num *=10;
                mult++;
            }
            
        }
       
        String resposta =  Integer.toString(num) + "+-" + Integer.toString(porcentagem) ;
        
        return resposta;
    }
}
