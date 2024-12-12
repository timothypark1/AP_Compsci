/* 
    Lecture note example - If Statements
*/

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
	}
Scanner sc = new Scanner(System.in);
System.out.println("You've joined an Alien Exchange Program!");
System.out.println("Pick an Alien to take in!");
System.out.println("1. Joe, a fat bellied alien who loves eating pizza");
System.out.println("2. Bob, a blue alien who loves trees");
System.out.println("3. Barney, a purple tailed alien who eats");

int answer1 = sc.nextInt();
if(answer1 == 1({
    System.out.println("You picked Joe!!! WOO!");
    System.out.println("What type of pizza should you pick up for Joe?");
    System.out.println("1. Dominoes");
    System.out.println("2. Costco");
    System.out.println("3. Pizza Hut");
    int.answer2 = sc.nextInt();
    
    if(answer2 == 1)
        System.out.println("Joe  loves the crust!");
    else if(answer2 == 2)
        System.out.println("Joe loves the convenience!");
    else if(answer2 == 3)
        System.out.println("Joe dies of cardboard intake.");
    else
        System.out.println("You get Dave's hot chicken instead.");
        
}
else if(answer1 == 2){
    System.out.println("You picked Bob!!! WOO!");
}    
else if(answer1 == 3){
    System.out.println("You picked Barney!!! WOO!");
}    
else{
    System.out.println("You get Jerry.");
    
    
    

