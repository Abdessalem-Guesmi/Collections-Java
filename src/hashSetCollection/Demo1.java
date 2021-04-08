package hashSetCollection;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("user1");
		hs.add(25);
		hs.add("user2");
		hs.add(35);
		hs.add("user3");
		hs.add(30);
		System.out.println(hs); // [user1, user2, 35, 25, user3, 30]
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(25);
		hs1.add(35);
		hs1.add(40);
		hs.addAll(hs1);

		// union
		System.out.println(hs); // [user1, user2, 35, 40, 25, user3, 30]
		hs.retainAll(hs1);
		// intersection
		System.out.println(hs); // [35, 40, 25]
		// subset
		hs.containsAll(hs1);
		System.out.println(hs); // [35, 40, 25]
	}

}
