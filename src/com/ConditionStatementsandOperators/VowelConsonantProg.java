package com.ConditionStatementsandOperators;

import java.util.Scanner;

public class VowelConsonantProg {

	
/* Write a Java program that requires the user to enter a single character 
 * from the alphabet. Print Vowel or Consonant, depending on user input.
 * If the user input is not a letter (between a and z or A and Z),
 * or is a string of length > 1, print an error message.

     Test Data
     Input an alphabet: p
     Expected Output :
     Input letter is Consonant	
	
	Notes:
	--> a to z & A to Z 
	--> a e i o u - Vowels
	--> char >1 --> error message
	 
	
*/	
	public static void main(String[] args) {
		
		 String str="P";
		
		 boolean upperCase=(str.charAt(0)>=65 && str.charAt(0)<=90);
		 boolean lowerCase=(str.charAt(0)>=97 && str.charAt(0)<=122);
		 
	
		if(str.length()>1) {
			System.out.println("Not a alphabet");
		}
		else if(!(upperCase || lowerCase)) {
			System.out.println("Should be alphabet");
		}
		else if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") || str.equalsIgnoreCase("i") || str.equalsIgnoreCase("o") || str.equalsIgnoreCase("u")) {
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("consonant");
		}

	}

}
