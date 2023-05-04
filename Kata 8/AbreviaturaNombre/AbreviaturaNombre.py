"""
Kata Level: 8.

Write a function to convert a name into initials. 
This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H
patrick feeney => P.F
"""

# Mi solución en Python.

def abbrev_name(name):
    list = name.split(" ")
    result = ""
    for word in list:
        result += word[0].upper() + "."
    return result[:-1]

# Solución de la comunidad.

def abbrevName(name):
    first, last = name.upper().split(' ')
    return first[0] + '.' + last[0]

print(abbrev_name("Sam Harris"))
print(abbrev_name("patrick kaley"))
print(abbrev_name("daniel collado vizcarro"))