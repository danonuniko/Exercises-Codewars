"""
Kata Level: 8.

Summation: 
Write a program that finds the summation of every number from 1 to num. 
The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
"""

# Mi solución en Python.

def summation(num):
    resultado = 0
    for i in range(num+1):
        resultado += i
    return resultado

# Solución más simplificada.

def summation(num):
    return sum(range(1,num+1))