"""
Kata Level: 6.

Write Number in Expanded Form
You will be given a number and you will need to return it as a string in Expanded Form. 

For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

NOTE: All numbers will be whole numbers greater than 0.
"""

# Mi solución en Python.
def expanded_form(num):
    result = ""
    contador = len(str(num))
    while num > 0:
        operacion = (num // 10**(contador-1)) * 10**(contador-1)
        if operacion != 0:
            result += str(operacion) + " + "
        num -= operacion
        contador -= 1
    return result[:-3]

print(expanded_form(12))
print(expanded_form(42))
print(expanded_form(70304))