package nerajmam;
/* WAP TO generate 5 random numbers between 100 and 200*/
public class RandomNumber {
	public static void main(String[] args) {
	 int min=100,max=200;
	 for (int i=1; i<=5; i++)
	 {
		 int random=(int)((Math.random()*(max-min)+min));
		 System.out.println(random);
	 }
	}

}
