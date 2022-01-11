import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your first number: ");
		int num1=scan.nextInt();
		
		System.out.println("enter your second number: ");
		int num2=scan.nextInt();
		
		
		if(num1!=num2)
		{
			System.out.println("the numbers are different");
		}
		
		if(num1==num2)
		{
			System.out.println("the numbers are the same");
		}
		
	}
}
