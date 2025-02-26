import java.util.HashMap;
import java.util.ArrayList;

class Notes {
	public static void main(String[] args) {

		//AutoBoxing and Unboxing (Using Wrapper Classes)

		//change our primitive data types into non-primitive data types

		// Integer;
		// Boolean;
		// Character;
		// Double;

		//Creating ArrayLists (Uses Wrapper Classes not Primitive types)

		ArrayList<Integer> arrL = new ArrayList<Integer>(); //create an empty arraylist

		//use methods to access the arraylist, not array notation

		//add(value)

		arrL.add(3);

		//get(index)

		System.out.println(arrL.get(0));

		//set(index, value) - replaces the value of the given index with the value

		arrL.set(0, 5);
		System.out.println(arrL.get(0));

		//clear()

		arrL.clear(); //removes everything form the arrayList
	
		//size()

		System.out.println(arrL.size());

		//remove
		
		arrL.add(4);
		arrL.add(2);

		int a = 0;
		Integer b = 2;


		System.out.println(arrL);
		arrL.remove(a); //primitive type removes by index
		// arrL.remove(b); //non-primitive removes by value

		System.out.println(arrL);

		//Creating HashMap

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//create an empty HashMap

		//first data type -> keys
		//second data types -> values

		//keys must be unique
		//values do not have to be unique

		//add to a hashmap

		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 1);

		//Getting a Value from a HashMap -> access by key

		System.out.println(map.get("c")); //return to you the value at that key

		//remove a key and value from a hashmap -> remove on the key

		map.remove("d");

		//clearing a hashmap

		// map.clear();

		//size

		System.out.println(map.size());

		//print a hashmap

		System.out.println(map);

		//HashMap and parallel Arrays/ArrayLists

		//HashMap -> Unique keys, When the order doesn't matter, HashMap is going to be faster
		//Parallel Arrays/ArrayList -> Order Matters, More than 2 data types

	}
}
