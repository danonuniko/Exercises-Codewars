"""
Kata Level: 5.

Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. 
The function should return true if the string is valid, and false if it's invalid.

Examples:

"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true

Constraints:
0 <= input.length <= 100

Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
"""

"""
Mi solución. Creamos una lista que actuara como una pila FIFO (First In First Out).
    Recorremos el string. Si el caracter es de apertura ( lo añadiremos a la lista. 
	Si el caracter es de cierre ) extraemos el ultimo elemento de la lista que debería ser su caracter de apertura correspondiente.
	Dará falso si recorremos un caracter de cierre y la lista está vacía o si terminamos de recorrer el string y la lista no está completamente vacía.
"""

def valid_parentheses(string):
    lista = []
    for letter in string:
        if letter == "(":
            lista.append(letter)
        elif letter == ")":
            if len(lista) == 0:
                return False
            else:
                lista.pop()
    if len(lista) == 0:
        return True
    else:
        return False

def valid_parentheses_community(string):
    cnt = 0
    for char in string:
        if char == '(': cnt += 1
        if char == ')': cnt -= 1
        if cnt < 0: return False
    return True if cnt == 0 else False

print(valid_parentheses("()"))
print(valid_parentheses(")(()))"))
print(valid_parentheses("("))
print(valid_parentheses("(())((()())())"))    