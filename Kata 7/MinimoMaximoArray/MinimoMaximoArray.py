"""
Kata Level: 7.

Story:
Ben has a very simple idea to make some profit: he buys something and sells it again.
Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
Instead, he's going to buy it for the lowest possible price and sell it at the highest.

Task:
Write a function that returns both the minimum and maximum number of the given list/array.

Examples (Input --> Output) 
[1,2,3,4,5] --> [1,5]
[2334454,5] --> [5,2334454]
[1]         --> [1,1]

Remarks:
All arrays or lists will always have at least one element, so you don't need to check the length.
Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
"""

# Solución propia Python.
	
def min_max(lst):
    min, max = lst[0], lst[0]
    for number in lst:
        if number < min:
            min = number
        if number > max:
            max = number
    return [min, max]

# Solución comunidad 1.

def min_max(lst):
    return [min(lst), max(lst)]

# Solución de la comunidad 2.

def min_max(lst):
    lst.sort()
    tempor = [lst[0],lst[-1]]
    return tempor

print(min_max([1, 2, 3, 4, 5]))
print(min_max([23456, 5]))
print(min_max([1, 1]))