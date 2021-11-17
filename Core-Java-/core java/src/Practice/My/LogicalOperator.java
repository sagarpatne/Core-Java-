package Practice.My;

public class LogicalOperator {
	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println(a==b && a!=b); //10==20 false both condition should complete
		System.out.println(a==b || a!=b); //10==20 || 10not equal to 20 any one condition should true
		System.out.println(!(a>b));       //10==20 false but not(10==20) so ans is true
	}

}
