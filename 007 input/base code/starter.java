import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("what is your first name: ");
		String name=scan.nextLine();
		
		System.out.println("how old are you: ");
		int age=scan.nextInt();
		
		System.out.println("what is your bday month (1-12): ");
		int bmonth=scan.nextInt();
		
		System.out.println("what is your bday day (1-31): ");
		int bday=scan.nextInt();
		
		System.out.println("what year were you born: ");
		int byear=scan.nextInt();
		
		System.out.println("how much is a buck fifty: ");
		double buck=scan.nextDouble();
		
		System.out.println("");
		System.out.println("");
		System.out.println("Your name is "+name+". You are "+age+" years old. Your bday month is "+bmonth+". Your bday day is "+bday+". You were born in the year "+byear+". A buck fifty is $"+buck+". ");

		
	}
}
