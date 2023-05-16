"""
Kata Level: 7.

DESCRIPTION:
Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.

Examples:

"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
"""

# Mi solución en Python.

def reverse_words(text):
    list = text.split(" ")
    result = ""
    for word in list:
        result += word[::-1] + " "
    return result[:len(result)-1]

# Solución en la comunidad 1.

def reverse_words_community(str):
    return ' '.join(s[::-1] for s in str.split(' '))

print(reverse_words("This is an example!"))