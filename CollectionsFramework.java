package cop2805;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsFramework {
	
	// Method to print each element of the ArrayList using Iterator
	public static void PrintList(ArrayList<Double> list) {
		Iterator<Double> iterator = list.iterator();
			while (iterator.hasNext()) {
				Double element = iterator.next();
				System.out.println(element);
				}
}	
	public static void main(String[] args) {
		
			//ArrayList of Doubles
			ArrayList<Double> list = new ArrayList<>();
				list.add(1.5);
				list.add(2.35);
				list.add(-4.7);
				list.add(0.01);
				
				//PrintList method to print list
				System.out.println("Original List: ");
				PrintList(list);
				
				//List sorted by calling Collections.sort method
				Collections.sort(list);
				
				//PrintList method again 
				System.out.println("Sorted List: ");
				PrintList(list);
				
				//Calling Collections.binarySearch method to search the list for value 1.5
				int value = Collections.binarySearch(list,  1.5);
				System.out.println("Found 1.5 at index " + value);
				
				//Calling Collections.fill to zero out the list
				Collections.fill(list, 0.0);	
				
				//PrintList once more
				System.out.println("Zero List: ");
				PrintList(list);
			}
	}

