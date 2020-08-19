import java.util.Scanner;
public class NameRepeat{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String userName = keyboard.nextLine();
		System.out.println("How many times should it be written?");
		int numTimes = keyboard.nextInt();
		names(numTimes, userName);
	}
	 public static void names(int numTimes, String userName){
		for(int i=1; i<=numTimes; i++){
			System.out.printf("\n%s", userName);
		}
  }
}