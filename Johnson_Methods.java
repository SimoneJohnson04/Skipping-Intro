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
    if(programNumber==4){
      System.out.printf("\nEnter number:\n");
      int number = keyboard.nextInt();
      double answer = sqrt(number);
      System.out.printf("The square root is: %.4f", answer);
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
  public static double sqrt(int number){
    double answer = 0;
    for(double squaredNum = 1; squaredNum*squaredNum<=number; squaredNum++){
      answer = squaredNum;
    }
    for(double squaredNum = answer; squaredNum*squaredNum<=number; squaredNum = squaredNum+.1){
      answer = squaredNum;
    }
    for(double squaredNum = answer; squaredNum*squaredNum<=number; squaredNum = squaredNum+.01){
      answer = squaredNum;
    }
    for(double squaredNum = answer; squaredNum*squaredNum<=number; squaredNum = squaredNum+.001){
      answer = squaredNum;
    }
    for(double squaredNum = answer; squaredNum*squaredNum<=number; squaredNum = squaredNum+.0001){
      answer = squaredNum;
    }
    if((answer+.00005)*(answer+.00005)<=number){
      answer = answer + .0001;
    }
    return answer;
  }
}