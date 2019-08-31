package chap3;
public class StringImmutability {
	public static void main(String args[])
	{
		String a = "a";
		a = a.concat("b");
		a.concat("c");
		System.out.println(a);
	}
}
