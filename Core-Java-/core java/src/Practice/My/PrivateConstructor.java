package Practice.My;
    //PRIVATE CONSTRUCTOR//
/* in java it is possible to write a constuctor as a private
 * but according to the rule we cannot access private member outside of class.
 */
public class PrivateConstructor {
	int a; double b; String c;
	private PrivateConstructor()
	{
	a=100; b=30.23; c="sagar";
	System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {     //main string is in same class
		PrivateConstructor ref=new PrivateConstructor();
		
	}
	
}


