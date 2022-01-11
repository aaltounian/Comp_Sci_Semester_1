import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner scan=new Scanner(System.in);

	System.out.println("what is your name: ");
	String name=scan.nextLine();
	
	System.out.println("how many times do you want it outputted: ");
	int num=scan.nextInt();

	int a;
	a=1;
	while(true)
	{
		System.out.println(name);
		if(a==num)
		{
			break;
		}
		a = a + 1;
	}	
		
	}
}
