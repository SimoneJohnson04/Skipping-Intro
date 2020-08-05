import java.util.Scanner;
public class Pet{
  public String name;
  public int age;
  public double weight;
  public double energy;
  public int happiness;

  public Pet(){
    name = Bunny;
    age = 6;
    weight = 5;
    energy = age*-3+30;
    happiness = 5;
  }

  public Pet(String nameOfBunny, int ageOfBunny, double weightOfBunny){
    name = nameOfBunny;
    age = ageOfBunny;
    weight = weightOfBunny;
    energy = age*-3+30;
    happiness = 5;
  }

  public void DisplayStats(){
    System.out.println("\nThe bunny's stats are as follows:\n");
    System.out.printf("Name: \t%s\nAge: \t%d\nWeight: \t%.1f\nEnergy: \t%.1f\nHappiness: \t%d\n", name, age,weight, energy, happiness);
  }

  public void eat(){
    weight = weight + .5;
    System.out.printf("Your bunny ate 3 carrots. It now weighs %.1f pounds", weight);
  }

  public void drink(){
    weight = weight + .2;
    System.out.printf("Your bunny drank some water. It now weighs %.1f pounds", weight);
  }

  public void hop(int hops){
    energy = energy-(hops*0.1);
    happiness=happiness+1;
  }
}