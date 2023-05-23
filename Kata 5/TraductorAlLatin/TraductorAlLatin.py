"""
Kata Level: 5.

Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
Leave punctuation marks untouched.

Examples:

pig_it('Pig latin is cool') # igPay atinlay siay oolcay
pig_it('Hello world !')     # elloHay orldway !
"""

# Mi solución en Python.

def pig_it(text):
    lista = text.split(" ")
    result = []
    signos_puntuacion = ",.;:?¿¡!"
    for word in lista:
        if word not in signos_puntuacion:
            result.append(word[1:] + word[0] + "ay")
        else:
            result.append(word)
    return " ".join(result)

# Solución de la comunidad 1.

def pig_it_community(text):
    lst = text.split()
    return ' '.join( [word[1:] + word[:1] + 'ay' if word.isalpha() else word for word in lst])

print(pig_it('Pig latin is cool'))
print(pig_it('Hello World !'))
print(pig_it('Hello World!'))       #No entiendo como querría que se comportara el programa cuando el signo de puntuación no se encuentra sin espacios en blanco de forma aislada.