"""
Kata Level: 6.

DESCRIPTION:
Write a function that takes a string of braces, and determines if the order of the braces is valid. 
It should return true if the string is valid, and false if it's invalid.

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples:

"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
"""

# Mi solución con Python.

def valid_braces(string):
    list = []
    for letter in string:
        if letter is '(' or letter is '[' or letter is '{':
            list.append(letter)
        else:
            if len(list) == 0 or letter is ')' and list.pop() != '(' or letter is ']' and list.pop() != '[' or letter is '}' and list.pop() != '{':
                return False
    if len(list) != 0:
        return False
    return True

# Solución de la comunidad 1.

def validBraces(s):
    while '{}' in s or '()' in s or '[]' in s:
        s=s.replace('{}','')
        s=s.replace('[]','')
        s=s.replace('()','')
    return s==''

print(valid_braces("(){}[]"))
print(valid_braces("([{}])"))
print(valid_braces("(}"))
print(valid_braces("[(])"))
print(valid_braces("[({})](]"))