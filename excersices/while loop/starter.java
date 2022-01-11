import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner scan=new Scanner(System.in);

	System.out.println("choose a number: ");
	int num=scan.nextInt();
	
	System.out.println("");
	System.out.println("");
	
	int a;
	a=1;
	while(a<6)
	{
		System.out.println(num);
		num=num+1;
		a = a + 1;
	}	
		
	}
}
