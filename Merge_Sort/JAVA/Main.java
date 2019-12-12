public class Main {
	public static void main(String[] args) {
		MergeSort bub = new MergeSort();
		int array [] = {31, 41, 59, 26, 41, 58};
		bub.sort(array, 0, array.length - 1);
		bub.printArray(array);
	}
}