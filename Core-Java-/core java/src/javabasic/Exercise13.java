package javabasic;
//wap to generate harmonic series
public class Exercise13 {
public static void main(String[] args)
{
	int num=10,i=1;
	double rst=0.0;
	
	while(i<=num){
		System.out.print("1/"+i+"+");
		rst=rst+(double)1/i;
		i++;
	} 
	System.out.println("\n\n sum of harmonic series is  "+rst);
	}
}
