package Practice.My;
//COPY CONSTRUCTOR//

/* Whenever we pass object reference to the constructor then it is called
 * copy constructor
 */

class G {
	int x;
	String y;

	G(int a, String b)
	{
		x=a; y=b;
		System.out.println(x+" "+y);
	}

	G(G ref) // COPY CONSTRUCTOR SYNTAX
	{
		x = ref.x;
		y = ref.y;
System.out.println(x+" "+y);
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		G r=new G(10,"sagar");
		G r1=new G(r);

	}
}
