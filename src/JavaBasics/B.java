package JavaBasics;

public class B extends A{

	public B() {
		// super keyword is used to call the parent class constructor.
		// it call be called only once inside the constructor and should be the first statement.
		super();
	}
	
	public B(int i) {
		super(i);
		
	}
	
	public B(int i, int j) {
		super(i,j);
	}
	
	public static void main(String[] args) {
       B  obj = new B();
       B obj1 = new B(10);
       B obj2 = new B(40,60);


	}

}
