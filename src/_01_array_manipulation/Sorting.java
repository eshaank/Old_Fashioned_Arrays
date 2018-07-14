package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		boolean swap = false;
		do {
			swap = false;
			for (int i = 0; i < testArray.length - 1; i++) {
				
				if (testArray[i].compareTo(testArray[i + 1]) > 0) {
					swap = true;
					String temp = testArray[i];
					testArray[i] = testArray[i + 1];
					testArray[i + 1] = temp;
				} 

				System.out.println(testArray[i]);
			}
		} while (swap);

	
		
	}
}
