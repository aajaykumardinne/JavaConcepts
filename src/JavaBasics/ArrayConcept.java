package JavaBasics;

public class ArrayConcept {

	// Revised
	public static void main(String[] args) {

		// array: to store similar data type values in a array variable

		// dis-advantages of array :
		// 1. size is fixed ---- static array -- To overcome this problem we use
		// Collections -- Array List , Hash Table -- use dynamic array
		// 2. Stores only similar data types --- To overcome this problem we use
		//Object array
		//

		// 1. int array
		// lowest bound/ index = 0;
		// upper bound/ index = n-1 (n is size of array)
		// one dimensional array

		int i[] = new int[4]; // or int[] i = new int[4]
//		int[] ar1;
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
//
//     	System.out.println(i[4]);  //ArrayIndexOutOfBoundsException

		System.out.println(i.length); // size or length of the array

		// print all the values of array: use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("**********");

		// 2. double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;

		System.out.println(d[2]);

		System.out.println("**********");

		// 3. char array
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 2;
		c[2] = '$';

		System.out.println(c[1]);

		System.out.println("**********");

		// 4. boolean array

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println("**********");

		// 5. String array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";

		System.out.println(s.length);
		System.out.println(s[2]);

		System.out.println("**********");

		// 6.Object Array(Object is a class) --- is used to store different data type
		// values
		Object ob[] = new Object[6];
		ob[0] = 'M';
		ob[1] = "Aajay";
		ob[2] = 25;
		ob[3] = 22.56;
		ob[4] = true;
		ob[5] = "Toronto";

		System.out.println(ob[5]);
		System.out.println(ob.length);

	}

}
