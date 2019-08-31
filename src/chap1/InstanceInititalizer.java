package chap1;

public class InstanceInititalizer {

	public InstanceInititalizer() {
		number=5;
	}
	
	public static void main(String args[])
	{
		System.out.println(""+new InstanceInititalizer().number);
	}
	
	int number;
	{number =4;}
}
