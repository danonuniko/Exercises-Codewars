"""
Kata Level: 5.

The rgb function is incomplete. Complete it so that passing in RGB decimal 
values will result in a hexadecimal representation being returned. 
Valid decimal values for RGB are 0 - 255. 
Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, 
the shorthand with 3 will not work here.

The following are examples of expected output values:

RgbToHex.rgb(255, 255, 255) // returns FFFFFF
RgbToHex.rgb(255, 255, 300) // returns FFFFFF
RgbToHex.rgb(0, 0, 0)       // returns 000000
RgbToHex.rgb(148, 0, 211)   // returns 9400D3
"""

# Mi solución en Python.

def rgb(r, g, b):
    result = ""
    dictionary = {0: "0", 1: "1", 2: "2", 3: "3", 4: "4", 5: "5", 6: "6", 7: "7", 8: "8", 9: "9", 10: "A", 11: "B", 12: "C", 13: "D", 14: "E", 15: "F"}
    if r <= 0:
        result += "00"
    elif r >= 255:
        result += "FF"
    else:
        result += dictionary[r // 16] + dictionary[(r / 16 - r // 16)*16]
    if g <= 0:
        result += "00"
    elif g >= 255:
        result += "FF"
    else:
        result += dictionary[g // 16] + dictionary[(g / 16 - g // 16)*16]
    if b <= 0:
        result += "00"
    elif b >= 255:
        result += "FF"
    else:
        result += dictionary[b // 16] + dictionary[(b / 16 - b // 16)*16]
    return result

# Solución de la comunidad.

def hex_con(color):
    hex_dict = '0123456789ABCDEF'
    d1 = color//16
    d2 = color%16
    if d1 > 15:
        d1 = 15
        d2 = 15
    elif d1 < 0:
        d1 = 0
        d2 = 0
    return str(hex_dict[d1]) + str(hex_dict[d2])

def rgb(r, g, b):  
    R = hex_con(r)
    G = hex_con(g)
    B = hex_con(b)
    return R+G+B