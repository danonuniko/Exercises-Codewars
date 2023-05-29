"""
Kata Level: 6.

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'

(Use the English alphabet with 26 letters!)
"""

# Mi solución en Python.
def find_missing_letter(chars):
    minusculas = "abcdefghijklmnopqrstuvwxyz"
    mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    if(chars[0]) in minusculas:
        indice_inicial = minusculas.index(chars[0])
        lista = minusculas[indice_inicial : indice_inicial + len(chars) + 1]
        for i in lista:
            if i not in chars:
                return i
    else:
        indice_inicial = mayusculas.index(chars[0])
        lista = mayusculas[indice_inicial : indice_inicial + len(chars) + 1]
        for i in lista:
            if i not in chars:
                return i

# Mi solución en Python optimizando el código.
def find_missing_letter(chars):
    letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    indice_inicial = letras.index(chars[0])
    lista = letras[indice_inicial: indice_inicial + len(chars) + 1]
    for i in lista:
        if i not in chars:
            return i

# Solución de la comunidad optimizando mi código.
def find_missing_letter(input):
    alphabet = list("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
    start = alphabet.index(input[0])
    for i in range(len(input)):
        if not input[i] == alphabet[start+i]:
            return alphabet[start+i]