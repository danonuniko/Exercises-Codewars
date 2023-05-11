"""
Kata Level: 8.

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
"""

# Mi solución en Python.

def positive_sum(arr):
    result = 0
    for number in arr:
        if number > 0:
            result += number
    return result

# Solución de la comunidad 1.

def positive_sum(arr):
    return sum(x for x in arr if x > 0)

print(positive_sum([1, 2, 3, -4]))