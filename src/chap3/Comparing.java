package chap3;
public class Comparing {
	public static void main(String args[])
	{
		String a = "Hi";
		String b = "Hi";
		String c = new String("Hi");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));		
	}
}
