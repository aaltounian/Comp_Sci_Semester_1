import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("whats your name: ");
		String name=scan.nextLine();
		System.out.println("");
		
		System.out.println("would you like to be a warrior, rogue, or wizard: ");
		String title=scan.nextLine();
		System.out.println("");
		
		int point=25;
		System.out.println("you have "+point+" points. Select how many points you want in each buff.");
		
		System.out.println("Strength - Buff and able to carry larger items (1-10 points) ");
		int bs=scan.nextInt();
		point=point-bs;
		System.out.println("you have "+point+" points left");
		
		System.out.println("select one buff: Dexterity - Agile and moves quick (1-10 points) ");
		int bd=scan.nextInt();
		point=point-bd;
		System.out.println("you have "+point+" points left");
		
		System.out.println("select one buff: Intelligence - Better at magic spells! (1-10 points) ");
		int bi=scan.nextInt();	
		point=point-bi;
		System.out.println("you have "+point+" points left");
		
		System.out.println("select one buff: Constitution - How much health (1-10 points) ");
		int bco=scan.nextInt();
		point=point-bco;
		System.out.println("you have "+point+" points left");
		
		System.out.println("select one buff: Charisma - How personable (1-10 points) ");
		int bch=scan.nextInt();
		point=point-bch;
		System.out.println("you have "+point+" points left");
		// if(bch>10)
		// {
		// 	System.out.println("too high of a value, input value 1-10");
		// }
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Your name is "+name+" and you are a "+title);
		System.out.println("");
		System.out.println("your stats are:");
		System.out.println("Strength: "+bs);
		System.out.println("Dexterity: "+bd);
		System.out.println("Intelligence: "+bi);
		System.out.println("Constitution: "+bco);
		System.out.println("Charisma: "+bch);
		
		
	}
}
