package _01_array_manipulation;

import java.util.ArrayList;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		testArray[i] = j;
		System.out.println(i + ", " + j);
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
	String[] insert = orderedArray;
	boolean swap = false;
	do {
	for (int i = 0; i < insert.length-1; i++) {
		if (insert[i].compareTo(string ) > 0) {
			swap = true;
			String temp = insert[i];
			insert[i] = string;
			string = temp;
		}
	}
	}while(swap);

for (int i = 0; i < insert.length; i++) {
	System.out.println(insert);
}	
	
	return insert;
	}

}
