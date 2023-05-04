"""
Kata Level: 8.

Given an array of integers, return a new array with each value doubled.

For example:     [1, 2, 3] --> [2, 4, 6]
"""

def maps(a):
    for i, value in enumerate(a):
        a[i] *= 2
    return a

print(maps([2, 4, 6]))
print(maps([5, 10, 30]))

