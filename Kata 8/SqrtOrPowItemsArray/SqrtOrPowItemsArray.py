"""
Kata Level: 8.

Write a method, that will get an integer array as parameter and will process every number from this array.

Return a new array with processing every number of the input-array like this:
If the number has an integer square root, take this, otherwise square the number.

Example:		[4,3,9,7,2,1] -> [2,9,3,49,4,1]

Notes:	The input array will always contain only positive numbers, and will never be empty or null.
"""

# Mi solución en Python.
def square_or_square_root(arr):
    result = []
    for number in arr:
        if str(number**0.5)[-2:] == '.0':
            result.append(int(number**0.5))
        else:
            result.append(number**2)
    return result

# Solución de la comunidad 1.
def square_or_square_root_community(arr):
    result = []
    for x in arr:
        root = x**0.5
        if root.is_integer():
            result.append(root)
        else:
            result.append(x*x)
    return result

# Solución de la comunidad 2.
from math import sqrt

def square_or_square_root_community2(arr):
    return [int(sqrt(a)) if sqrt(a) % 1 == 0 else a ** 2 for a in arr]

print(square_or_square_root([4, 3, 9, 7, 2, 1]))