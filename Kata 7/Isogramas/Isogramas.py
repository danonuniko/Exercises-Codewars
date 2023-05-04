"""
Kata Level: 7.

An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
Implement a function that determines whether a string that contains only letters is an isogram. 
Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" = true
isIsogram "moOse" = false
isIsogram "aba" = false
"""

# Mi solución en Python.

def is_isogram(string):
    dic = {}
    for i in string.lower():
        if i in dic:
            return False
        else:
            dic[i] = 1
    return True

# Solución de la comunidad en Python.
	
def is_isogram1(string):
    return len(string) == len(set(string.lower()))

print(is_isogram("Dermatoglyphics"))
print(is_isogram("moOse"))
print(is_isogram("aba"))