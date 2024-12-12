package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?
	
	class starter {
		public static void main(String args[]){
			Spiderman v = new Spiderman();
			x.setActor("Tobey Maguire");
			x.setAge(49);
			x.setVillain("Green Goblin");
			
			Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
			Spiderman z = new Spiderman("Tom Holland");
			z.getAge(28);
			z.setVillain("The Vulture");
			
			System.out.println("The villain is " + y.getVillain());
		}
	}

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	publlic Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	
	public Spiderman(String a){
		actor = unknown;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String v){
		actor = unknown;
		age = 0;
		villain = v;
	}
	public Spiderman(String a, int b, String c){
		actor = a;
		age = b;
		villain = c;
	}
	
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
public void setVillain(){
	villain = v; 
}

public void getAge(int b){
	villain = v; 
}

public void setVillain(String v){
	villain = ; 
}	
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
