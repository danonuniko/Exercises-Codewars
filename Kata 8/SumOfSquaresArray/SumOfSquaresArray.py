"""
Kata Level: 8.

Complete the square sum function so that it squares 
each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
"""

# Mi solución en Python.

def square_sum(numbers):
    resultado = 0
    for number in numbers:
        resultado += number**2
    return resultado

# Solución simplificada.

def square_sum(numbers):
    return sum(x ** 2 for x in numbers)

print(square_sum([1, 2, 3]))
