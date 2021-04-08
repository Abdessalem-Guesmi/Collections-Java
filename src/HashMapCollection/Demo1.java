package HashMapCollection;

import java.util.HashMap;

public class Demo1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		// adding
		hm.put(1, "Tiger");
		hm.put(2, "Lion");
		hm.put(3, "Cat");
		hm.put(4, "Dog");
		System.out.println(hm);// {1=Teger, 2=Lion, 3=Cat, 4=Dog}

		System.out.println("number of element in hm: " + hm.size()); // 4
		System.out.println(hm.get(1)); // Tiger
		System.out.println(hm.entrySet()); // [1=Tiger, 2=Lion, 3=Cat, 4=Dog]
	}
}
