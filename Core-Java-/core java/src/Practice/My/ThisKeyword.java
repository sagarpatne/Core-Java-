package Practice.My;
        		//THIS KEYWORD//
public class ThisKeyword {
	void show()
	{
		System.out.println(this);    //6th line and 11th line should show same 
								// answer then both gives same adress will be proved
	}
	public static void main(String[] args) {
		
		ThisKeyword r=new ThisKeyword();
		System.out.println(r);
		r.show();
	}

}
