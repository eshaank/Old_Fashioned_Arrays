package _01_array_manipulation;

import java.sql.Array;

import _02_diy_array_list.ArrayList;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		testArray[i] = j;
		System.out.println(i + ", " + j);
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
	String[] Array = orderedArray;
	for (int i = 0; i < Array.length; i++) {
		System.out.println(Array[i]);
	}
	
	
	return orderedArray;
	}

}
