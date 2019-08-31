//Different Class; Same Package; No Inheritance

package Access1;

public class DifferentClassSamePackage2 {
	
	public DifferentClassSamePackage2() {

	}
	
	public static void main(String args[])
	{
		DifferentClassSamePackage1 obj = new DifferentClassSamePackage1();
		//System.out.println("A = "+obj.a); Not Accesible\\
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
	}
}
