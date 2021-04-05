package Arrays;

import java.util.LinkedList;

public class DemoLinkList {

	public static void main(String[] args) {
		LinkedList<String> names= new LinkedList<String>();

		names.add("Jubayer");
		names.add("Rana");
		names.add("Maruf");
		System.out.println(names.get(1));
		
		System.out.println(names);
		
		
		LinkedList<Integer> score= new LinkedList<Integer>();
		
		score.add(100);
		score.add(98);
		score.add(99);
		System.out.println(score);
	}

}
