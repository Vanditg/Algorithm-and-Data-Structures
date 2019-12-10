#include <iostream>

using namespace std;

void swap(int *xp, int *yp) {
	int tmp = *xp;
	*xp = *yp;
	*yp = tmp;
} 

void insertion(int array[], int size) {
	for (int i = 1; i < size; ++i) {
		int key = array[i];
		int j = i - 1;
		
		while( j >= 0 && array[j] > key) {
			array[j + 1] = array[j];
			j = j - 1;
		}
		array[j+1] = key;
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
	insertion(array, size);
	printArray(array, size);
}