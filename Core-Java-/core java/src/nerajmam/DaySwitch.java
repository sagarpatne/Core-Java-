package nerajmam;

public class DaySwitch {
	public static void main(String[] args) {
		int day = args.length;

		switch (day) {
		case 0:
			System.out.println("MONDAY");
			System.out.println("MONDAY:  ");
			break;
		case 1:
			System.out.println("Tuesday");
			System.out.println("TUESDAY: " + args[0]);
			break;
		case 2:
			System.out.println("Wednesday");
			System.out.println("WEDNESDAY: " + args[1]);
			break;
		case 3:
			System.out.println("Thursday");
			System.out.println("THURSDAY: " + args[2]);
			break;
		case 4:
			System.out.println("Friday");
			System.out.println("FRIDAY: " + args[3]);
			break;
		case 5:
			System.out.println("Saturday");
			System.out.println("SATURDAY: " + args[4]);
			break;
		case 6:
			System.out.println("Sunday");
			System.out.println("SUNDAY: " + args[5]);
			break;
		default:
			for (int i = 0; i < day; i++) {
				System.out.println("ENTRY is invalid");
			}
		}

	}

}
