"""
Kata Level: 5.

In this example you have to validate if a user input string is alphanumeric. 
The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid).
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9.
No whitespaces / underscore.
"""

# Mi solución en Python.

def alphanumeric(password):
    letters = 'abcdefghijklmnopqrstuvwxyz'
    numbers = '0123456789'
    
    if password == "":
        return False
    
    for letter in password.lower():
        if letter not in letters and letter not in numbers:
            return False
    return True