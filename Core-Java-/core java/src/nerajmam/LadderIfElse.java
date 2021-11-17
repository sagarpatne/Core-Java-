package nerajmam;

public class LadderIfElse {
public static void main(String[] args) {
	int marks=100;
	if( marks>500 )
	{
		System.out.println("you enter wrong information");
	}
	else if(marks>=400)
     {
		System.out.println("YOUR MARKS ARE "+marks+"/500 YOU GET A GRADE");
     }
	else if(marks>=300) {
		System.out.println("YOUR MARKS ARE "+marks+"/500 YOU GET B GRADE");
	}else if(marks>=200) {
		System.out.println("YOUR MARKS ARE "+marks+"/500 YOU GET C GRADE");	
	}else if(marks>=35) {
		System.out.println("YOUR MARKS ARE "+marks+"/500 YOU GET D GRADE");
	}else {
		System.out.println("YOUR MARKS ARE "+marks+ "/500 YOU ARE FAIL");
	}
}
}
