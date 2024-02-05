package com.ConditionStatementsandOperators;

import java.util.Calendar;

public class NumberOfDaysInMonth {

/*	
	Write a Java program to find the number of days in a month.

	Test Data
	Input a month number: 2
	Input a year: 2016
	Expected Output :
	February 2016 has 29 days
	
	

*/	
	
	public static void main(String[] args) {
		
		int year=2016;
		int month=2;
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
	}

}
