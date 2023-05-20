"""
Kata Level: 6.

Write a function that takes in a string of one or more words, and returns the same string, 
but with all five or more letter words reversed (Just like the name of this Kata). 
Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords("Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords("This is a test") => returns "This is a test" 
spinWords("This is another test" )=> returns "This is rehtona test"
"""

# Solución propia en Python.

def spin_words(sentence):
    list = sentence.split(" ")
    lista_resultado = []
    for word in list:
        if len(word) > 4:
            lista_resultado.append(word[::-1])
        else:
            lista_resultado.append(word)
    return " ".join(lista_resultado)

print(spin_words("Hey fellow warriors"))
print(spin_words("This is a test"))
print(spin_words("This is another test"))