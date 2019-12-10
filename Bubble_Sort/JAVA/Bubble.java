import java.util.*;

public class Bubble extends Sorting {
	public void sort(int array []) {
		int arr = array.length;
		for (int i = 0; i < arr - 1; i++) {
			for (int j = 0; j < arr - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
}