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
		
		System.out.println("enter your third number: ");
		int num3=scan.nextInt();
		
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is the biggest number");
			}
		}
		
		if(num2>num1)
		{
			if(num2>num3)
			{
				System.out.println(num2+" is the biggest number");
			}
		}
		
		if(num3>num1)
		{
			if(num3>num2)
			{
				System.out.println(num3+" is the biggest number");
			}
		}
		
		
		
		if(num1<num2)
		{
			if(num1<num3)
			{
				System.out.println(num1+" is the smallest number");
			}
		}
		
		if(num2<num1)
		{
			if(num2<num3)
			{
				System.out.println(num2+" is the smallest number");
			}
		}
		
		if(num3<num1)
		{
			if(num3<num2)
			{
				System.out.println(num3+" is the smallest number");
			}
		}
		
		
	
	}
}
