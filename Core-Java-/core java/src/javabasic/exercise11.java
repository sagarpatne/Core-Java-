package javabasic;
//wap to find whether given number is prime or not.
public class exercise11 {
public static void main(String[] args) {
    	
	int n=10;
	int count=0;
	
	for(int i=1; i<=n; i++) {
		
		if(n%i==0) {
			count++;
		}}
		if(count==2) {
			
			System.out.println("number is prime number");
		}
		else {
			System.out.println("number is not prime number");
		}
	
}
}
