package javabasic;

public class switchc {
public static void main(String[] args) {
	int day=1;
	String dayString=null;
	switch(day) {
	case 0:
	dayString="Sunday";
	break;
	case 1:
		dayString="Monday";
	break;
	default:
		dayString="This day is yet to come,pl wait!!";
	
	}
	System.out.println(dayString);
}
}
