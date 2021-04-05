package Arrays;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
	
		
		
		ArrayList<Integer>age=new ArrayList<Integer>();
		
		age.add(7);
		age.add(12);
		age.add(25);
		age.add(9);
		
		System.out.println(age.get(2));

		age.remove(2);
		age.add(100);
		
		System.out.println(age.get(2));
		
		age.add(1,346);
		System.out.println(age.get(1));
		
		System.out.println("Length of the ArrayList is:" +age.size());
		
	}
	
	

}
