import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void pow(int a, int b){
		System.out.println(Math.pow(a, b));
		return;
	}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner scan=new Scanner(System.in);
		System.out.println("what is the number: ");
		int num1=scan.nextInt();
		
		System.out.println("what is the exponent: ");
		int num2=scan.nextInt();
		
		System.out.println("");
		
		pow(num1, num2);
		
	}
}
