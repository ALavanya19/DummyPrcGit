package com.ConditionStatementsandOperators;

public class MultiplicationTable {

	
/*
 14. Write a Java program to display the multiplication table of a given integer.

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :

5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25	
 
 
 
 */
	
	public static void main(String[] args) {
		
		int terms=10;
		
		for(int i=0;i<=terms;i++) {
			{
				System.out.println(terms+" X "+i+" = "+(terms*i));
			}
		}
		
		
	}

}
