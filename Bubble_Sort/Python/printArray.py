def printArray(array):
	arr = len(array)
	
	print("[", end = "")
	for i in range(arr):
		if i == arr - 1:
			print(array[i], end = "")
		else:
			print(array[i], end = ",")
	print("]", end = "")