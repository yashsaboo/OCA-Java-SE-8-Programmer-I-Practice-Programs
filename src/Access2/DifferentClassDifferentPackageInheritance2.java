package Access2;

import Access1.DifferentClassDifferentPackageInheritance1;

public class DifferentClassDifferentPackageInheritance2 extends  DifferentClassDifferentPackageInheritance1{

	private int a2;
	int b2;
	protected int c2;
	public int d2;
	
	public DifferentClassDifferentPackageInheritance2() {
		a2=1;
		b2=2;
		c2=3;
		d2=4;
	}

	public static void main(String args[])
	{
		DifferentClassDifferentPackageInheritance2 obj = new DifferentClassDifferentPackageInheritance2();
		//System.out.println("A = "+obj.a);
		//System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
		System.out.println("A2 = "+obj.a2);
		System.out.println("B2 = "+obj.b2);
		System.out.println("C2 = "+obj.c2);
		System.out.println("D2 = "+obj.d2);
		
		/*DifferentClassDifferentPackageInheritance2 obj2 = new DifferentClassDifferentPackageInheritance1();
		System.out.println("A = "+obj2.a);
		System.out.println("B = "+obj2.b);
		System.out.println("C = "+obj2.c);
		System.out.println("D = "+obj2.d);
		System.out.println("A2 = "+obj2.a2);
		System.out.println("B2 = "+obj2.b2);
		System.out.println("C2 = "+obj2.c2);
		System.out.println("D2 = "+obj2.d2);*/
		
		DifferentClassDifferentPackageInheritance1 obj3 = new DifferentClassDifferentPackageInheritance1();
		//System.out.println("A = "+obj3.a);
		//System.out.println("B = "+obj3.b);
		//System.out.println("C = "+obj3.c);
		System.out.println("D = "+obj3.d);
		//System.out.println("A2 = "+obj3.a2);
		//System.out.println("B2 = "+obj3.b2);
		//System.out.println("C2 = "+obj3.c2);
		//System.out.println("D2 = "+obj3.d2);
		
		DifferentClassDifferentPackageInheritance1 obj4 = new DifferentClassDifferentPackageInheritance2();
		//System.out.println("A = "+obj4.a);
		//System.out.println("B = "+obj4.b);
		//System.out.println("C = "+obj4.c);
		System.out.println("D = "+obj4.d);
		//System.out.println("A2 = "+obj4.a2);
		//System.out.println("B2 = "+obj4.b2);
		//System.out.println("C2 = "+obj4.c2);
		//System.out.println("D2 = "+obj4.d2);
		
	}

}