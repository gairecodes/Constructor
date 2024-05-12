package conditionalstatements;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter length");
		
		int area;
		
		int length = sc.nextInt();
		
		System.out.println("enter the breadth");
		int breadth = sc.nextInt();
		
		if (length!=0  && breadth!=0)
		{
			 area = length*breadth;
			 System.out.println("area is :"+area);
		}
		
		
		
		 sc.close();
	}
	 
}
