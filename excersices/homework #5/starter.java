import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner scan=new Scanner(System.in);
		Random r=new Random();
		
		int money=100;
		
		while(money>0){
			System.out.println("would you like to play?");
			String answer=scan.nextLine();
			
			if(answer.equals("Yes")||answer.equals("yes")||answer.equals("Y")||answer.equals("y")){
				
				System.out.println("how much money would you like to wager: ");
				int wager=scan.nextInt();
				scan.nextLine();
				int slot1=r.nextInt(10);
				int slot2=r.nextInt(10);
				int slot3=r.nextInt(10);
				System.out.println("your slots are: ");
				System.out.println(slot1+(" | ")+slot2+(" | ")+slot3);
				
				if(slot1==slot2){
					if(slot2==slot3){
						System.out.println("");
						money=money-10;
						money=wager*3;
						System.out.println("you have $"+money);
					}
				}
				
				else if(slot1==slot2){
					System.out.println("");
					money=money-10;
					money=wager*2;
					System.out.println("you have $"+money);
				}
				
				else if(slot2==slot3){
					System.out.println("");
					money=wager*2;
					System.out.println("you have $"+money);
				}
				
				else if(slot3==slot1){
					System.out.println("");
					money=wager*2;
					System.out.println("you have $"+money);
				}
				
				else{
					System.out.println("");
					money=money-wager;
					System.out.println("you have $"+money);
				}
			}
			
			else if(answer.equals("No")||answer.equals("no")||answer.equals("N")||answer.equals("n")){
				System.out.println("");
				System.out.println("you have $"+money);
				break;
			}
			
			else{
				System.out.println("invalid input");
			 	break;
			}
		}
		


		
	}
}
