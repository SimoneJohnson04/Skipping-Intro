import java.util.Scanner;
public class PetTesting {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Pet bunny;
    System.out.println("Which constructor do you want?  1. Default \t2. Custom");
		int choice = keyboard.nextInt();
		if (choice == 1){
      //creates a basic bunny without any special inputs
			bunny = new Pet();
		}
		else{
      //allows the user to create their own bunny by entering the name, age, and initial weight of the bunny, then using the Pet class to create the bunny
      System.out.println("Enter the name: ");
      keyboard.nextLine();
      String nameOfBunny = keyboard.nextLine();
      System.out.println("Enter the bunny's age:");
      int ageOfBunny = keyboard.nextInt();
      System.out.println("Enter the bunny's weight:");
      double weightOfBunny = keyboard.nextDouble();
			bunny = new Pet(nameOfBunny,ageOfBunny,weightOfBunny);
		}
    boolean gameOn = true;
    while(gameOn){
      System.out.printf("\n");
      System.out.println(bunny.name + " eagerly awaits your attention. Select an action: \n1. Display your bunny's stats\n2. Feed the bunny some carrots(Weight + 0.2*carrots, Happiness + 1)\n3. Give the bunny some water(Weight + 0.2)\n4. Let your bunny hop through hoops(Energy-hops*0.1, Weight-hops*0.05)\n5. Cuddle with the bunny(Happiness + 1)\n6. Let the bunny take a nap(Energy + 0.01*Minutes)\n7. Teach your bunny a new trick(Intelligence + 1, Energy - 1)\n0. Stop playing with the virtual bunny");
      choice = keyboard.nextInt();
      System.out.printf("\n");

      switch(choice){
      case 1:
        //displays all of the instance variables related to the bunny
        bunny.displayStats();
        break;
      case 2:
        //has the bunny eat the users input # of carrots
        System.out.println("How many carrots will you give the bunny ?");
        int carrots = keyboard.nextInt();
        bunny.eat(carrots);
        break;
      case 3:
        //runs the buny drinking method
        bunny.drink();
        break;
      case 4:
        //runs the hop method, and inputs the users # of hops
        System.out.println("How many times should the bunny hop?");
        int hops = keyboard.nextInt();
        bunny.hop(hops);
        break;
      case 5:
        //bunny cuddle method, with a void type
        bunny.cuddle();
        break;
      case 6:
        //has the bunny take a nap for the inputted amount of minutes
        System.out.println("How many minutes should the bunny nap?");
        int minutes = keyboard.nextInt();
        bunny.nap(minutes);
        break;
      case 7:
        //runs the trick method
        bunny.trick();
        break;
      case 0:
        //stops the game
        System.out.println("Goodbye.");
        gameOn = false;
        return;
      default:
        //if the user enters a number that is not valid (ex. 19, or "s")
        System.out.println("Please enter a valid selection.");
        break;
      }
      //if the bunny is taken away, then the return will be false, setting the gameOn boolean to false and stopping the game
      gameOn = bunny.bunnyState();
      //this method uses a return in order to update the gameOn boolean, and thus is a boolean method rather than a void method
    }
  }
}