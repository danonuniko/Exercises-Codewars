"""
Kata Level: 5.

The marketing team is spending way too much time typing in hashtags.
Let's help them with our own Hashtag Generator!

Here's the deal:

It must start with a hashtag (#).
All words must have their first letter capitalized.
If the final result is longer than 140 chars it must return false.
If the input or the result is an empty string it must return false.

Examples:
" Hello there thanks for trying my Kata"  =>  "#HelloThereThanksForTryingMyKata"
"    Hello     World   "                  =>  "#HelloWorld"
""                                        =>  false
"""

# Mi solución en Python.

def generate_hashtag(s):
    result = "#"
    
    #Es la forma que tengo de evitar los espacios en blanco extras en el intermedio (entre las palabras). 
    #Al utilizar split, si hay más de un espacio juntos no elimino los dos, y al usar strip() no me supera todos los test.
    #Solución: utilizar split, y todas las palabras que sean unicamente espacios en blanco las evito.
    Characters_to_avoid = " " 
    
    if s == "":
        return False
    for word in s.split(" "):
        if word in " ":
            continue
        else:
            result += word[0].upper() + word[1:].lower()
    if len(result) > 140:
        return False
    return result

# Solución de la comunidad. No entiendo porque funciona sin tener en cuenta espacios intermedios únicamente utilizando capitalize.

def generate_hashtag_community1(s):
    output = "#"
    
    for word in s.split():
        output += word.capitalize()
    
    return False if (len(s) == 0 or len(output) > 140) else output

# Solución de la comunidad 2.

def generate_hashtag_community2(s): 
    return '#' +s.strip().title().replace(' ','') if 0<len(s)<=140 else False

print(generate_hashtag(" Hello there thanks for trying my Kata"))
print(generate_hashtag("    Hello     World   "))
