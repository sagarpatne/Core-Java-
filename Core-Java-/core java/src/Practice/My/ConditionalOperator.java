package Practice.My;

public class ConditionalOperator {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		
		int r=(a>b)?(a>c?a:c):(b>c?b:c);//10>20 false it mns b is greater
		// it goes here (b>c?b:c) 20>30 false c is greater so 30 will be ans
		System.out.println(r);
	}

}
