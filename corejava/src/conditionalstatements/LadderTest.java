package conditionalstatements;
import java.util.Scanner;

public class LadderTest {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		
		if (marks>= 80) 
		{
			System.out.println("distinction");
		}
		
		else if (marks>=60) 
		{
		   System.out.println("first division");
		
	    }
		
		else if (marks>=45) 
		{
		   System.out.println("first division");
		
	    }
		
		
		else if (marks>=32) 
		{
		   System.out.println("first division");
		
	    }
		
		else {
			System.out.println("fail");
		}
}
}
