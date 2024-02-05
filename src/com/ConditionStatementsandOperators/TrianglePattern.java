package com.ConditionStatementsandOperators;

public class TrianglePattern {

	
/*
16. Write a Java program to display the pattern like a right angle triangle with a number.

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910



17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

The pattern is as follows :

1
22
333
4444

18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

The pattern like :

1
2 3
4 5 6
7 8 9 10

19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

       1
      2 2
     3 3 3
    4 4 4 4 

21. Write a Java program to display the pattern like a diamond.

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      * 


 */
		
	
	public static void main(String[] args) {
		int n=10;
		
		
		
		//16
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//17
		int x=4;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		//18
		int y=5;
		int num=1;
		for(int i=0;i<y;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
		//19
		int z=4;
		for(int i=1;i<=z;i++) {
			for(int k=1;k<=z-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		
		int nx=7;
		for(int i=0;i<=nx;i++) {
			for(int k=1;k<=nx-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=nx-1;a>=0;a--) {
			for(int b=1;b<=nx-a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*a-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	
	}

}
