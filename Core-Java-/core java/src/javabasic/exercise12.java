package javabasic;
// wap to find whether the given nember is palindrome or not
// 121=121 reverse is same so its palindrome .... 152=251 reverse not same not palindrome
public class exercise12 {
	public static void main(String[] args) {
		
		int n=122;
		int c,r,s=0;
		
		c=n;
		while(n>0) {
			
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("number is palindrome");
			
		}else {
			System.out.println("number is not palindrome");
		}
	}

}
