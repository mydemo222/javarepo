package mypack;

public class Vehicle {
	
	static int var1 = 10;
	
	public static void main(String[] args) {
		myMethod();
	}
	
	public static void myMethod() {
		int var3 = myMet(20);
		System.out.println(var1+var3);
		
	}
	
	
	public static int myMet(int x) {
		
		return x*x;
	}
	
}


