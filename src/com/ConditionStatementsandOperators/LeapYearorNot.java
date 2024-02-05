package com.ConditionStatementsandOperators;

public class LeapYearorNot {

/*  Write a Java program that takes a year from the user and prints whether it is a leap year or not.

    Test Data
    Input the year: 2016
    Expected Output :
    2016 is a leap year	

    Notes:
    /4 & /100 & /400

	
*/	
	
	public static void main(String[] args) {
		int year=2020;
		
		if(year%400==0 || (year%4==0 && year%100 !=0)){
			System.out.println(year+ " Is Leap Year ");
		}
		else
		{
			System.out.println(year+" Is not leap year");
		}
			

	}

}
