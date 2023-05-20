"""
Kata Level: 6.

There is an array with some numbers. All numbers are equal except for one. Try to find it!

find_uniq([ 1, 1, 1, 2, 1, 1 ]) == 2
find_uniq([ 0, 0, 0.55, 0, 0 ]) == 0.55

It’s guaranteed that array contains at least 3 numbers.
The tests contain some very huge arrays, so think about performance.
"""

def find_uniq(arr):
    dictionary = {}
    for num in arr:
        if num in dictionary:
            dictionary[num] += 1
        else:
            dictionary[num] = 1
    return list(dictionary.keys())[list(dictionary.values()).index(1)]

def find_uniq_community(arr):
    s = set(arr)
    for e in s:
        if arr.count(e) == 1:
            return e

def find_uniq_community_2(arr):
    a = sorted(arr)
    return a[0] if a[0] != a[1] else a[-1]

print(find_uniq([ 1, 1, 1, 2, 1, 1 ]))
print(find_uniq([ 0, 0, 0.55, 0, 0 ]))