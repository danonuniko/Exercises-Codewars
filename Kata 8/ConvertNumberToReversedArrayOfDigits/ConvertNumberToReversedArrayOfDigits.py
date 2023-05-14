"""
Kata Level: 8.

Convert number to reversed array of digits.
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
"""

# Mi solución en Python.

def digitize(n):
    lista = []
    n = str(n)[::-1]
    for digit in n:
        lista.append(int(digit))
    return lista

# Solución de la comunidad 1.

def digitize_community(n):
    return [int(x) for x in str(n)[::-1]]
    #Otra opción viable.	return [int(x) for x in reversed(str(n))]

print(digitize(35231))