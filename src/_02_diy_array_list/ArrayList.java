package _02_diy_array_list;

public class ArrayList<T> {
	// public static void main(String[] args) {
	// ArrayList<String> h = new ArrayList<>();
	//
	// }

	Object[] elements = new Object[15];

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
		Object[] new_array = new Object[size + 1];
		for (int i = 0; i < j; i++) {
			new_array[i] = elements[i];
		}
		new_array[j] = c;
		for (int i = j + 1; i < new_array.length; i++) {
			new_array[i] = elements[i - 1];
		}
		elements = new_array;
	}

	public void remove(int r) {

		Object[] new_array = new Object[size + 1];
		for (int i = 0; i < r; i++) {
			new_array[i] = elements[i];
		}
		new_array[r] = null;
		for (int i = r + 1; i < new_array.length; i++) {
			new_array[i - 1] = elements[i];
		}
		elements = new_array;
	}

	public boolean contains(String string) {

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null) {

				if (elements[i].equals(string)) {
					return true;
				}
			}
		}

		return false;
	}

}
