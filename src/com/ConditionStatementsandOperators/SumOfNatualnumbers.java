package com.ConditionStatementsandOperators;

import java.util.Scanner;

public class SumOfNatualnumbers {

/*	
	
Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23

*/	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int no=0;no<=n;no++) {
			System.out.println(no);
			sum=sum+no;
		}
		System.out.println(sum);
		
		
	}

}
