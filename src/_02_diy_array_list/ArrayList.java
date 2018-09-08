package _02_diy_array_list;

public class ArrayList<T> {
	// public static void main(String[] args) {
	// ArrayList<String> h = new ArrayList<>();
	//
	// }

	Object[] elements = new Object[10];

	int size = 0;

	int size() {
		return size;
	}

	void add(T a) {
		elements[size] = a;
		size++;
	}

	public T get(int g) {
		return (T) elements[g];

	}

	void set(int i, T s) {
		elements[i] = s;

	}

	void addAt(int j, T c) {
		size = size+ 1 ;
//		elements[j] = c;
		for(int i = size; i >= 0; i--) {
			System.out.println(elements[i] + ", " + i);
			
			
			

			
			
		}	
		
	}

}
