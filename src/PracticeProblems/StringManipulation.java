package PracticeProblems;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here selenium";
		String str1= "The rains Have started here selenium";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));  // 1st occurence of s
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1)); //2nd occurence of s 
		
		System.out.println(str.indexOf('s',str.indexOf('s')+8)); //3rd  occurence of s 
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello")); //-1
		
		// string comparision
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		// substring
		System.out.println(str.substring(0, 9));
		
		// trim : removes the before space and after space in a given string
		String s = "  Hello World  ";
		System.out.println(s.trim());
	
        System.out.println(s.replace(" ", ""));
        		
		String date="01-01-2020";
		System.out.println(date.replace("-", "/"));
		
		
		
		//split:
		String test = "Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		
		//concat
		String s5= "Aajay";
		System.out.println(s5.concat(" Kumar Dinne"));
		
		String x= "Hello";
		String y= "World";
		int a = 40;
		int b = 50;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
	}

}
