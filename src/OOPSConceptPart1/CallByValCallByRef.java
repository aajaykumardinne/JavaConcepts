package OOPSConceptPart1;

public class CallByValCallByRef {

	 int p;
	 int q;
	
	public static void main(String[] args) {
		
		CallByValCallByRef obj = new CallByValCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(10, 20); // call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		// after swaping
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}
	
	
	// call by reference : passing the value of the object reference variable.
	public void swap(CallByValCallByRef t) {
		
		int temp;
		temp = t.p; // temp = 50;
		t.p = t.q; // p = 60;
		t.q = temp; // q =50;
		
		
		
		
	}
}
