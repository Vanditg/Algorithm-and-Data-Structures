from Insertion import insertion
from printArray import printArray

array = [45, 22, 43]

print("Before Sorting:", end = "")
printArray(array)

insertion(array)

print(end = "\n")
print("After Sorting: ", end = "")
printArray(array)