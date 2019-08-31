package AboutStatic;

public class A {
	int instanceVariable = 3;
	static int staticVariable = 5;
	
	{ //Same Properties as Instance Method
		
		staticVariable = 5;
		new A().staticVariable = 31;
		A.staticVariable = 41;
		instanceVariable = 4;
		new A().instanceVariable = 30;
		// A.instanceVariable = 41; Not Possible

		staticMethod();
		new A().staticMethod();
		A.staticMethod();
		instanceMethod();
		new A().instanceMethod();
		// A.instanceMethod(); Not Possible
		
	}

	static { //Same properties as Static Method
		
		staticVariable = 5;
		new A().staticVariable = 31;
		A.staticVariable = 41;
		// instanceVariable = 4; Not Possible
		new A().instanceVariable = 30;
		// A.instanceVariable = 41; Not Possible

		staticMethod();
		new A().staticMethod();
		A.staticMethod();
		// instanceMethod(); Not Possible
		new A().instanceMethod();
		// A.instanceMethod(); Not Possible
		
	}

	/*
	 * public static A() { //Not Possible
	 * 
	 * }
	 */

	public void instanceMethod() {

		staticVariable = 5;
		new A().staticVariable = 31;
		A.staticVariable = 41;
		instanceVariable = 4;
		new A().instanceVariable = 30;
		// A.instanceVariable = 41; Not Possible

		staticMethod();
		new A().staticMethod();
		A.staticMethod();
		instanceMethod();
		new A().instanceMethod();
		// A.instanceMethod(); Not Possible

	}

	public static void staticMethod() {

		staticVariable = 5;
		new A().staticVariable = 31;
		A.staticVariable = 41;
		// instanceVariable = 4; Not Possible
		new A().instanceVariable = 30;
		// A.instanceVariable = 41; Not Possible

		staticMethod();
		new A().staticMethod();
		A.staticMethod();
		// instanceMethod(); Not Possible
		new A().instanceMethod();
		// A.instanceMethod(); Not Possible
	}

	public static void main(String args[]) {
		
		A a = null;
		a.instanceMethod(); //Will not give a NullPointerException because it just checks for the reference
		a.staticMethod(); //Same as above

	}

}
