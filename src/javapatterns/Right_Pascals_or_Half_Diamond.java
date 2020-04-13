
package javapatterns;

public class Right_Pascals_or_Half_Diamond {
    
    public static void main(String[] args) 
    
    {
        for (int i = 1; i <= 5; i++) //For rows
    { 
        
    for (int k = 1; k <= i; k++) //for columns
    
    {
        System.out.print("*"); 
    }
    
    System.out.println(); 
    
    }
    
       //For printing other hlaf  
        
        
     for (int i = 1; i <= 5; i++) //For rows
    { 
        
    for (int k = 5; k >= i; k--) //for columns
    
    {
        System.out.print("*"); 
    }
    
    System.out.println(); 
    
    }
        
        
        
        
    }
    
}
