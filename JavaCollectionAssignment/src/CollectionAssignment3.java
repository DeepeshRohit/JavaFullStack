import java.util.*;

public class CollectionAssignment3 {

	public static void main(String[] args) {
		//create hashmap
		HashMap < Integer,String> p=new HashMap< Integer, String >();
		//adding elements into hash
		p.put(1,"Dell");
		p.put(2,"Lenovo");
		p.put(3,"Realme");
		p.put(4,"Hp");
		p.put(5,"Samsung");
		p.put(6,"Redmi");
		p.put(7,"Acer");
		p.put(8,"Toshiba");
		p.put(9,"Apple");
		p.put(10,"Pixel");
		p.put(11,"Asus");

		System.out.println(p);

		//print the keys
		Set<Integer> s=p.keySet();
		System.out.println("keys are"+s);
		//print values
		Collection<String> c=p.values();
		System.out.println("Values are "+c);
//		print key value pairs 
		Set<?> s2=p.entrySet();
		System.out.println("key value pair sare"+s2);
	
	}
	
		
		
	
}