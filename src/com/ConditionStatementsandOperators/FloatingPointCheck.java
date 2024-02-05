package com.ConditionStatementsandOperators;

public class FloatingPointCheck {

/* Write a Java program that reads two floating-point numbers and tests whether 
   they are the same up to three decimal places.

   Test Data
   Input floating-point number: 25.586
   Input floating-point another number: 25.589
   Expected Output :
   They are different

  Noteee:
   float a=25.586f
   float b=25.589f
   if(a==b) == same 
   else == different
 
 
 
 
 */
	
	public static void main(String arg[]) {
		
		float a=25.586946954f;
		float b=25.58947846f;
		
		a=Math.round(a*1000); // 
		System.out.println(a);
		a/=1000;
		System.out.println(a);
		
		b=Math.round(b*1000);
		System.out.println(b);
		b=b/1000;
		System.out.println(b);
		
		if(a==b) {
			System.out.println("They are same");
		}
		else {
			System.out.println("They are different");
		}
	}

}
