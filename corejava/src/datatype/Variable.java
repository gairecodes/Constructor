package datatype;
import java.util.Scanner;
public class Variable {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter value of l:");
		  int l=sc.nextInt();
		 
		 System.out.println("enter value of b:");
		  int b=sc.nextInt();
		  
		  int area = l * b;
		  System.out.println("Area ="+area);
	}
}
