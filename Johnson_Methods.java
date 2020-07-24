import java.util.Scanner;
//import java.util.Array;
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
    if(programNumber==5){
      System.out.printf("\nEnter number between 0 and 2,147,483,647:\n");
      int number = keyboard.nextInt();
      Integer[] numberCount = digits(number);
      System.out.printf("There are %d zeros\nThere are %d ones\nThere are %d twos\nThere are %d threes\nThere are %d fours\nThere are %d fives\nThere are %d sixes\nThere are %d sevens\nThere are %d eights\nThere are %d nines\n", numberCount[0], numberCount[1], numberCount[2], numberCount[3], numberCount[4], numberCount[5], numberCount[6], numberCount[7], numberCount[8], numberCount[9]);
    }
    if(programNumber==6){
      int initSize = (int)(Math.random()*90+10);
      double turn = Math.random();
      double sOrS = Math.random();
      boolean smart;
      boolean gameOver = false;
      int currentSize = initSize;
      System.out.printf("\nPile has %d stones, ", initSize);
      if(sOrS>=.5){
        smart = true;
        System.out.printf("computer is smart,");
      }
      else{
        smart = false;
        System.out.printf("computer is stupid,");
      }
      if(turn>=.5){
        System.out.printf(" and computer goes first\n");
        while(!gameOver){
          int newSize = computerTurn(currentSize, smart);
          if(newSize == 0){
            gameOver = true;
            System.out.printf("\nComputer lost :(\n");
            break;
          }
          currentSize = newSize;
          System.out.printf("\nEnter how many of %d stones you want to take: ", currentSize);
          int amountTaken = keyboard.nextInt();
          if((amountTaken/currentSize)>.5){
            System.out.printf("\nThat amount is more than half. \nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          if(amountTaken>(currentSize-amountTaken)){
            System.out.printf("\nThat amount is more than half. \nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          if(amountTaken==0){
            System.out.printf("\nYou can't take 0, silly.\nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          newSize = currentSize-amountTaken;
          System.out.printf("\nYou took %d stones, there are %d stones left\n", amountTaken, newSize);
          if(newSize == 0){
            gameOver = true;
            System.out.printf("\nComputer won! :) Human lost!!!\n");
            break;
          }
          currentSize = newSize;
        }
      }
      else{
        System.out.printf(" and player goes first\n");
        while(!gameOver){
          System.out.printf("\nEnter how many of %d stones you want to take: ", currentSize);
          int amountTaken = keyboard.nextInt();
          if((amountTaken/currentSize)>.5){
            System.out.printf("\nThat amount is more than half. \nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          if(amountTaken>(currentSize-amountTaken)){
            System.out.printf("\nThat amount is more than half. \nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          if(amountTaken==0){
            System.out.printf("\nYou can't take 0, silly.\nEnter an amount greater than 1 and no more than half: ");
            amountTaken = keyboard.nextInt();
          }
          int newSize = currentSize-amountTaken;
          System.out.printf("\nYou took %d stones, there are %d stones left\n", amountTaken, newSize);
          if(newSize == 0){
            gameOver = true;
            System.out.printf("\nComputer won! :) Human lost!!!\n");
            break;
          }
          currentSize = newSize;
          newSize = computerTurn(currentSize, smart);
          if(newSize == 0){
            gameOver = true;
            System.out.printf("\nComputer lost :(\n");
            break;
          }
          currentSize = newSize;
        }
      }
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
  public static Integer[] digits(int number){
    int n = number;
    int zeros = 0;
    int ones = 0; 
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;
    int sevens = 0;
    int eights = 0;
    int nines = 0;
    while (n > 0){
      if (n % 10 == 0){zeros++;}
      if (n % 10 == 1){ones++;}
      if (n % 10 == 2){twos++;}
      if (n % 10 == 3){threes++;}
      if (n % 10 == 4){fours++;}
      if (n % 10 == 5){fives++;}
      if (n % 10 == 6){sixes++;}
      if (n % 10 == 7){sevens++;}
      if (n % 10 == 8){eights++;}
      if (n % 10 == 9){nines++;}
      n = n / 10; 
    }
    Integer[] numberCount = {zeros, ones, twos, threes, fours, fives, sixes, sevens, eights, nines};
    return numberCount;
  }
  public static int computerTurn(int currentSize, boolean smart){
    int amountTaken;
    if(!smart){
      amountTaken = (int)(Math.random()*(currentSize/2-1)+1);
      if(amountTaken == 0){
        amountTaken = 1;
      }
    }
    else{
      int currentTake = 1;
      int possibleTake = 2;
      if(currentSize==63 || currentSize==31 || currentSize==15 ||currentSize==7 || currentSize==3 ||currentSize==2 ||currentSize==1){
        amountTaken = (int)(Math.random()*(currentSize/2-1)+1);
        if(amountTaken == 0){
          amountTaken = 1;
        }
      }
      else{
        for(int i=1;((possibleTake/currentSize)<=.5) ; i++){
          currentTake = currentSize-possibleTake;
          possibleTake = (int)(Math.pow(2, i)-1);
        }
        amountTaken = currentTake;
      }
    }
    int newSize = currentSize - amountTaken;
    System.out.printf("\nComputer took %d stones, there are %d stones left\n", amountTaken, newSize);
    return newSize;
  }
}