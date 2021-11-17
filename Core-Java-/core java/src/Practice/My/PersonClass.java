package Practice.My;
//class is virtual which has properties and behaviours ...we will see by example
public class PersonClass {
	int height=5;      //properties
	int weight=45;     //properties
	int age=25;    //properties
	String color="fair";//properties
	
	void eat() {   							//behaviour
		System.out.println("i am eating");
	}
	void sleep() {							//behaviour
		System.out.println("i am sleeping");
	}
public static void main(String[] args) {
	
	PersonClass p=new PersonClass();
	
	System.out.println(p.height);
	System.out.println(p.weight);
	System.out.println(p.color);
	System.out.println(p.age);
	p.eat();
	p.sleep();
}
}
