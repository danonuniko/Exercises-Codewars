"""
Kata Level: 7.

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.
"""

# Mi solución en Python.

def accum(s):
    result = ""
    for i, letter in enumerate(s.lower()):
        result += letter.upper()
        while i > 0:
            result += letter
            i -= 1
        result += "-"
    return result[:-1]

# Solución de la comunidad 1.

def accum_community(s):
    return '-'.join(c.upper() + c.lower() * i for i, c in enumerate(s))

print(accum("abcd"))
print(accum("RqaEzty"))