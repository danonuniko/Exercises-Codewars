"""
Kata Level: 6.

Given an array of integers, find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.

Examples:

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
"""

# Mi solución en Python.
	
def find_it(seq):
    dictionary = {}
    for digit in seq:
        if digit in dictionary:
            dictionary[digit] += 1
        else:
            dictionary[digit] = 1
    for element in dictionary:
        if dictionary[element] % 2:
            return element

# Solución de la comunidad optimizada.

def find_it_community(seq):
    for i in seq:
        if seq.count(i)%2 != 0:
            return i

print(find_it([7]))
print(find_it([0]))
print(find_it([1,1,2]))
print(find_it([0,1,0,1,0]))
print(find_it([1,2,2,3,3,3,4,3,3,3,2,2,1]))