package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		testArray[i] = j;
		System.out.println(i + ", " + j);
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String[] insert = new String[orderedArray.length + 1];

		// for (int i = 0; i < insert.length -1; i++) {
		// for (int j = 0; j < insert.length; j++) {
		// if (orderedArray[i].compareTo(string) < 0) {
		// insert[i] = string;
		// }
		// break;
		// }
		// if(orderedArray[i].compareTo(string) < 0) {
		// insert[i] = orderedArray[i];
		// }
		// }
		//
		//
		// for (int i = 0; i < insert.length -1; i++) {
		// System.out.println(insert[i]);
		// }

		for (int i = 0; i < insert.length - 1; i++) {
			insert[0] = string;
			insert[i + 1] = orderedArray[i];

			System.out.println(insert[i]);
		}

		return insert;
	}

}
