package Practice.My;
// DEFAULT CONSTRUCTOR ...WHICH HAS NO PARAMETER IS CALLED DEFAULT CONSTRUCTOR
 class A {
	 int a; String b; boolean c;
	 A()
	 {
	a=19; b="name"; c=true;	 
	 }
	 void Disp()
	 {
		 System.out.println(a+" "+b+" "+c);
	 }
	}
 class DefaultConstructor {
	 public static void main(String[] args) {
		A ref=new A();
		ref.Disp();
	}
 }
