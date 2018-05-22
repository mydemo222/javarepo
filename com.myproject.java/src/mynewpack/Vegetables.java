package mynewpack;

public class Vegetables {
	
	 static int x=5;
	 
	 
	 Vegetables () {
		 System.out.println("I am constructor");
	 }
	 
	
	 Vegetables (int x) {
		 System.out.println("I am constructor"+x);
	 }
	 
	 
	
public static void main(String[] args) {
	met1(x);
	Vegetables v1 = new Vegetables(20);
	

}
public static void met1(int x)
{
int y=met2(x);	
System.out.println(y);
}




public static int met2(int x)
{

	return x*x;
}
}

