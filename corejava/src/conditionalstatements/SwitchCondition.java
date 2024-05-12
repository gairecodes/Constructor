package conditionalstatements;
import java.util.Scanner;
public class SwitchCondition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the symbol of addtion,multiplication,subtraction and divide");
		 char symbol = sc.nextLine().charAt(0);
		 
		 System.out.println("enter the two numbers for the operation between them");
		 
		 int num1 = sc.nextInt();
		 int num2= sc.nextInt();
		 
		 
		 
			 switch (symbol){
			 
			 case '+':
				 System.out.println("their additon is :"+num1+num2);
				 break;
				 
			 case '*':
				 System.out.println("their multiplication is :"+num1+num2);
				 break; 
				 
				 
			 case '-':
				 System.out.println("their subtraction is :"+num1+num2);
				 break; 
				 
				 
			 case '/':
				 System.out.println("their multiplication is :"+num1+num2);
				 break; 
				 
				 
				default:
					
				System.out.println("please select the right operator");
				 
			 }
		 
		
		
	    
	}

}
