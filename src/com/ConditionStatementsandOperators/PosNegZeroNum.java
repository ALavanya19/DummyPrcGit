package com.ConditionStatementsandOperators;

public class PosNegZeroNum {

/* Q: Write a Java program that reads a floating-point number and prints "zero"
      if the number is zero. Otherwise, print "positive" or "negative".
      Add "small" if the absolute value of the number is less than 1,
      or "large" if it exceeds 1,000,000.


      Test Data
      Input a number: 25
      Expected Output :
      Input value: 25
      Positive number	
      
      num=0 zero
      num>0 positive
          if(num<1) == small positive 
          if(num>100000) == large positive
      num<0 negative
          if(Math.ab(Num)<1) == Small negative
          if(math.ab(num)>1000000) == large negative   
      
      Notes:
      ab(num) =0   ===> Zero
      ab(num) <1   ===> large + Positive
      ab(num) >1   ===> small + Negative
      1 to 1000000
                             F=========(ab(num)==0)===========T
         F====(ab(num)=>1 && ab(num)<=1000000)====T    ======print Zero
   print more than 1000000                 F====if(ab(num)>0))====T
                                =====Print large +Positive =====
      
	
*/
	public static void main(String[] args) {
		
		int num=0;
		if(num==0) 
		{
			System.out.println("Zero");
		}
		else if(num >=1 & num<=1000000)
		{
			if(num>0)
			{
				System.out.println("Large & Positive Number");
			}
			else if(Math.abs(num)<0)
			{
				System.out.println("Small & Negative Number");
			}
		}
		else
		{
			System.out.println("Number not between 1 to 1000000");
		}
	}
}
