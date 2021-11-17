package javabasic;

//wap to find whether the given number is armstrong or not
// 186=(1*1*1)+(8*8*8)+(6*6*6)=186

public class exercise10 {
 public static void main(String[] args) {
	 
	 int n=186,r,sum=0;
     int temp=n;
     
	while(n>0) { 
	 r=n%10;
	 n=n/10;
	 sum=sum+r*r*r;
	}
	
	if (temp==sum) {
	System.out.println("THIS IS ARMSTRONG NUMBER");
	}
	else {
		System.out.println("THIS IS NOT ARMSTRONG NUMBER");
	}
	
 }
 
}
