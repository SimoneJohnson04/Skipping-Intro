import java.util.Scanner;
//file that has all of the basic characteristics and methods of the bunny
public class Pet{
  //characteristics of the bunny
  public String name;
  public int age;
  public double weight;
  public double energy;
  public int happiness;
  public int intelligence;
  double storeWeight; //used to determine change in weight, as compared to weight which is affected by the actions

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
    System.out.printf("Name:\t\t\t%s\nAge:\t\t\t %d years old\nWeight:\t\t\t %.1f pounds\nEnergy: \t\t%.1f\nHappiness:  \t%d\nIntelligence: \t%d\n", name, age, weight, energy, happiness, intelligence);
  }

  //allows the bunny to eat and makes the bunny gain weight
  public void eat(int carrots){
    weight = weight + carrots*.2;
    happiness=happiness+1;
    System.out.printf("%s ate %d carrots. It now weighs %.1f pounds and has a happiness of %d\n", name, carrots, weight, happiness);
  }

  //allows the bunny to drink water (and gain minimal weight)
  public void drink(){
    weight = weight + .2;
    System.out.printf("%s drank some water. It now weighs %.1f pounds\n", name, weight);
  }

  //has the bunny hop the amount of times the user inputs, and has the bunny lose the porportional amount of weight and energy
  public void hop(int hops){
    energy = energy-(hops*0.1);
    weight = weight - (hops*0.05);
    System.out.printf("%s hopped %d times. Your rabbit now weighs %.1f pounds and has %.1f energy.\n", name, hops, weight,energy);
  }

  //allows the bunny to cuddle with the user, and makes the bunny happy
  public void cuddle(){
    happiness = happiness + 1;
    System.out.printf("%s cuddled with you. Your rabbit now has a happiness of %d\n", name, happiness);
  }

  //has the bunny sleep for a while in order to get more energy
  public void nap(int minutes){
    energy = energy+(minutes*.01);
    System.out.printf("%s slept for %d minutes. Your rabbit now has %.1f energy.\n", name, minutes, energy);
  }
  
  //has the bunny learn a new trick and gain intelligence, but also takes a lot of energy
  public void trick(){
    intelligence++;
    energy = energy - 1;
    System.out.printf("%s learned a new trick and now has an intelligence of %d and %.1f energy\n", name, intelligence, energy);
  }

  //method that gives feedback to the player if the bunny is extremely overweight, underweight, tired, really energetic, or very sad. If any of these get too high, then the rabbit is removed and the game is over by returning a boolean value of false to the GameOn boolean in the PetTesting class.
  public boolean bunnyState(){
    double changeWeight = weight-storeWeight;
    if(changeWeight>=2 && changeWeight<5){
      System.out.printf("Your bunny is quite chubby and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
    }
    if(changeWeight>=5){
      System.out.printf("Your bunny is obese and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(changeWeight<=-2 && changeWeight>-5){
      System.out.printf("Your bunny is quite thin and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
    }
    if(changeWeight<=-5){
      System.out.printf("Your bunny is underweight and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(energy<=5 && energy>3){
      System.out.printf("Your bunny is quite tired and your mom threatens to give it away if you don't take care of it.\n");
      happiness--;
    }
    if(energy<=3){
      System.out.printf("Your bunny is exhausted and your mom gives it to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
    if(energy>=15){
      System.out.printf("Your bunny is full of energy and is waiting to play with you!\n");
    }
    if(happiness<5 && happiness>3){
      System.out.printf("Your bunny is unhappy and your mom threatens to take it away.");
    }
    if(happiness<=3){
      System.out.printf("Your bunny is very unhappy  and your mom gives it away to someone who will take care of it right.\n");
      happiness--;
      happiness--;
      return false;
    }
      return true;
  }
}