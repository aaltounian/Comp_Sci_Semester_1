import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scan=new Scanner(System.in);
		System.out.print("choose a number 1-100: ");
		int guess=scan.nextInt();
		
		if(guess==50)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
		}
	}
}
