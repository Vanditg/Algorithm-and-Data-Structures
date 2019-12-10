import java.util.*;

public class Insertion extends Sorting {
	public void sort(int array []) {
		int arr = array.length;
		for (int i = 1; i < arr; ++i) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}