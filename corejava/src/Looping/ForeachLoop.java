package Looping;

public class ForeachLoop {
	
	public static void main(String[] args) {
		
		int[] values = {2424,24,242,424,256,5};
		int s=0;
		
		for (int hello : values) {
			
			s = s + hello;
			
			System.out.println(hello);
			
		}
		System.out.println("sum is ="+s);
		
	}
}
