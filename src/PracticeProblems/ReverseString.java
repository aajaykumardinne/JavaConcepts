package PracticeProblems;

public class ReverseString {

	public static void main(String[] args) {

		
		// Reverse a String :
		// diff between String and Stringbuffer: 
		// String is immutable and Stringbuffer is mutable
		// Reverse function is available in string buffer not present in string .s
		// do we have reverse function in string???: No
       String s = "Selenium";
       
       // 1. using for loop 
       int len = s.length(); //8
       String rev = "";
       
       for(int i=len-1 ; i>=0; i--) {
    	   rev = rev + s.charAt(i); //muineleS
    	  
       }
       
       
       System.out.println(rev);

       
       // 2. Using StringBuffer Class
       StringBuffer sb = new StringBuffer(s);
       System.out.println(sb.reverse());
       
       
	}
}
