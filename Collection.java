import java.util.*;
public class Collection {

	public static void main(String[] args) {
		
		HashSet<Integer>a1=new HashSet<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		if(a1.contains(1)) {
			System.out.println("it contains");
		}
		
		System.out.println(a1);
		
	}

}
