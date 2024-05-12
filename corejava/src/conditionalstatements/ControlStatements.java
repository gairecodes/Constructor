package conditionalstatements;
import java.util.Scanner;
public class ControlStatements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your salary");
		
		int salary = Integer.parseInt(sc.nextLine());
		
		if(salary <= 9000)
		{
			salary = salary + 9000;
		}
		
		
		System.out.println("total salary ="+salary);
	}
	
}
