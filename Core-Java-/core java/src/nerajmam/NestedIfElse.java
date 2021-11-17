package nerajmam;

public class NestedIfElse {
public static void main(String[] args) {
	int pre=90,mains=89,merit=92;
	if(pre>=merit && pre<=100) {
		if(mains>=merit && mains<=100) {
			System.out.println("you are selected");
		}else {
			System.out.println("");
		}
	}
}
}
