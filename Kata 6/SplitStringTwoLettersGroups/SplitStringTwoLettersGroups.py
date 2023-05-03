"""
Kata Level: 6.

Complete the solution so that it splits the string into pairs of two characters. 
If the string contains an odd number of characters then it should replace 
the missing second character of the final pair with an underscore ('_').
Example
'abc' =>  ['ab', 'c_']
'abcdef' => ['ab', 'cd', 'ef']
"""

# Mi solución
def solution(s):
    lista = []
    if(len(s) % 2 == 0):
        for i, letter in enumerate(s):
            if(i % 2 == 0):
                lista.append(s[i:i+2])
        return lista
    else:
        a = s[-1]
        s = s[:-1]
        for i, letter in enumerate(s):
            if i % 2 == 0:
                lista.append(s[i] + s[i+1])
        lista.append(a + "_")
        return lista

# Solución de la comunidad.

def solution(s):
    result = []
    if len(s) % 2:
        s += '_'
    for i in range(0, len(s), 2):
        result.append(s[i:i+2])
    return result

print(solution("abc"))
print(solution("abcdef"))
print(solution("I Love Pizza"))
