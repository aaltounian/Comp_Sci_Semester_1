import java.util.Scanner;
import java.util.Random;


class character{
	String c=new String("warrior");
	String stat1=new String("strength: 5");
	String stat2=new String("dexterity: 5");
	String stat3=new String("intelligence: 5");
	String stat4=new String("constitution: 5");
	String stat5=new String("charisma: 5");
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		character myC=new character();
		System.out.println(myC.c);
		
		System.out.println(myC.stat1);
		System.out.println(myC.stat2);
		System.out.println(myC.stat3);
		System.out.println(myC.stat4);
		System.out.println(myC.stat5);
		
	}
}
