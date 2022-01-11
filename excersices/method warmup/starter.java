import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void multi(int a, int b){
		System.out.println(a*b);
		int c=multi%3;
		if(c==0){
			return;
		}
		else{
			System.out.println("not divisible by 3");
			return;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("what is the number: ");
		int num1=scan.nextInt();
		
		System.out.println("what is the second number: ");
		int num2=scan.nextInt();
		
		System.out.println("");
		
		multi(num1, num2);
	
		
		
	}
}
