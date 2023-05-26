"""
Kata Level: 6.

Task:

You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples:

[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
"""

# Mi solución en Python.

def sort_array(source_array):
    numeros_impares = []
    for number in source_array:
        if number % 2:
            numeros_impares.append(number)
    numeros_impares.sort()
    for i, number in enumerate(source_array):
        if number % 2:
            source_array[i] = numeros_impares[0]
            numeros_impares = numeros_impares[1:]
    return source_array

print(sort_array([9, 8, 7, 6, 5, 4, 3, 2, 1, 0]))