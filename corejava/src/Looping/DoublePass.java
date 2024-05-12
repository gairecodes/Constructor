package Looping;
import java.util.Scanner;

public class DoublePass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter l ,b,h:");
		int l = sc.nextInt();
		int  b = sc.nextInt();
		int h =sc.nextInt();
		
		int area = findArea(l,b);
		
		System.out.println("area is "+area);
		
		findVol( area, h);
		
		
		
	}
	static int findArea(int a, int b) {
		return a*b;
	}
	
	static void findVol(int x,int y) {
		System.out.println("volume is "+x*y);
	}
}
