package Looping;
import java.util.Scanner;
public class RangePrimeCheck {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the startingRange:");
		int startingRange = sc.nextInt();
		
		System.out.println("enter the endingRange:");
		int endingRange = sc.nextInt();
		
	    int test=primeTester(startingRange, endingRange);
	    
	    if (test<2) {
	    	System.out.println(test+"is neither prime nor composite");
	    }
	
	
	sc.close();
	}
	
	
	
		
		public static int primeTester(int startingRange, int endingRange) {
			int[] arr = new int[endingRange];
			
			arr[0] = startingRange;
			arr[endingRange-1] = endingRange;
			int count=0,actualCount;
			
			if(endingRange-startingRange!=1) {
				for (int i=0; i<endingRange-1; i++) {
					arr[i+1] = startingRange+(i+1);
					count++;
			}
			
				
			}else {
				System.out.println("enter the correct range");
				System.exit(0);
			}
			 count =count-1;
			
			
			actualCount = count+2;
		    System.out.println("total number of values in this range is :"+actualCount);
		    
		    
		    //displaying array elements
		    System.out.println("elements in this array are:");
		    for (int num: arr) {
		    	System.out.println(num);
		    }
			
			
			
			
			for(int i=0; i<actualCount; i++) {
				
				
				for (int j=2 ; j<arr[i]; j++) {
					
					
				if(arr[i]>2) {
					if (arr[i]==2) {
						System.out.println(arr[i]+"is a prime number");
						continue;
						}
					
					
					if(arr[i]<2) {
						System.out.println(arr[i]+"is neither ");
						continue;
					}
					
						if(arr[i]%j==0) {
								System.out.println(arr[i]+"is a not prime number");
								}else {
									System.out.println(arr[i]+"is a  prime number");
								}
				        }
				
			}
				
			}
			return 0;
		}
}
		


	
	
		
	
	
		
	