package datatype;
import java.util.Scanner;
public class InputProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter principal:");
		int p = Integer.parseInt(sc.nextLine()) ;//integerlai as a string liyera ni type cast garna milxa
		
		System.out.println("enter time:");
		int t = sc.nextInt();
		
		System.out.println("enter rate:");
		float r = sc.nextFloat();
		
		float si = p*t*r/100;
		
		System.out.println("simple intrest is\t"+si);
		
		 sc.close();
	}
  
}
