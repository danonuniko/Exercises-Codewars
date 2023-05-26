"""
Kata Level: 6.

Write a function that takes an integer as input, and returns the number of bits 
that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case.
"""

# Mi solución en Python.

def count_bits(n):
    binario = bin(n)
    unos = 0
    for digit in binario:
        if digit == "1":
            unos += 1
    return unos

# Solución de la comunidad 1.

def countBits(n):
    return bin(n).count("1")
    return bin(n)[2:].count('1')	#Esta es otra opción, teniendo en cuenta que el resultado de bin(4) == 0b1010 (los dos primeros dígitos son 0b).

print(count_bits(1234))