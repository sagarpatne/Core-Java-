package javabasic;
//w.a.p to find sum of all integers greater than 100 n less than 200 that are 
//divisible by 7
public class exercise7 {
 public static void main(String[] args) {
	int sum=0, count=0;
	
	for(int i=101;i<200;i++) {
	         if (i%7==0) {
	        	 
	        	 sum=sum+i;
	        	 count++;
				
			}
		
	}System.out.println("sum is "+sum);
	System.out.println("count is "+count);
}
}
