package javabasic;

//import java.util.Random;     //method 1

public class exercise3 {
//write a program to generate 5 random integer numbers between 1 to 100	
	public static void main(String[] args) {
//		Random r=new Random();                //method 1
	 for(int i=1; i<=5; i++) {
//		 System.out.println(r.nextInt(100));  //method 1
		 System.out.println(""+(int)(Math.random()*100)); //method 2
	 }
		
	}

}
