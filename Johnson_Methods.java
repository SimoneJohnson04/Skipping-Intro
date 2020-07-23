import java.util.Scanner;
public class Johnson_Methods {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter program number: ");
    int programNumber = keyboard.nextInt();
    if(programNumber==1){
      System.out.printf("\nEnter length and width:\n");
      int length = keyboard.nextInt();
      int width = keyboard.nextInt();
      System.out.println("The perimter is: " + rectPerimeter(length,width));
    }
    if (programNumber==2){
      System.out.printf("\nEnter base and power:\n");
      int base = keyboard.nextInt();
      int power = keyboard.nextInt();
      System.out.println("The answer is: " + toThePower(base,power));
    }
    if(programNumber==3){
      System.out.printf("\nEnter number:\n");
      int num = keyboard.nextInt();
      System.out.println("The statement 'The number is prime' is: " + isPrime(num));
    }
  }
  public static int rectPerimeter(int length, int width){
    int Peri = length*2+width*2;
    return Peri;
  }
  public static int toThePower(int base, int power){
    int number = 1;
    for(int i=1; i<=power; i++){
      number= number*base;
    }
    return number;
  }
  public static boolean isPrime(int num){
    if (num <= 1){
      return false; 
    }
    if (num <= 3){
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0){
      return false;
    }
    for (int i = 5; i * i <= num; i = i + 6){ 
      if (num % i == 0 || num % (i + 2) == 0){
        return false;
      }
    }
    return true; 
  }
}