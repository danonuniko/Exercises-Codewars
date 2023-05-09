"""
Kata Level: 6.

The goal of this exercise is to convert a string to a new string where each character 
in the new string is "(" if that character appears only once in the original string, or ")" 
if that character appears more than once in the original string. 
Ignore capitalization when determining if a character is a duplicate.

Examples:
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
"""

# Solución propia en Python.
	
def duplicate_encode(word):
    dictionary = {}
    resultado = ""
    for letter in word.lower():
        if letter in dictionary:
            dictionary[letter] += 1
        else:
            dictionary[letter] = 1
    for letter in word.lower():
        if dictionary[letter] == 1:
            resultado += "("
        else:
            resultado += ")"
    return resultado


# Solución de la comunidad.
	
def duplicate_encode(word):
    return "".join(["(" if word.lower().count(c) == 1 else ")" for c in word.lower()])

print(duplicate_encode("din"))
print(duplicate_encode("recede"))
print(duplicate_encode("Success"))
print(duplicate_encode("(( @"))