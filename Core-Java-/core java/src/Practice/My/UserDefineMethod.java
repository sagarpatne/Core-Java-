package Practice.My;

public class UserDefineMethod {
	public static void main(String[] args) {
		int r = Sum(10, 20); // calling
		System.out.println("Addition " + r);

	}

	static int Sum(int a, int b) // user define method //definition
	{
		return a + b;

	}

}