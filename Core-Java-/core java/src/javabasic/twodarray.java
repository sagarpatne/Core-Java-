package javabasic;

public class twodarray {
	//
public static void main(String[] args) {
	int[][] a=new int[11][11];
	for (int i = 2; i < a.length; i++) {
		for (int j = 1; j < a[i].length; j++) {
			
			System.out.print(i*j+"\t");
		}System.out.println();
	}
}

}
