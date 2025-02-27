import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {
		ArrayList<Double> thisThing = createArrayList(new double[]{0.2, 2.4, 4.6, 6.8});
		for (int i = 0; i < thisThing.size(); i++) {
			System.out.println(thisThing.get(i));
		}
	}

	public static void swap(ArrayList<String> thisList, int i1, int i2) {
		String middleman = thisList.get(i1);
		thisList.set(i1, thisList.get(i2));
		thisList.set(i2, middleman);
	}
	
	public static ArrayList<Double> createArrayList(double[] array) {
		ArrayList<Double> arraylist = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			arraylist.add(array[i]);
		}
		
		return arraylist;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> newHashmap = new HashMap<>();

		for (int i = 0; i < ages.length; i++) {
			newHashmap.put(names[i], ages[i]);
		}

		return newHashmap;
	}

	public static void increaseAge(HashMap<String, Integer> namesAndAges, String name) {
		namesAndAges.put(name, namesAndAges.get(name) + 1);
	}
}


/*

# Instructions  

  ## Questions
1. Create a function called _swap()_. It takes in an ArrayList of Strings and two integers as parameters.  Swap the two elements in the ArrayList at the indexes of the given integers.

2. Create a fucntion called _createArrayList()_. It takes in an Array of doubles and returns an ArrayList of the same doubles.

3. Create a function called _combineParallelArrays()_.  It takes in two arrays that are parallel as parameters, a String array of names and a integer array of ages.
   Combine the two together in a hashmap with the names as keys and ages as definitions.  Return the HashMap.

4. Create a function called _increaseAge()_.  It takes in a HashMap(String, Integer) and a String (name) as parameters.  Increase the age (values) associated with the name by one.

*/