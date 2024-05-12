package conditionalstatements;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		float si;
		
		System.out.println("enter p");
		
		int p = sc.nextInt();
		
		System.out.println("enter t");
		
		float t = sc.nextFloat();
		
		
		System.out.println("enter r");
		
		float r = sc.nextFloat();
		
		
		if (p!=0  && t!=0 && r!=0)
		{
			 si=p*t*r/100;
			 
			 System.out.println("simple intrest is :"+si);
		}
		
		
		
		 sc.close();
	}
}
