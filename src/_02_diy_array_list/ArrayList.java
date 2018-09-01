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

		for (int i = size; i > 0; i--) {
			elements[i] = elements[i + 1];
			if (i == j) {
				break;
			}
		}
		elements[j] = c;
		size += 1;
	}

}
