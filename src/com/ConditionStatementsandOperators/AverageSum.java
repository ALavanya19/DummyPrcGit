package com.ConditionStatementsandOperators;

import java.util.Scanner;

public class AverageSum {

/*
 12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :


Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0
  
  
 */

	
	public static void main(String[] args) {
		
		System.out.println("Enter count of numbers");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		float sum=0;
		
		for(int no=0;no<count;no++) {
			int num=sc.nextInt();
			sum=sum+num;
		}
		sum=sum/count;
		System.out.println("Average"+sum);

	}

}
