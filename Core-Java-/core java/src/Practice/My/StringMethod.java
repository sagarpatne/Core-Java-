package Practice.My;

public class StringMethod {
	public static void main(String[] args) {
//	
//String str="sagar";
//System.out.println(str);
		String str = new String("sAgar");
		String str1 = new String("sAgar");

		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		if (str == str1) {  //compare only str n str1 not content sagar
			System.out.println("Both are equal");
		} else {
			System.out.println("not equal");
		}
      if(str.equals(str1)) {
    	  System.out.println("both are equalllll");//compare content in string 
      }else {
    	  System.out.println("not equal");
      }
	}

}
