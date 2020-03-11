package listCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Iterationtest {
	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("First");

		arl.add("Second");

		arl.add("Third");

		arl.add("Fourth ");

		System.out.println("Actual ArralList.." + arl);

		List lt = arl.subList(2, 4);

		System.out.println("\n Sub List" + lt);

	}
}
