package Looping;
import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int t = sc.nextInt();
		float r = sc.nextFloat();
		
		
		
		input(p,t,r);
		
	}
	static void input(int p,int t,float r) {
		int x=p;
		int y=t;
		float z=r;
		float value = processing(x,y,z);
		output( value);
	}
	
	static float processing(int x,int y,float z) {
		float si= x*y*z/100;
		return si;
	}
	
	static void output(float si) {
		System.out.println("si is "+si);
	}
	
}
