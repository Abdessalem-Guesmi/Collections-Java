package arrayListCollection;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add('A');
		a.add(1);
		a.add(true);
		a.add("Tunisia");

		// print array list
		System.out.println(a); // [A, 1, true, Tunisia]

		// using for..each
		for (Object l : a) {
			System.out.println(l);
		}
		// remove 1 object
		a.remove(1);
		System.out.println("elements in arrayList after removing: " + a); // [A, true, Tunisia]
		ArrayList el = new ArrayList<>();
		el.add("Java");
		System.out.println("elements in arrayList after adding: " + el); // [Java]
		el.addAll(a);
		System.out.println("elements in arrayList after adding other arrayList: " + el); // [Java, A, true, Tunisia]
		el.get(0);
		System.out.println("elements in arrayList after getting: " + el); // [Java, A, true, Tunisia]
		el.set(0, "Angular");
		System.out.println("elements in arrayList after setting: " + el); // [Angular, A, true, Tunisia]
		el.removeAll(a);
		System.out.println(el); // [Angular]
		System.out.println(el.isEmpty()); // return false
	}

}
