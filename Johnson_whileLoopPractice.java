import java.util.Scanner;
public class Johnson_whileLoopPractice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("\n\nDo you want to run program 1, 2, 3, the bonus(4), or exit(0)? \nPlease enter the corresponding number: ");
    int programNumber = keyboard.nextInt();
    while(programNumber!=0){
      if(programNumber==1){
        System.out.printf("\nWhat is your name? ");
        keyboard.nextLine();
        String name = keyboard.nextLine();
        System.out.printf("\n%s\nEnter 0 to exit or any other number to display your name again:",name);
        int displayNumber = keyboard.nextInt();
        while(displayNumber!=0){
         System.out.printf("\n%s\n",name);
         displayNumber = keyboard.nextInt();
       }
      }

      if(programNumber==2){
          System.out.printf("\n\nEnter the starting and Fahrenheit values: \n");
          int startingTempF = keyboard.nextInt();
          int endingTempF = keyboard.nextInt();
          int currentTempF = startingTempF;
          System.out.printf("\n\nDegrees Fahrenheit  | Degrees Celcius\n---------------------------------------");
          while(currentTempF<=endingTempF){
            double currentCelcius = (double)(currentTempF-32)*5/9;
            System.out.printf("\n\t\t%d\t\t\t|\t\t%.1f",currentTempF, currentCelcius);
            currentTempF++;
          }
        }

      if(programNumber == 3){
        int consecutiveInts = 0;
        int total = 0;
        int currentInt = 1;
        while(total<100){
          total+=currentInt;
          consecutiveInts++;
          currentInt++;
        }
        System.out.printf("\nIt takes the sum of %d consecutive integers to exceed 100.\nThe sum of %d consecutive integers is %d", consecutiveInts, consecutiveInts, total);
      }

      if (programNumber==4){
        System.out.printf("\nEnter a number: ");
        int startingNumber = keyboard.nextInt();
        int timesMultiplied = 0;
        int currentNumber = 1;
        while(currentNumber<1000){
          currentNumber*=startingNumber;
          timesMultiplied ++;
        }
        timesMultiplied-=1;
        System.out.printf("\nTimes multiplied by itself: \t%d", timesMultiplied);
        System.out.printf("\nProduct after 1000: \t\t%d", currentNumber);
      }

      System.out.printf("\n\nProgram finished. \nEnter another program (1, 2, 3, or 4) or enter 0 to exit.");
      programNumber=keyboard.nextInt();
    }
  }
}