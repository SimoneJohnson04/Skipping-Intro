import java.util.Scanner;
public class Johnson_Quadratic {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the first coefficient A: ");
    int a = keyboard.nextInt();
    System.out.println("Enter the second coefficient B: ");
    int b = keyboard.nextInt();
    System.out.println("Enter the third coefficient C: ");
    int c = keyboard.nextInt();
    if (b*b-4*a*c<0){
      System.out.println("Solution doesn't exist");
    }
    else{
      System.out.printf("\nThe equation you entered is %dx^2 + %dx + %d", a, b, c);
      double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
      double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
      System.out.printf("\nThe solution(s) are x= %.2f and x= %.2f", x1, x2);
    }
  }
}