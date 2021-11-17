package javabasic;

//wap of sum mul div sub and volume of circle
public class TestAdd {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		double pi = 3.14;
		int r = 10;

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		double circlev = pi * r * r;
		
		System.out.println("sum of "+a+" and "+b+" is = "+sum);
		System.out.println("substraction of "+a+" and "+b+" is = "+sub);
		System.out.println("multiplication of "+a+" and "+b+" is = "+mul);
		System.out.println("division of "+a+" and "+b+" is = "+div);
		System.out.println("circle volume of radius "+r+" is = "+circlev);

	}

}
