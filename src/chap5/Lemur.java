package chap5;

public class Lemur extends Primate implements HasTail{

	public Lemur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isTailStriped() {
		return false;
	}
	
	public int age =10;
	
	public static void main(String args[])
	{
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		Primate primate = lemur;
		System.out.println(((Lemur)primate).age);
	}
	

}
