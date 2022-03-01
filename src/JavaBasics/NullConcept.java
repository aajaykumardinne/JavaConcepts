package JavaBasics;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {


		// 1. Case sensitive
		// Object obj = null;
		
		
		// 2. default ref value will be null
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);

		
		// 3. int is the primitive data type
		// Integer is the class
//		Integer i = null;
//		int j = i;
		
		// 4.instanceof
		
		Integer i = null;
		Integer j = 10;
		
		System.out.println(i instanceof Integer);
		System.out.println(j instanceof Integer);
		
		// 5. static and non static 
		NullConcept obj = null;
//		obj.send();
		obj.sum();
		
		// 6.== and !=
		System.out.println(null == null);
		System.out.println(null != null);
		
		// 
		String str = null;
		Integer i1 = null;
		Double d1 = null;
		
		String s2 = (String) null;
		System.out.println(s2 +"123");
//		System.out.println(s2.length());
		
//		System.out.println(s2.charAt(0));
		
		
		Integer i2 = (Integer)null;
		Double d2 = (Double)null;
		
		
		
	}
	
	
	public static void sum() {
		System.out.println("sum...");
	}
	
	public void send() {
		System.out.println("send ...");
	}

}
