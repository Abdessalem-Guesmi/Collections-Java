package linkedListCollection;

import java.util.Collections;
import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList ld = new LinkedList<>();
		ld.add('A');
		ld.add('D');
		ld.add('S');
		ld.add('R');
		System.out.println(ld); // [A, D, S, R]
		ld.set(0, 'F');
		System.out.println(ld); // [F, D, S, R]
		ld.remove(3);
		System.out.println(ld); // [F, D, S]
		Collections.sort(ld);
		System.out.println(ld); // [D, F, S]
		Collections.sort(ld, Collections.reverseOrder());
		System.out.println(ld); // [S, F, D]

		Collections.shuffle(ld);
		System.out.println("elements in arrayList after shuufing: " + ld); // [S, D, F]

	}

}
