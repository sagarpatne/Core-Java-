package nerajmam;

public class TestSwitch {
	public static void main(String[] args) {
		int length =args.length;
		switch(length) {
		case 0:
		System.out.println("case 0");
		System.out.println("Hello To Name");
		break;
		case 1:
		System.out.println("case 1");
		System.out.println("Hello"+args[0]);
		break;
		default:
			for(int i=0;i<length;i++)
			{
				System.out.println("Hello "+args[i]);
			}
		}
		
	}

}
