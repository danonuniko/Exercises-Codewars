"""
Kata Level: 7.

Your task is to make a function that can take any non-negative integer as an argument and return it 
with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:

Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
"""

# Mi solución en Python.

def descending_order(num):
    list = []
    for digit in str(num):
        list.append(digit)		#Añado los valores en formato str en vez de int porque el método join me obliga a interactuar con str.
    list.sort(reverse = True)
    return int("".join(list))

# Solución de la comunidad optimizada.

def Descending_Order(num):
    return int("".join(sorted(str(num), reverse=True)))
