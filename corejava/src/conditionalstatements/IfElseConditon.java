package conditionalstatements;
import java.util.Scanner;
public class IfElseConditon {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any number:");
		
		int num = sc.nextInt();
		
		if (num %2==0)
		{
			System.out.println("number:\t"+num+"is an even number");
		}else {
			System.out.println("number"+num+"is a odd number");
		}
		
		sc.close();
	}
		
		
		
	}
		
			
			
			
			
			
