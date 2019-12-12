import java.util.*;

public abstract class Sorting {

	public abstract void sort(int array [], int left, int right);

	public void printArray(int array []) {
		int arr = array.length;
		System.out.print("[");
		for (int i = 0; i < arr; i++) {
			if (i == arr-1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}