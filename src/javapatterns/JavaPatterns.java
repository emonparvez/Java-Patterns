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
public class JavaPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
    /*      -< n-1    n   n+1 ->
                    *
                *          *
              *     *      *
        *     *     *       *    *
    If rows is n then coloumns is 2n-1
    
    
    
    */

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=2*n-1;j++)
            {
            if(j>=n - (i-1) && j<=n + (i-1))
            {
                System.out.printf("*");
            }
            else{
                System.out.printf(" ");
            }
                
            };
            
                    System.out.println(" ");

        };
    }



    }
    

