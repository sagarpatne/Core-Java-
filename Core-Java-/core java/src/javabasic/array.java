package javabasic;

public class array {

	public static void main(String[] args) {
	//	int[] table;
	//	table= new int[10];                       //type1
	 int[] table= new int[10];                    //type2
	//	int[] table= {2,4,6,8,10,12,14,16,18,20}; //type3

		table[0]=2;
		table[1]=4;
		table[2]=6;
		table[3]=8;
		table[4]=10;
		table[5]=12;
		table[6]=14;
		table[7]=16;
		table[8]=18;
		table[9]=20;

	for(int i=0; i<10; i++)
	{	
		System.out.println(table[i]);
	}
	
	
	}
}
