public class Selection extends Sorting {
	public void sort(int array []) {
		int arr = array.length;
		for (int i = 0; i < arr - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}

			int tmp = array[min_index];
			array[min_index] = array[i];
			array[i] = tmp;
		}
	}
}