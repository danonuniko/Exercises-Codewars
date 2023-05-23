"""
Kata Level: 8.

DESCRIPTION:	Simple, remove the spaces from the string, then return the resultant string.
"""

def no_space(x):
    return "".join(x.split(" "))
    # return x.replace(' ' ,'')     sería otra opción.

print(no_space("hola que tal estás"))