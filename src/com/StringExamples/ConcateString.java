package com.StringExamples;

public class ConcateString {

/*
7. Write a Java program to concatenate a given string to the end of another string.

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises

*/
	public static void main(String[] args) {
		String str1="Java ";
		String str2="Programms";
		String str3="Staing Programs Practices";
		System.out.println(str1.concat(str2));
		System.out.println(str3.contains("Programs"));
		System.out.println(str1.equals(str2));
		
	}

}
