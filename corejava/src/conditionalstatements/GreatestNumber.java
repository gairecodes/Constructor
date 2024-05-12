package conditionalstatements;
import java.util.Scanner;

public class GreatestNumber {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number:");
		
		int num1 = sc.nextInt();
		
		System.out.println("enter second number:");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println("first number ie : "+num1+" is greater");
		}else {
			System.out.println("second number ie : "+num2+" is greater");
		}
		
		sc.close();
	}
	
	
}
