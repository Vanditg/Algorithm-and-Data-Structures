from Selection import selection
from printArray import printArray

array = [45, 22, 43]

print("Before Sorting:", end = "")
printArray(array)

selection(array)

print(end = "\n")
print("After Sorting: ", end = "")
printArray(array)