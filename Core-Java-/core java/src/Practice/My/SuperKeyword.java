package Practice.My;

/* SUPER KEYWORD 
condition 1] IF THE VARIABLE IS SAME I.E 'a=10 a=20' variable
condition 2] IF THE METHOD IS SAME THAT IS SHOW()
condition 3] IF USE CONSTRUCTOR 
*/
class AA {
	// int a = 10;                            // condition 1 if variable is same
//	void show()                               //condition 2
//	{                                         //condition 2
//		System.out.println("this is sagar"); //condition 2
//	}                                        //condition 2
	
	AA()										//condition 3
	{
		System.out.println("this is sagar1");   //condition 3
	}											//condition 3
}

class BB extends AA {
	// int a = 20; // conditon 1

//	void show() {             //condition 1 and 2
//		System.out.println(a); // condition 1
//		System.out.println(super.a);// condition 1 calling int a=10 in class AA using super keyword
		// System.out.println("this is patne"); //condition 2
		// super.show();// condition 2 ....calling show() of class AA using super keyword
    
	BB()                                        //condition 3
	{   super();								//condition 3
		System.out.println("this is patne1");   //condition 3
	}                                           //condition 3
	}



public class SuperKeyword {
	public static void main(String[] args) {

		BB r = new BB();
		//r.show();         //condition 1 and 2
	}

}
