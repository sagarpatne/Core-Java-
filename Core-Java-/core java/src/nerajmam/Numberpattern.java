package nerajmam;

public class Numberpattern {
	public static void main(String[] args) {
		for (char row = 'A'; row <= 'E'; row++) {
			for (char col = 'A'; col <= row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}
}
