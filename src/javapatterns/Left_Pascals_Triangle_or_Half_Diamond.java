
package javapatterns;

public class Left_Pascals_Triangle_or_Half_Diamond {
 
    public static void main(String[] args) {
        
       
        
        
        for(int i=1;i<=5;i++){
            
            for (int j = 4; j >=i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++)
            {
                System.out.print("*");   
            }
            System.out.println("");
        }
        
        
        //Forother half
        
        for(int i=1;i<=5;i++){
            
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 4; k >=i; k--)
            {
                System.out.print("*");   
            }
            System.out.println("");
        }
        
    }
    
    
    
    
    
}
