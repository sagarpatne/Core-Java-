package javabasic;

public class swichdemo {
public static void main(String[] args) {
	int a=20, b=10;
	
	int calculator=0;
	 
	switch(calculator) {
	case 0:
	  System.out.println(a+b);
	break;
	case 1:
	 System.out.println(a-b);
	break;
	case 2:
		System.out.println(a*b);
	break;	
	case 3:
	    System.out.println(a/b);
	break;
    default:
       System.out.println("enter valid number");
	
	}
}
}
