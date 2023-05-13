"""
Kata Level: 5.

When working with color values it can sometimes be useful to 
extract the individual red, green, and blue (RGB) component values for a color. 
Implement a function that meets these requirements:

Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933").
Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255

Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")

Example:
"#FF9933" --> {r: 255, g: 153, b: 51}
"""

# Mi solución en Python.

def hex_string_to_RGB(hex_string): 
    opciones = {"0": 0, "1": 1, "2": 2, "3": 3, "4": 4, "5": 5, "6": 6, "7": 7, "8": 8, "9": 9, "A": 10, "B": 11, "C": 12, "D": 13, "E": 14, "F": 15}
    dictionary = {}
    hex_string = hex_string.upper()
    dictionary['r'] = opciones[hex_string[1]]*16 + opciones[hex_string[2]]
    dictionary['g'] = opciones[hex_string[3]]*16 + opciones[hex_string[4]]
    dictionary['b'] = opciones[hex_string[5]]*16 + opciones[hex_string[6]]
    return dictionary

# Solución de la comunidad en Python. El 16 implica la base en que se trabaja.

def hex_string_to_RGB(hex): 
    return {'r': int(hex[1:3],16),'g': int(hex[3:5],16), 'b': int(hex[5:7],16)}

print(hex_string_to_RGB("#FF9933"))