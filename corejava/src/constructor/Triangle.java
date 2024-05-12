package constructor;

public class Triangle {
	int a;
	int b;
	int h;
	Triangle(){
		a=3;
		b=4;
		h=5;
	}
	
	
   void displayInfo() {
	   System.out.println("area of triangle is "+0.5*b*h);
	   System.out.println("perimeter of triangle is "+a+b+h);
   }
	
	
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.displayInfo();
	}
}
