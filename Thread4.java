package n19April;
import java.util.*;
public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> m1 = new HashSet<Object>();
		m1.add(23);
		m1.add(23);
		m1.add("Hello");
		System.out.println(m1);
		
		LinkedHashSet<Object> m2 = new LinkedHashSet<Object>();
		m2.add(23);
		m2.add(23);
		m2.add("Hello");
		m2.add("Hero");
		System.out.println(m2);
		
		TreeSet<Object> t1 = new TreeSet<Object>();
		t1.add(23);
		t1.add(2);
		t1.add(57);
		System.out.println(t1);
		
		
		

	}

}
