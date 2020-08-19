import java.util.Scanner;
public class Values{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a new number, or -999 to quit: ");
		int number = keyboard.nextInt();
		int total = 0;
    int max;
    int min;
    int count = 0;
    double average = 0;
		if(number!=-999){
			max = number;
			min = number;
		}
    else{
      max = 0;
      min = 0;
    }
		while(number !=-999){
      count++;
			total = total + number;
			if(number>max){max=number;}
			if(number<min){min=number;}
			System.out.println("Input a new number, or -999 to quit: ");
			number = keyboard.nextInt();
		}
    average = (double)total/count;
		System.out.printf("The max is %d, the minimum is %d, the sum is %d, and the average is %.2f", max, min, total, average);
	}
}
