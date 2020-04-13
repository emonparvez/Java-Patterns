/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns;

/**
 *
 * @author User
 */
public class ReversePyramid {
    
    public static void main(String[] args) {
        
        int n=4,z=2*n-1; 
//for every print of row there will be 7 times print of columns ,so Z=2*n-1.
        
        for(int i=n;i>=1;i--)
        
        {
            for (int j = n-1; j >=i ; j--) 
            
            {
              System.out.print(" "); 
            }  
                
            
            for (int k = 1; k <=z ; k++) 
            {
                System.out.print("*");  
            }
            
            z-=2; //decreasing the value of z by 2
            
            
            System.out.println();
        }
    }
    
}
