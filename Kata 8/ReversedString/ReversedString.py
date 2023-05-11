"""
Kata Level: 8.

Complete the solution so that it reverses the string passed into it.

Examples: 

'world'  =>  'dlrow'
'word'   =>  'drow'
"""

# Mi solución en Python.

def solution(string):
    return string[::-1]
    
    #How it works:
        #for char in range(len(string)-1,-1,-1):
            #return string[char]        Diría que más que return deberíamos añadirlo a un string auxiliar, y una vez acabe el for devolver dicho string auxiliar.

print(solution("world"))
print(solution("word"))