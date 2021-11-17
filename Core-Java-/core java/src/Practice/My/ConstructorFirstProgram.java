package Practice.My;
class B
{

	int a;
	String name; // instance variable

	B() {
		a = 200;
		name = "sagar";
	}

	void show() {
		System.out.println(a + " " + name);
	}
}
	 
	public class ConstructorFirstProgram {
		public static void main(String[] args) {

			B ref = new B();// object created
			ref.show();
		}

	}

