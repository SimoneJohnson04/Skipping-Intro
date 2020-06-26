import java.util.Scanner;
class MakingTaxes {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("\nEnter the cost of the purchase: ");
    double purchaseCost = keyboard.nextDouble();
    System.out.printf("\nEnter the amount received from customer: ");
    double customerPay = keyboard.nextDouble();
    double changeDue = customerPay-purchaseCost;
    int dollars = (int)changeDue;
    int quarters = (int)((changeDue%dollars)/.25);
    int dimes = (int)((changeDue%.25)/.1);
    int nickels = (int)((changeDue%.25%.1)/.05);
    int pennies = (int)((changeDue%.05)/.01);
    System.out.printf("\nCost of Purchase: \t$%.2f\nAmount Received: \t$%.2f\nChange Due: \t\t$%.2f\n\n", purchaseCost,customerPay,changeDue);
    System.out.printf("\nBreakdown: \n\nDollars: \t%d\nQuarters: \t%d\nDimes: \t\t%d\nNickels: \t%d\nPennies: \t%d", dollars,quarters,dimes,nickels, pennies);
  }
}