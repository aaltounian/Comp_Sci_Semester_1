import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a1){
		System.out.println(a1);
		return;
	}
	
	public static void toStringCombined(String a1, String a2){
		System.out.println(a1+" "+a2);
		return;
	}

	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner scan=new Scanner(System.in);
		System.out.println("write a sentence: ");
		String s1=scan.nextLine();
		
		System.out.println("write a sentence: ");
		String s2=scan.nextLine();
		
		System.out.println("");
		
		toString(s1);
		toStringCombined(s1, s2);
	}
}
