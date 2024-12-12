/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
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
sc.nextLine();

System.out.println("Enter 2 numbers to create a range for your random number");
sc.nextLine();

System.out.println("Please enter an integer");
int number1 = sc.nextInt();

System.out.println("Please enter another integer (bigger than the first)");
int number2 = sc.nextInt();

System.out.print("Your range is "int number1" to "int number2");
sc.nextLine();

System.out.println("Here are 5 numbers generated in that range");
sc.nextLine();

(int)(Math.random()*50)+25
sc.nextLine();