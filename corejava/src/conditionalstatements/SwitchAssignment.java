package conditionalstatements;
import java.util.Scanner;
public class SwitchAssignment {
	
	public static void main(String[] args) {
Scanner sc	 = new Scanner(System.in);


		int salary;
		float bonus;
		
		
		while(true) {
		System.out.println("enter any post as mentioned\n1.MD\n2.CEO\n3.MANAGER\n4.HELPER");
		String post = sc.nextLine().toUpperCase(); //suruma ta string aauna paryo ni 
		
		
		switch(post) {
		
		case "MD":
			salary = 230000;
		    bonus = 20/100;
			System.out.println("total salary is "+(salary+salary*bonus));
			break;
			
			
			
		case "CEO":
			 salary = 250000;
			 bonus = 25.79f/100;
			 System.out.println("total salary is "+(salary+salary*bonus));
			 break;
			
			
			
			
		case "MANAGER":
			 salary = 176000;
			 bonus = 16/100;
			 System.out.println("total salary is "+(salary+salary*bonus));
			 break;
			
			
			
			
			
		case "HELPER":
			salary = 145900;
			 bonus = 9/100;
			 System.out.println("salary is "+(salary+salary*bonus));
			 break;
			
			
			
		
			
			
		 default:
			System.out.println("enter the right post as mentioned in menu");
			
			
		}
	}
	}
}


