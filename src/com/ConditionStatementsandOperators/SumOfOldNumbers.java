package com.ConditionStatementsandOperators;

import java.util.Scanner;

public class SumOfOldNumbers {

	
/*
 15. Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :


The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25
 	
 */
	public static void main(String[] args) {
	
		System.out.println("Enter no.of tersm: ");
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=total;i++) {
			System.out.println(2*i-1);
			sum+=2*i-1;
		}
		System.out.println(sum);

	}

}
