"""
Kata Level: 6.

You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples:
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
"""

# Mi solución en Python.

def find_outlier(integers):
    evens, odds = 0, 0
    for number in integers:
        if number % 2 == 0:
            evens += 1
        else:
            odds += 1
    for number in integers:
        if number % 2 == 0 and evens == 1:
            return number
        elif number % 2 and odds == 1:
            return number

# Solución de la comunidad 1.

def find_outlier(int):
    odds = [x for x in int if x%2!=0]
    evens= [x for x in int if x%2==0]
    return odds[0] if len(odds)<len(evens) else evens[0]

# Solución de la comunidad 2.

def find_outlier(integers):
    listEven = []
    listOdd = []
    for n in integers:
        if n % 2 == 0:
            listEven.append(n)
        else:
            listOdd.append(n)
            
    if len(listEven) == 1:
        return listEven[0]
    else:
        return listOdd[0]