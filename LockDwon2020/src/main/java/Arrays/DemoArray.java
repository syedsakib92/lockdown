package Arrays;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		//store a set of homogeneous value		
				//integer array - allocating memory
				
				//declare an array
				int[] age;
				age = new int[3];
				
				//assign values to an array
				age[0]=7;
				age[1]=5;
				age[2]=2;
					
				System.out.println("2nd value of the array: "+age[1]);	
				
				age[1] = 12;
				
				for(int i=0; i<age.length; i++) {
					System.out.println("Age of index "+i+": "+age[i]);
				}
						
				//declare array by list of values
				
				int[] score = {98, 92, 78};
				
				System.out.println("2nd value of the array: "+score[1]);
				
				//String Array
				
				String[] names;
				names = new String[3];
				
				names[0] = "Mahbub";
				names[1] = "Tapan";
				names[2] = "Nazrul";
				
				System.out.println(Arrays.toString(names));
			
		

	}

}
