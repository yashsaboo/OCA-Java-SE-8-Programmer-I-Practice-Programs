package chap4;

public class staticInitializer {
	
	public int Int;
	public final int FinalInt;
	public static int staticInt;
	public static final int staticFinalInt;
	
	{
		Int = 5;
		FinalInt = 6;
		staticInt = 3;
		//staticFinalInt = 4; //Can't Access
	}
	
	static
	{
		//Int = 5; Can't Access
		//FinalInt = 6; Can't Access
		staticInt = 3;
		staticFinalInt = 4;
	}
	

	public staticInitializer() {
		
		Int = 5;
		//FinalInt = 6; Already Assigned
		staticInt = 3;
		//staticFinalInt = 4; Can't Access
		
	}

	public static void main(String[] args) {
		
		//Int = 5; Can't Access 
		//FinalInt = 6; Can't access
		staticInt = 3;
		//staticFinalInt = 4; Can't assign a value here. Can only be done in tatic intializer

	}

}
