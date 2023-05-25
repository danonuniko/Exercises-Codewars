"""
Kata Level: 6.

Task:

Yesterday you found some shoes in your room. Each shoe is described by two values:
type indicates if it's a left or a right shoe;
size is the size of the shoe.

Your task is to check whether it is possible to pair the shoes you found in such a way that each pair consists of a right and a left shoe of an equal size.

Example:

For:

shoes = [[0, 21], 
		[1, 23], 
		[1, 21], 
		[0, 23]]
the output should be true;

For:

shoes = [[0, 21], 
	    [1, 23], 
        [1, 21], 
        [1, 23]]
the output should be false.

Input/Output:
[input] 2D integer array shoes
Array of shoes. Each shoe is given in the format [type, size], where type is either 0 or 1 for left and right respectively, and size is a positive integer.

Constraints: 2 ≤ shoes.length ≤ 50,  1 ≤ shoes[i][1] ≤ 100.

[output] a boolean value:	true if it is possible to pair the shoes, false otherwise.
"""

"""
Mi solución en Python. 
	Con diccionarios no sirve porque no podemos almacenar a la vez la información de los dos zapatos 
	(las llaves deben ser únicas, y se repetiría el 0-1 de derecha-izquierda o la talla del zapato).
"""	
def pair_of_shoes(shoes):
    r = []
    l = []
    for list in shoes:
        if list[0] == 0:
            r.append(list[1])
        else:
            l.append(list[1])
    if len(r) != len(l):					#retornamos falso si las listas son de diferente tamaño.
        return False
        
                                            #podemos sustituir todo el código de abajo por 		return sorted(l) == sorted(r) (visto en una solución de la comunidad).
    for number in r:						#retornamos falso si algun elemento de los zapatos derechos no está en la lista de zapatos izquierdos, y viceversa.
        if number not in l:
            return False
    for number in l:
        if number not in r:
            return False
    return True

print(pair_of_shoes([[0, 21], [1, 23], [1, 21], [0, 23]]))
print(pair_of_shoes([[0, 21], [1, 23], [1, 21], [1, 23]]))