import java.util.Scanner;
public class Johnson_GradesLoop {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("\n\nDo you want to run program 1, 2, 3, the bonus(4), or exit(0)? \nPlease enter the corresponding number: ");
    int programNumber = keyboard.nextInt();
    while(programNumber!=0){
      if(programNumber==1){
        int currentStudents = 1;
        int passingGrades = 0;
        int failingGrades = 0;
        System.out.printf("\nEnter grade #%d:\t", currentStudents);
        String inputGrade;
        keyboard.nextLine();
        inputGrade = keyboard.nextLine();
        String Z = "Z";
        String z = "z";
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String F = "F";
        while((inputGrade.equals(Z)==false)&&(inputGrade.equals(z)==false)){
          if(inputGrade.equals(A)||inputGrade.equals(B)||inputGrade.equals(C)||inputGrade.equals(D)){
            passingGrades++;
            currentStudents++;
            System.out.printf("Enter grade #%d:\t", currentStudents);
            inputGrade = keyboard.nextLine();
          }
          else if(inputGrade.equals(F)){
            currentStudents++;
            failingGrades++;
            System.out.printf("Enter grade #%d:\t", currentStudents);
            inputGrade = keyboard.nextLine();
          }
          else{
            System.out.printf("<%s is not an acceptable grade>", inputGrade);
            System.out.printf("\nEnter grade #%d:\t", currentStudents);
            inputGrade = keyboard.nextLine();
          }
        }
        int totalStudents = currentStudents-1;
        double percentPass = (double)passingGrades/totalStudents*100;
        double percentFail = (double)failingGrades/totalStudents*100;
        System.out.printf("\n%d students total", totalStudents);
        System.out.printf("\n%d students passed: \t%.2f", passingGrades, percentPass);
        System.out.print("%");
        System.out.printf("\n%d students failed: \t%.2f", failingGrades, percentFail);
        System.out.print("%");
        System.out.printf("\n\nProgram finished");
      }
      else if(programNumber==2){
        System.out.printf("\nEnter an integer:\t");
        int integer1 = keyboard.nextInt();
        System.out.printf("Enter an integer:\t");
        int integer2 = keyboard.nextInt();
        while(integer2!=0){
          int storeInt2 = integer2;
          integer2 = integer1%integer2;
          integer1 = storeInt2;
        }
        System.out.printf("The GCD is %d", integer1);
        System.out.printf("\n\nProgram finished");
      }
      else if(programNumber==3){
        int OrigInt1 = (int)(Math.random()*100)+1;
        int OrigInt2 = (int)(Math.random()*100)+1;
        int int1 = OrigInt1;
        int int2 = OrigInt2;
        while(int2!=0){
          int previousInt2 = int2;
          int2 = int1%int2;
          int1 = previousInt2;
        }
        System.out.printf("\nThe GCD of %d and %d is %d", OrigInt1, OrigInt2, int1);
        System.out.printf("\n\nProgram finished");
      }
      else if(programNumber==4){
        System.out.printf("\nPlease enter the number the program will guess:\t");
        keyboard.nextLine();
        int guessingNumber = keyboard.nextInt();
        System.out.printf("\n");
        String correct = "C";
        String higher = "H";
        String lower = "L";
        int max = 100;
        int min = 0;
        int guesses = 0;
        int guessNumber;
        String inputString;
        do{
          guessNumber = (int)((max+min)/2);
          System.out.printf("Is the number %d?\t (H)igher, (L)ower, or (C)orrect:\t", guessNumber);
          if(guessNumber==50){
            keyboard.nextLine();
          }
          inputString = keyboard.nextLine();
          if (inputString.equals(higher)==true){
            min = guessNumber;
          }
          if(inputString.equals(lower)==true){
            max = guessNumber;
          }
          guesses++;
        }
        while(inputString.equals(correct)==false);
        System.out.printf("\nIt took %d guesses to reach the number", guesses);
        System.out.printf("\n\nProgram finished");
      }
      else{
        System.out.printf("\nThat program number (%d) is not valid.",programNumber);
      }
      System.out.printf("\n\nDo you want to run program 1, 2, 3, the bonus(4), or exit(0)? \nPlease enter the corresponding number: ");
      programNumber=keyboard.nextInt();
    }
  }
}