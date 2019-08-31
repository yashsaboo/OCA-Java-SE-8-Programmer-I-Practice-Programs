package Access1;

public class TryingAllOfThem {

	public TryingAllOfThem() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[])
	{
		DifferentClassSamePackage1 obj = new DifferentClassSamePackage1();
		//System.out.println("A = "+obj.a); Not Accesible\\
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
		
		DifferentClassSamePackageInheritance2 obj1 = new DifferentClassSamePackageInheritance2();
		//System.out.println("A = "+obj.a);
		System.out.println("B = "+obj1.b);
		System.out.println("C = "+obj1.c);
		System.out.println("D = "+obj1.d);
		//System.out.println("A2 = "+obj1.a2);Extra
		System.out.println("B2 = "+obj1.b2);
		System.out.println("C2 = "+obj1.c2);
		System.out.println("D2 = "+obj1.d2);
		
		/*DifferentClassSamePackageInheritance2 obj2 = new DifferentClassSamePackageInheritance1();
		System.out.println("A = "+obj2.a);
		System.out.println("B = "+obj2.b);
		System.out.println("C = "+obj2.c);
		System.out.println("D = "+obj2.d);
		System.out.println("A2 = "+obj2.a2);
		System.out.println("B2 = "+obj2.b2);
		System.out.println("C2 = "+obj2.c2);
		System.out.println("D2 = "+obj2.d2);*/
		
		DifferentClassSamePackageInheritance1 obj3 = new DifferentClassSamePackageInheritance1();
		//System.out.println("A = "+obj3.a);
		System.out.println("B = "+obj3.b);
		System.out.println("C = "+obj3.c);
		System.out.println("D = "+obj3.d);
		//System.out.println("A2 = "+obj3.a2);
		//System.out.println("B2 = "+obj3.b2);
		//System.out.println("C2 = "+obj3.c2);
		//System.out.println("D2 = "+obj3.d2);
		
		DifferentClassSamePackageInheritance1 obj4 = new DifferentClassSamePackageInheritance2();
		//System.out.println("A = "+obj4.a);
		System.out.println("B = "+obj4.b);
		System.out.println("C = "+obj4.c);
		System.out.println("D = "+obj4.d);
		//System.out.println("A2 = "+obj4.a2);
		//System.out.println("B2 = "+obj4.b2);
		//System.out.println("C2 = "+obj4.c2);
		//System.out.println("D2 = "+obj4.d2);
		
		SameClassSamePackage objj = new SameClassSamePackage();
		//System.out.println("A = "+objj.a);Extra
		System.out.println("B = "+objj.b);
		System.out.println("C = "+objj.c);
		System.out.println("D = "+objj.d);
	}

}
