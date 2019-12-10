def bubble(array):
	arr = len(array)
	
	for i in range(arr):
		for j in range(0, arr - i - 1):
			if array[j] > array[j+1]:
				array[j], array[j+1] = array[j+1], array[j]

def print(array):
	arr = len(array)
	
	print("[")
	for i in range(arr):
		if i == arr - 1:
			print(array[i] + "]")
		else:
			print(array[i] + ", ")