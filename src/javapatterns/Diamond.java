
package javapatterns;

public class Diamond {
    
    public static void main(String[] args) {
        
    for (int i = 1; i <= 3; i++) //For rows
    { 
        
    for (int j = 1; j <= 3 - i; j++) //For Spaces
        
    { 
        System.out.print(" "); 
    }
    
    for (int k = 1; k <= i; k++) //for columns
    
    {
        System.out.print("* "); 
    }
    
    System.out.println(); 
    
    }
   
    
    int n=3;
    
    for (int i = n-1; i >=1; i--) //For rows
    { 
        
    for (int j = 1; j <= n-i; j++) //For Spaces
        
    { 
        System.out.print(" "); 
    }
    
    for (int k = 1; k <=i; k++) //for columns
    
    {
        System.out.print("* "); 
    }
    
    System.out.println(); 
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }    
}
