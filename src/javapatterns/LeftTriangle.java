
package javapatterns;


public class LeftTriangle {
    
    
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            
           for(int k=3;k>=i-1;k--)
           {
                System.out.printf(" ");
            }
           
                 for(int j=1;j<=i;j++)
                {       
                System.out.printf("*");
                }
        System.out.println(" ");
    }
    }
}
