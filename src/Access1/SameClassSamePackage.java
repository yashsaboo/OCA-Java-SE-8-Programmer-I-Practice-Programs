//Same Class; Same Package; No Inheritance

package Access1;

public class SameClassSamePackage {
	
	private int a;
	int b;
	protected int c;
	public int d;
	
	public SameClassSamePackage() {
		a=1;
		b=2;
		c=3;
		d=4;
	}
	
	public static void main(String args[])
	{
		SameClassSamePackage obj = new SameClassSamePackage();
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
	}
}
