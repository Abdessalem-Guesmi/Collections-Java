package arrayListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(4);
		System.out.println(al); // [2, 3, 1, 5, 4]
		Collections.sort(al);
		System.out.println("element in arrayList after sorting: " + al); // [1, 2, 3, 4, 5]
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("element in arrayList after reversing: " + al); // [5, 4, 3, 2, 1]
		int numOfElement = al.size();
		System.out.println("the number of elements in array List: " + numOfElement); // 5

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // 5 4 3 2 1
		}
		Collections.shuffle(al);
		System.out.println("elements in arrayList after shuufing: " + al); // [2, 5, 1, 4, 3]

	}

}
