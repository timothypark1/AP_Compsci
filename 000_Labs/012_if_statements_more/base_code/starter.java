/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
	}
}

Scanner sc = new Scanner(System.in);
System.out.println("Please input your first number");
int number1 = sc.nextInt();
sc.nextLine();

System.out.println("Please input your second number");
int number2 = sc.nextInt();

System.out.println("Your numbers are different!");
sc.nextLine();
