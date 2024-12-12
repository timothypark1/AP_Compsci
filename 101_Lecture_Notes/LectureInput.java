import java.util.Scanner;
    Lecture note example - Input and Scanner
*/

class LectureVariables{
    public static void main(String args[]) {
        // Your Code Goes here!
	}
}

Scanner sc = new Scanner(System.in);
Scanner.put.println("Please enter a name:"); 
String name = sc.nextLine();
System.out.println("Hello " + name);

System.out.println("Please enter a number;");
int number1 = sc.nextint();
sc.nextLine();

System.out.println("Please enter another number;");
int number2 = sc.nextint();
sc.nextLine();

sum = number1 + number2;

System.out.println("The sum of the number is: " + (number1 + number2));

System.out.println("What's your fav food?");
String food = sc.nextLine();