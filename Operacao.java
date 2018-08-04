 public class Operacao {
    
    public Operacao(){
    }
     
    public void soma(){
    }
    
    public void subtracao(){
    }
    
    public double multiplicacao(double n1, double n2){
         return n1 * n2;
    }
    
    public double divisao(double n1, double n2){
         return n1 / n2;
    }
    
    public double calculaMedia(double n1, double n2){
         return soma(n1,n2)/2;
    }
    
    public void fatorial(int x){
        double x;
        double f = x; 
    
            while (x > 1){  
                f = f *(x-1);  
                x--;  
            }	 	  	  	 	 	 	  	 	 	  	 	
    } 

}
