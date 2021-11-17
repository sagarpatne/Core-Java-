package javabasic;

public class excercise8 {
	public static void main(String[] args) {
// write a program to create and display 2 dimensional array that contains 
//tables from 2 to 10 (9 rows, 10 columns)		
	
	int[][] a=new int[11][11];
	
	for (int i = 2; i < a.length; i++) {
		for (int j = 1; j < a[i].length; j++) {
			
			System.out.print(i*j+"\t");
			
		}System.out.println();
	}
	
	
		
	}

}
