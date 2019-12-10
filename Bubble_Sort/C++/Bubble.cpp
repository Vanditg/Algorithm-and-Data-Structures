#include <iostream>

using namespace std;

void swap(int *xp, int *yp) {
	int tmp = *xp;
	*xp = *yp;
	*yp = tmp;
} 

void bubble(int array[], int size) {
	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - i - 1; j++) {
			if (array[j] > array[j + 1]) {
				swap(&array[j], &array[j + 1]);
			}
		}
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
	bubble(array, size);
	printArray(array, size);
}