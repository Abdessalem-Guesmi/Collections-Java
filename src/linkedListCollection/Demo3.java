package linkedListCollection;

import java.util.LinkedList;

public class Demo3 {
	public static void main(String[] args) {
		LinkedList ld = new LinkedList<>();
		ld.add('A');
		ld.add('D');
		ld.add('S');
		ld.add('R');
		System.out.println(ld); // [A, D, S, R]
		System.out.println(ld.offer("X"));// return true
		System.out.println("list of elements after adding x in tail " + ld); // [A, D, S, R, X]
		LinkedList ld2 = new LinkedList<>();
		ld2.addAll(ld);
		System.out.println(ld2); // [A, D, S, R]
		System.out.println("element before removing " + ld2.element()); // A
		System.out.println("peek before removing " + ld2.peek());// A
		System.out.println("poll before removing " + ld2.poll()); // A
		// System.out.println(ld2.);
		ld2.removeAll(ld);
		System.out.println(ld2); // []
		System.out.println("element after removing " + ld2.element()); // exception
		System.out.println("peek after removing " + ld2.peek()); // exception
		System.out.println("poll after removing " + ld2.poll()); // exception

	}

}
