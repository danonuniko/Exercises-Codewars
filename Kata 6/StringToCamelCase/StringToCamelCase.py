"""
Kata Level: 6.

Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"""

def to_camel_case(text):
    lista = text.replace("-", " ").replace("_", " ").split(" ")
    result = lista[0]
    for word in lista[1:]:
        result += word[0].upper() + word[1:].lower()
    return result

print(to_camel_case("hola_que-TAL-Estas"))
print(to_camel_case("the-stealth-warrior"))
print(to_camel_case("The_Stealth_Warrior"))