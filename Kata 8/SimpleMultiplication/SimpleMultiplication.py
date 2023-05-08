"""
Kata Level: 8.

This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
"""

# Solución en Python.
	
def simple_multiplication(number) :
    if number % 2 == 0: 
        return number*8 
    else: 
        return number*9

#Solución de la comunidad 1.
	
def simple_multiplication(number) :
    return number * 9 if number % 2 else number * 8

print(simple_multiplication(4))
print(simple_multiplication(5))