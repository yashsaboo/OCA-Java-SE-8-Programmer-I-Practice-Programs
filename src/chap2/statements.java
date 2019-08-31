package chap2;
import static chap4.staticImport.staticInt;
public class statements {
	
	public static void call(int... s)
	{
		return;
	}
	
	public static void main(String args[])
	{
		int x[] = new int[3];
		for(int i : x)
		{
			System.out.println(i);
		}
		
		//static import
		call();
		staticInt=2;
		
		try
		{
			int d;
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			
		}
	}
	
}
