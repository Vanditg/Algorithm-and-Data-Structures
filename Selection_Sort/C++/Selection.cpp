#include <iostream>

using namespace std;

void swap(int *xp, int *yp) {
	int tmp = *xp;
	*xp = *yp;
	*yp = tmp;
} 

void selection(int array[], int size) {
	for (int i = 0; i < size - 1; i++) {
		int min_index = i;
		for (int j = i + 1; j < size; j++) {
			if (array[min_index] > array[j]) {
				min_index = j;
			}
		}
		swap(&array[min_index], &array[i]);
	}
}

void printArray(int array[], int size) { 
	for (int i = 0; i < size; i++) {
		cout << array[i] << " ";
	} 
	cout << endl;
}

int main(void) {
	int array[] = { 45, 22, 67, 55 };
	int size = sizeof(array) / sizeof(array[0]);
	selection(array, size);
	printArray(array, size);
}