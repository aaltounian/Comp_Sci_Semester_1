import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Random r=new Random();
		
		int r_num1=r.nextInt(10);
		System.out.println(r_num1);
		
		int r_num2=r.nextInt(100);
		r_num2=r_num2+1;
		System.out.println(r_num2);
		
		double r_num3=r.nextDouble();
		r_num3=r_num3+2.5;
		System.out.println(r_num3);
		
		double r_num4=r.nextDouble();
		int r_num5=r.nextInt(590);
		r_num4=r_num4+14+r_num5;
		System.out.println(r_num4);
		
		
	}
}
