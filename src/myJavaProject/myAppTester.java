 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();
	  
	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  
	  
	  System.out.println("Sum of digits is: " +sumOfDigits(n));
	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	 public static int sumOfDigits(int num){
		 int a;
		 int sum =0;
		 while (num>0) {
			 a = num%10;
			 sum=sum+a;
			 num=num/10;
		 }
         return sum;   

	 }
	 
	   

}
