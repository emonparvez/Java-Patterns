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
public class HourGlass_Star_Pattern {
    public static void main(String[] args) {
        int rows=5;
                   
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) 
	{ 
	    System.out.print("*" + " "); 
	}

 	System.out.println(""); 
	
	} 
//For printing bottom half

	for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");

	}
    }
}
