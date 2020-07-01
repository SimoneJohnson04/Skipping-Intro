import java.util.Scanner;
public class JohnsonTaxes {
  public static void main(String[] args) {
    System.out.println("Enter the hours worked in a week: ");
    Scanner keyboard = new Scanner(System.in);
    int hours = keyboard.nextInt();
    System.out.println("Enter the hourly pay rate: ");
    double payRate = keyboard.nextDouble();
    final double FED_TAX = .18;
    final double FICA = .08;
    final double STATE_TAX = .032;
    final double LOCAL_TAX = .02;
    System.out.printf("\nHours worked in a week: %23d\nHourly pay rate: \t\t\t\t\t$%10.2f\n\n", hours,payRate);
    double grossPay = hours*payRate;
    double fedRemoved = FED_TAX*grossPay;
    double FICARemoved = FICA*grossPay;
    double stateRemoved = STATE_TAX*grossPay;
    double localRemoved = LOCAL_TAX*grossPay;
    double netPay = grossPay-fedRemoved-stateRemoved-FICARemoved-localRemoved;
    System.out.printf("Gross pay before taxes:\t\t\t\t$%10.2f\nPay withheld from federal tax: \t\t$%10.2f\nPay withheld from FICA tax: \t\t$%10.2f\nPay withheld from state tax: \t\t$%10.2f\nPay withheld from local tax: \t\t$%10.2f\n\nNet pay: \t\t\t\t\t\t\t$%10.2f\n", grossPay,fedRemoved,FICARemoved,stateRemoved,localRemoved,netPay);
  }
}