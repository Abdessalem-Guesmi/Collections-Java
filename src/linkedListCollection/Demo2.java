package linkedListCollection;

import java.util.LinkedList;

public class Demo2 {
	public static void main(String[] args) {
		LinkedList ld = new LinkedList<>();
		ld.add('A');
		ld.add('D');
		ld.add('S');
		ld.add('R');
		System.out.println(ld); // [A, D, S, R]
		ld.addFirst("first element"); // [first element, A, D, S, R]
		System.out.println(ld);
		ld.addLast("last element"); // [first element, A, D, S, R, last element]
		System.out.println(ld);
		System.out.println(ld.getFirst()); // first element
		System.out.println(ld.getLast()); // last element

	}

}
