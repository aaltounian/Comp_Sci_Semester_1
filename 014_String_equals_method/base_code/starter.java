import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("would you like to be a warrior, rogue, or wizard: ");
		String a=scan.nextLine();
		
		if(a.equals("warrior"))
		{
			System.out.println("youve chosen warrior");
		}
		else if(a.equals("rogue"))
		{
			System.out.println("youve chosen rogue");
		}
		else if(a.equals("wizard"))
		{
			System.out.println("youve chosen wizard");
		}
		else
		{
			System.out.println("incorrect input");
		}
		
		
	}
}
