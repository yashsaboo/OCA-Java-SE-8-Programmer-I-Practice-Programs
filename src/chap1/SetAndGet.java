package chap1;

public class SetAndGet {
	int howMany;
	static int bro;
	char c;
	SetAndGet()
	{
		//SetAndGet obj = new SetAndGet();
		System.out.println(c);
		bro  = howMany = 10;
	}
	
	void add()
	{
		String arr[] = {"a"};
		main(arr);
	}
	
	public static void main(String args[])
	{
		SetAndGet obj = new SetAndGet();
		obj.howMany=1; //Setting a value
		
		//System.out.println("without Object = "+howMany); //shows error
		System.out.println("with Object = "+obj.howMany); //Getting a value
		//obj.add();
	}
}

