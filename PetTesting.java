import java.util.Scanner;
public class RabbitRunner {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Pet bunny;
    System.out.println("Which constructor do you want?  1. Default \t2. Custom");
		int choice = keyboard.nextInt();
		if (choice == 1){
			bunny = new Pet();
		}
		else{
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
      System.out.println(bunny.name + " eagerly awaits your attention. Select an action: \n1. Display your bunny's stats\n2. Feed the bunny some carrots\n3. Give the bunny some water\n4. Let your bunny hop through hoops\n5. Cuddle with the bunny \n6. Let the bunny take a nap\n7. Teach your bunny a new trick\n0. Stop playing with the virtual bunny");

      choice = keyboard.nextInt();
      System.out.printf("\n");

      switch(choice){
      case 1:
        bunny.displayStats();
        break;
      case 2:
        System.out.println("How many carrots will you give the bunny ?");
        int carrots = keyboard.nextInt();
        bunny.eat(carrots);
        break;
      case 3:
        bunny.drink();
        break;
      case 4:
        System.out.println("How many times should the bunny hop?");
        int hops = keyboard.nextInt();
        bunny.hop(hops);
        break;
      case 5:
        bunny.cuddle();
        break;
      case 6:
        System.out.println("How many minutes should the bunny nap?");
        int minutes = keyboard.nextInt();
        bunny.nap(minutes);
        break;
      case 7:
        bunny.trick();
        break;
      case 0:
        System.out.println("Goodbye.");
        gameOn = false;
        return;
      default:
        System.out.println("Please enter a valid selection.");
        break;
      }

      gameOn = bunny.bunnyState();

    }
  }
}











public class Pet{
  public String name;
  public int age;
  public double weight;
  public double energy;
  public int happiness;
  public int intelligence;
  double storeWeight;

  //default constructor
  public Pet(){
    name = "Bunny";
    age = 6;
    weight = 7;
    energy = age*-3+36;
    happiness = 5;
    intelligence = 5;
    storeWeight = weight;
  }

  //custom constructor
  public Pet(String nameOfBunny, int ageOfBunny, double weightOfBunny){
    name = nameOfBunny;
    age = ageOfBunny;
    weight = weightOfBunny;
    energy = age*-3+36;
    happiness = 5;
    intelligence = 5;
    storeWeight = weight;
  }

  //method that displays all of the characteristics to the screen
  public void displayStats(){
    System.out.println("\nThe bunny's stats are as follows:\n");
    System.out.printf("Name: \t\t%s\nAge: \t\t%d\nWeight: \t%.1f\nEnergy: \t%.1f\nHappiness: \t%d\nIntelligence: \t%d\n", name, age, weight, energy, happiness, intelligence);
  }

  //allows the bunny to eat and makes the bunny gain wei
  public void eat(int carrots){
    weight = weight + carrots*.2;
    happiness=happiness+1;
    System.out.printf("Your bunny ate %d carrots. It now weighs %.1f pounds and has a happiness of %d\n", carrots, weight, happiness);
  }

  //allows the bunny to drink water (and gain minimal weight)
  public void drink(){
    weight = weight + .2;
    System.out.printf("Your bunny drank some water. It now weighs %.1f pounds\n", weight);
  }

  //has the bunny hop the amount of times the user inputs, and has the bunny lose the porportional amount of weight and energy and be happier
  public void hop(int hops){
    energy = energy-(hops*0.1);
    weight = weight - (hops*0.05);
    happiness=happiness+1;
    System.out.printf("Your bunny hopped %d times. Your rabbit now has %.1f energy and a happiness of %d\n", hops, energy, happiness);
  }

  //allows the bunny to cuddle with the user, and makes the bunny happy
  public void cuddle(){
    happiness = happiness + 1;
    System.out.printf("Your bunny cuddled with you. Your rabbit now has a happiness of %d\n", happiness);
  }

  //has the bunny sleep for a while in order to get more energy
  public void nap(int minutes){
    energy = energy+(minutes*.01);
    System.out.printf("Your bunny slept for %d minutes. Your rabbit now has %.1f energy",minutes, energy);
  }
  
  //has the bunny learn a new trick and gain intelligence, but also takes a lot of energy
  public void trick(){
    intelligence++;
    energy = energy - 1;
    System.out.printf("Your bunny learned a new trick and now has an intelligence of %d and %.1f energy\n", intelligence, energy);
  }

  //method that gives feedback to the player if the bunny is extremely overweight, underweight, tired, really energetic, or very sad. If any of these get too high, then the rabbit is removed and the game is over by returning a boolean value of false to the GameOn boolean in the PetTesting class.
  public boolean bunnyState(){
    double changeWeight = weight-storeWeight;
    if(changeWeight>=2 && changeWeight<4){
      System.out.printf("Your bunny is quite chubby and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
      return true;
    }
    if(changeWeight>=4){
      System.out.printf("Your bunny is obese and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(changeWeight<=-2 && changeWeight>-4){
      System.out.printf("Your bunny is quite thin and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
      return true;
    }
    if(changeWeight<=-4){
      System.out.printf("Your bunny is underweight and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(energy<=5 && energy>3){
      System.out.printf("Your bunny is quite tired and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
      return true;
    }
    if(energy<=3){
      System.out.printf("Your bunny is exhausted and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(energy>=15){
      System.out.printf("Your bunny is full of energy and is waiting to play with you!\n");
      return true;
    }
    if(happiness<5 && happiness>3){
      System.out.printf("Your bunny is unhappy and your mom threatens to take it away.");
      happiness--;
      return true;
    }
    if(happiness<=3){
      System.out.printf("Your bunny is very unhappy  and your mom gives it away to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    else{
      return true;
    }
  }
}