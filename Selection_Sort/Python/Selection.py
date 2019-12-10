def selection(array):
	arr = len(array)
	
	for i in range(arr):
		min_index = i
		for j in range(i + 1, arr):
			if array[min_index] > array[j]:
				min_index = j
		array[i], array[min_index] = array[min_index], array[i]
		
def print(array):
	arr = len(array)
	
	print("[")
	for i in range(arr):
		if i == arr - 1:
			print(array[i] + "]")
		else:
			print(array[i] + ", ")	