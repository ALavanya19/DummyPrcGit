package com.ConditionStatementsandOperators;

public class WeekdayName {

	
/*	Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

	Test Data
	Input number: 3
	Expected Output :
	Wednesday   
	
	
	
*/	
	public static void main(String[] args) {
		
		
		
		int weekday=3;
		
		//Method1:
		
	/*	if(weekday==1) {
			System.out.println("Monday");
		}
		else if(weekday==2) {
			System.out.println("Tuesday");
		}
		else if(weekday==3) {
			System.out.println("Wednesday");
		}
		else if(weekday==4) {
			System.out.println("Thurday");
		}
		else if(weekday==5) {
			System.out.println("Friday");
		}
		else if(weekday==6) {
			System.out.println("Saturday");
		}
		else if(weekday==7) {
			System.out.println("Sunday");
		} */
		
		
		
		
		//Method2
		switch (weekday) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}
		case 3:{
			System.out.println("Wednesday");
			break;
		}
		case 4:{
			System.out.println("Thurday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:{
			System.out.println("Saturday");
			break;
		}
		case 7:{
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("Invalid Weekday");
		}
		
		
	}
	
}
