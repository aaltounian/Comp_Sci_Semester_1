import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner scan=new Scanner(System.in);
	Random r=new Random();
	
	int randnumber=r.nextInt(1000);

	while(true)
	{
		System.out.println("choose a number (0-999): ");
		int guess=scan.nextInt();
		
		if(guess>randnumber)
		{
			System.out.println("your guess was too high");
			System.out.println("");
		}
		
		if(guess<randnumber)
		{
			System.out.println("your guess was too low");
			System.out.println("");
		}
		
		if(guess==randnumber)
		{
			System.out.println("you guessed it");
			break;
		}
	}	

		
	}
}
