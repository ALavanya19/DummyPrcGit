package com.ConditionStatementsandOperators;

public class GreatestNumber {

	public static void main(String arg[])
	{
		int a=25;
		int b=87;
		int c=78;
		if(a>b & a>c) { // (25>78(f) & 25>87(f))==== F
			System.out.println("The Gretest Number " +a);    
		}
		else if(b>a & b>c) { //(78>25(T) & 78>87(F) === F
			System.out.println("The Gretest Number " +b);
		}
		else if(c>a & c>b)  //(87>25(T) & 87>78(T)) === T
		{
			System.out.println("The Gretest Number " +c);
		}
	}
}
