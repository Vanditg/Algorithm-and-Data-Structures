def insertion(array):
	arr = len(array)
	
	for i in range(1, arr):
		key = array[i]
		j = i - 1
		while j >= 0 and key < array[j]:
			array[j+1] = array[j]
			j -= 1
		array[j + 1] = key

def print(array):
	arr = len(array)
	
	print("[")
	for i in range(arr):
		if i == arr - 1:
			print(array[i] + "]")
		else:
			print(array[i] + ", ")