"""
Kata Level: 7.

Implement a function that accepts 3 integer values a, b, c. 
The function should return true if a triangle can be built 
with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
"""

# Mi solución en Python.

def is_triangle(a, b, c):
    if a < b+c and b < a+c and c < a+b:
        return True
    return False

# Solución simplificada.

def is_triangle(a, b, c):
    return (a<b+c) and (b<a+c) and (c<a+b)