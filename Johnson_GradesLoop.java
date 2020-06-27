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
            System.out.printf("\nEnter grade #%d:\t", currentStudents);
            inputGrade = keyboard.nextLine();
          }
          else if(inputGrade.equals(F)){
            currentStudents++;
            failingGrades++;
            System.out.printf("\nEnter grade #%d:\t", currentStudents);
            inputGrade = keyboard.nextLine();
          }
          else{
            System.out.printf("\n<%s is not an acceptable grade>\n", inputGrade);
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
        System.out.printf("\n\nProgram finished");
      }
      else if(programNumber==4){
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