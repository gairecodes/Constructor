package Looping;
import java.util.Scanner;

public class PrimeorNot {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int num;
	 
	 
	 System.out.println("enter the number you want to check:");
	 num = sc.nextInt();
	 
	 
	 if(num==1) {
		 System.out.println("number"+num+"is  neither prime number nor composite");
		System.exit(0);
	 }
	 
	 
	 for(int i=12; i<= 90; i++ ) {
	 
	    int flag = FlagTester(i);
	    
	    if (flag == 1) {
			 System.out.println("number"+i+"is  prime");
	    }
//		 }else {
//			 System.out.println("number"+i+"is prime");
//		 }
	 }
	 
	sc.close(); 
	
}
  
  
  public static int FlagTester(int num) {
	    for (int i = 2; i < num; i++) {
	        if (num % i == 0) {  
	        	
	            return 0; // If num is divisible by any number between 2 and num-1, return 0 (not prime)
	        }
	    }
	    return 1; // If num is not divisible by any number between 2 and num-1, return 1 (prime)
	}
}





	 
	 

