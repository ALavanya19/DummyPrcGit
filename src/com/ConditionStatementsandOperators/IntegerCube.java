package com.ConditionStatementsandOperators;

import java.util.Scanner;

public class IntegerCube {

/* 
 * Write a Java program to display the cube of the given number up to an integer.

Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1                                               
Number is : 2 and cube of 2 is : 8                                               
Number is : 3 and cube of 3 is : 27                                              
Number is : 4 and cube of 4 is : 64
	
 */
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of terms:");
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cube=1;
        for(int no=1;no<=num;no++) {
        	cube=num*num*num;
        }
        System.out.println("Cube "+cube);
        
        
	}

}
