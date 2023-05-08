"""
Kata Level: 7.

Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
"""

# Solución propia en Python. No hace falta utilizar replace de las vocales con acento porque en inglés no se utilizan.

def get_count(sentence):
    vocals = "aeiouáéíóúü"
    number_vocals = 0
    for letter in sentence.lower():
        if letter in vocals:
            number_vocals += 1
    return number_vocals

print(get_count("hola que tal estás"))