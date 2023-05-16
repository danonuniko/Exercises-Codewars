"""
Kata Level: 7.

DESCRIPTION:
Check to see if a string has the same amount of 'x's and 'o's. 
The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
"""

# Mi solución en Python.
	
def xo(s):
    contador = 0
    for letter in s:
        if letter == 'x' or letter == 'X':
            contador += 1
        elif letter == 'o' or letter == 'O':
            contador -= 1
    return contador == 0

# Solución de la comunidad 1.

def xo_community(s):
    s = s.lower()
    return s.count('x') == s.count('o')

print(xo("ooxx"))
print(xo("xooxx"))
print(xo("ooxXm"))
print(xo("zpzpzpp"))
print(xo("zzoo"))