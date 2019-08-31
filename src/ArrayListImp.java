import java.util.ArrayList;
import java.util.List;

public class ArrayListImp {
	
	

	public static void main(String[] args) {
		Candidate a = new Candidate(123, "Yash");
		List<Candidate> al = new ArrayList<Candidate>();
		
		al.add(a);
		System.out.println(al);
	}

}
