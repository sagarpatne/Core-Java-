package nerajmam;
//wap to buy movie tickets according to your budget
public class MovieTicket {
	public static void main(String[] args) {
		
		int money=90;  //ENTER YOUR MONEY
		
		if(money>=500) {
			System.out.println("YOU CAN BUY GOLD MOVIE TICKET");
		}else if(money>=200)
		{
			System.out.println("YOU CAN BUY SILVER TICKET");
		}else if(money>=100) {
			System.out.println("YOU CAN BUY BALCONY TICKET");
		}else {
			System.out.println("SORRY! YOU DONT HAVE MONEY TO BUY TICKET");
		}
	}

}
