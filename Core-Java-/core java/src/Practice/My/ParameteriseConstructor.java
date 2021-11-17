package Practice.My;

//PARAMETERIZED CONSTRUCTOR//
/* a constructor through which we can pass one or more parameters is called
 * parameterize constructor
 */
class C {
	int x, y;

	C(int a, int b) //PARAMETERIZED CONSTRUCTOR
	{
		x = a;
		y = b;
	}

	C(int a, boolean b) {
		System.out.println(a + " " + b);
	}

	void show() {
		System.out.println(x + " " + y);
	}
}

public class ParameteriseConstructor {
	public static void main(String[] args) {
		C ref = new C(100, 200);// PARAMETERIZED CONSTRUCTOR
		ref.show();
		C r = new C(123, false);

	}

}
