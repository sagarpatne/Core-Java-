package nerajmam;

//wap to add sub mul div of two numbers and vol of circle 
public class TestAdd {
	public static void main(String[] args) {

		int a = 10, b = 3, r = 6;
		double pi = 3.14;

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;

		double cv = pi * r * r;

		System.out.println("sum of " + a + " and " + b + " is = " + sum);
		System.out.println("substraction of " + a + " and " + b + " is = " + sub);
		System.out.println("multiplication of " + a + " and " + b + " is = " + mul);
		System.out.println("division of " + a + " and " + b + " is = " + div);
		System.out.println("volume of circle with radius " + r + " is = " + cv);

	}
}
