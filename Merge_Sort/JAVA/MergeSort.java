public class MergeSort extends Sorting {
	public void merge(int array [], int left, int mid, int right) {
		int a = mid - left + 1;
		int b = right - mid;

		int Left [] = new int [a];
		int Right [] = new int [b];

		for (int i = 0; i < a; ++i) {
			Left[i] = array[left + i];			
		}

		for (int j = 0; j < b; ++j) {
			Right[j] = array[mid + 1 + j];
		}

		int i = 0; 
		int j = 0;
		int k = left;

		while (i < a && j < b) {
			if(Left[i] <= Right[j]) {
				array[k] = Left[i];
				i++;
			} else {
				array[k] = Right[j];
				j++;
			}
			k++;
		}

		while(i < a) {
			array[k] = Left[i];
			i++;
			k++;
		} 

		while(j < b) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}

	public void sort(int array [], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(array, left, mid);
			sort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	
}