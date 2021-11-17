package javabasic;
//write a program to reverse digit of a given number
public class exercise5 {
public static void main(String[] args) {
	int n=1234,r;
	
	while (n>0) {
		r=n%10;
		System.out.print(r);
		n=n/10;
		
		
	}
	}
}
