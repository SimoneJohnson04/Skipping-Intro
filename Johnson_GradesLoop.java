import java.util.Scanner;
public class MakingTaxes {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int currentStudents = 1;
    int passingGrades = 0;
    int failingGrades = 0;
    System.out.printf("\nEnter grade #%d:\t", currentStudents);
    String inputGrade;
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
  }
}